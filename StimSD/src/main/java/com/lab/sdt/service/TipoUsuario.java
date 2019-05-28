package com.sysdt.lock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sysdt.lock.dao.UsuarioMapper;
import com.sysdt.lock.dto.UserDTO;
import com.sysdt.lock.dto.UsuarioDTO;
import com.sysdt.lock.model.Cliente;
import com.sysdt.lock.model.Usuario;
import com.sysdt.lock.model.UsuarioExample;
import com.sysdt.lock.model.UsuarioExample.Criteria;
import com.sysdt.lock.util.Constantes;
import com.sysdt.lock.util.Security;
import com.sysdt.lock.model.Historico;
@Service
@Transactional
public class UsuarioService {

	@Autowired
	private UsuarioMapper usuarioMapper;
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private HistoricoService historicoService;
	@Autowired
	private DependenciaService dependenciaService;

	
	public UsuarioDTO obtenerYvalidarUsuario(String username, String password, String nombreCliente) throws Exception{
		Usuario usuario = obtenerUsuarioPorUsername(username);
		if(usuario == null){
			throw new Exception("Usuario invalido");
		}else if(!usuario.getEnabled()){
			throw new Exception("Su cuenta esta deshabilitada. Por favor consulte a su proveedor");
		}else if(!usuario.getPassword().contentEquals(password)){
			throw new Exception("Password incorrecto");
		}
		Cliente cliente = clienteService.obtenerClientePorId(usuario.getIdCliente());
		if(!cliente.getNombre().contentEquals(nombreCliente.toUpperCase())){
			throw new Exception("Usuario no coincide con url");
		}
		return copiarUsuario(usuario, cliente);
	}
	
	public boolean guardarUsuario(Usuario usuario)throws Exception{
		usuarioTrim(usuario);
		Usuario user = obtenerUsuarioPorUsername(usuario.getUsername());
		if(user == null){
			insertarUsuario(usuario);
			return true;
		}
		return false;
	}
	
	public void cambiarEstadoCuentasDeUsuario(int idCliente, boolean estado) throws Exception{
		UsuarioExample exUser = new UsuarioExample();
		exUser.createCriteria().andIdClienteEqualTo(idCliente);
		Usuario user = new Usuario();
		user.setEnabled(estado);
		usuarioMapper.updateByExampleSelective(user, exUser);
	}
	
	public List<Usuario> obtenerUsuariosPorIdClienteSinPass(int idCliente){
		List<Usuario> usuarios = obtenerUsuariosPorIdCliente(idCliente);
		for (Usuario usuario : usuarios) {
			usuario.setPassword("");
		}
		return usuarios;
	}
	
	public List<Usuario> obtenerOperadoresPorSupervisor(String username){
		List<String> dependencias = dependenciaService.obtenerDependenciasPorUsuario(username, Constantes.TipoUsuario.SUPERVISOR);
		dependencias.add(username);
		UsuarioExample exUser = new UsuarioExample();
		exUser.createCriteria().andUsernameIn(dependencias);
		return usuarioMapper.selectByExample(exUser);
	}
	
	public List<String> obtenerListaDependientesPorTipo(int idCliente, int idTipoUsuario){
		List<String> dependientes = new ArrayList<String>();
		UsuarioExample exUser = new UsuarioExample();
		Criteria criteria = exUser.createCriteria();
		criteria.andIdClienteEqualTo(idCliente);
		if(idTipoUsuario == Constantes.TipoUsuario.SUPERVISOR){
			criteria.andIdTipousuarioEqualTo(Constantes.TipoUsuario.OPERADOR);
		}else if(idTipoUsuario == Constantes.TipoUsuario.OPERADOR){
			criteria.andIdTipousuarioEqualTo(Constantes.TipoUsuario.SUPERVISOR);
		}
		List<Usuario> usuarios = usuarioMapper.selectByExample(exUser);
		for (Usuario usuario : usuarios) {
			dependientes.add(usuario.getUsername());
		}
		return dependientes;
	}
	
	public String generarCodigo(String clave1, String clave2, String username, String placasEco, int idCliente, int idChofer)throws Exception {
		String codigo = "";
		try {
			Security security = new Security();
			codigo = security.convertirLlaves(clave1, clave2, idCliente);
			if(codigo != null){
				historicoService.insertarHistoricoDeGeneracionCodigos(username, placasEco, true, idChofer,"("+clave1+")("+clave2+")");
			}else{
				historicoService.insertarHistoricoDeGeneracionCodigos(username, placasEco, false, idChofer,"("+clave1+")("+clave2+")");
				codigo = "Generar nuevo codigo";
			}
		} catch (Exception e) {
			historicoService.insertarHistoricoDeGeneracionCodigos(username, placasEco, false, idChofer,"("+clave1+")("+clave2+")");
			throw new Exception("Error al convertir claves");
		}
		
		return codigo;
	}
	
	public String obtenHistoricoCodigo() throws Exception{
		String dato_c = null;
		//Historico historico = new Historico();
		Historico h_uno = historicoService.obtenCodigoPosicion("(jorge)(amaya)",2);
		 
		dato_c =h_uno.getId()+"";
		if(h_uno.getId()>=0){
			historicoService.modificar_historico_latLog(h_uno.getId(),"987","695",true);
		}
		return dato_c;
	}
	//********* METODOS SIMPLES ******///
	
	private void insertarUsuario(Usuario usuario) throws Exception{
		usuario.setEnabled(true);
		usuarioMapper.insert(usuario);
	}
	
	public void actualizarUsuario(Usuario usuario) throws Exception{
		usuarioMapper.updateByPrimaryKey(usuario);
	}
	
	public void eliminarUsuarioPorId(String username) throws Exception{
		usuarioMapper.deleteByPrimaryKey(username);
	}
	
	public List<Usuario> obtenerUsuariosPorIdCliente(int idCliente){
		UsuarioExample exUser = new UsuarioExample();
		exUser.createCriteria().andIdClienteEqualTo(idCliente);
	//	exUser.setOrderByClause("username ASC");
		return usuarioMapper.selectByExample(exUser);
	}
	
	private Usuario obtenerUsuarioPorUsername(String username){
		return usuarioMapper.selectByPrimaryKey(username);
	}	
	
	private UsuarioDTO copiarUsuario(Usuario usuario, Cliente cliente){
		UsuarioDTO usuarioDTO =new UsuarioDTO();
		usuarioDTO.setIdCliente(usuario.getIdCliente());
		usuarioDTO.setEnabled(usuario.getEnabled());
		usuarioDTO.setIdTipousuario(usuario.getIdTipousuario());
		usuarioDTO.setUsername(usuario.getUsername());
		usuarioDTO.setCliente(cliente);
		return usuarioDTO;
	}
	
	private void usuarioTrim(Usuario usuario){
		usuario.setUsername(usuario.getUsername().trim().toLowerCase());
		usuario.setPassword(usuario.getPassword().trim().toLowerCase());
	}
	
}
