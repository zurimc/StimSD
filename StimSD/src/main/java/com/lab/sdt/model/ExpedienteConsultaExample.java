package com.lab.sdt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ExpedienteConsultaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public ExpedienteConsultaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdexpeconsulIsNull() {
            addCriterion("idExpeConsul is null");
            return (Criteria) this;
        }

        public Criteria andIdexpeconsulIsNotNull() {
            addCriterion("idExpeConsul is not null");
            return (Criteria) this;
        }

        public Criteria andIdexpeconsulEqualTo(Integer value) {
            addCriterion("idExpeConsul =", value, "idexpeconsul");
            return (Criteria) this;
        }

        public Criteria andIdexpeconsulNotEqualTo(Integer value) {
            addCriterion("idExpeConsul <>", value, "idexpeconsul");
            return (Criteria) this;
        }

        public Criteria andIdexpeconsulGreaterThan(Integer value) {
            addCriterion("idExpeConsul >", value, "idexpeconsul");
            return (Criteria) this;
        }

        public Criteria andIdexpeconsulGreaterThanOrEqualTo(Integer value) {
            addCriterion("idExpeConsul >=", value, "idexpeconsul");
            return (Criteria) this;
        }

        public Criteria andIdexpeconsulLessThan(Integer value) {
            addCriterion("idExpeConsul <", value, "idexpeconsul");
            return (Criteria) this;
        }

        public Criteria andIdexpeconsulLessThanOrEqualTo(Integer value) {
            addCriterion("idExpeConsul <=", value, "idexpeconsul");
            return (Criteria) this;
        }

        public Criteria andIdexpeconsulIn(List<Integer> values) {
            addCriterion("idExpeConsul in", values, "idexpeconsul");
            return (Criteria) this;
        }

        public Criteria andIdexpeconsulNotIn(List<Integer> values) {
            addCriterion("idExpeConsul not in", values, "idexpeconsul");
            return (Criteria) this;
        }

        public Criteria andIdexpeconsulBetween(Integer value1, Integer value2) {
            addCriterion("idExpeConsul between", value1, value2, "idexpeconsul");
            return (Criteria) this;
        }

        public Criteria andIdexpeconsulNotBetween(Integer value1, Integer value2) {
            addCriterion("idExpeConsul not between", value1, value2, "idexpeconsul");
            return (Criteria) this;
        }

        public Criteria andFechaconsultaIsNull() {
            addCriterion("fechaConsulta is null");
            return (Criteria) this;
        }

        public Criteria andFechaconsultaIsNotNull() {
            addCriterion("fechaConsulta is not null");
            return (Criteria) this;
        }

        public Criteria andFechaconsultaEqualTo(Date value) {
            addCriterionForJDBCDate("fechaConsulta =", value, "fechaconsulta");
            return (Criteria) this;
        }

        public Criteria andFechaconsultaNotEqualTo(Date value) {
            addCriterionForJDBCDate("fechaConsulta <>", value, "fechaconsulta");
            return (Criteria) this;
        }

        public Criteria andFechaconsultaGreaterThan(Date value) {
            addCriterionForJDBCDate("fechaConsulta >", value, "fechaconsulta");
            return (Criteria) this;
        }

        public Criteria andFechaconsultaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechaConsulta >=", value, "fechaconsulta");
            return (Criteria) this;
        }

        public Criteria andFechaconsultaLessThan(Date value) {
            addCriterionForJDBCDate("fechaConsulta <", value, "fechaconsulta");
            return (Criteria) this;
        }

        public Criteria andFechaconsultaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechaConsulta <=", value, "fechaconsulta");
            return (Criteria) this;
        }

        public Criteria andFechaconsultaIn(List<Date> values) {
            addCriterionForJDBCDate("fechaConsulta in", values, "fechaconsulta");
            return (Criteria) this;
        }

        public Criteria andFechaconsultaNotIn(List<Date> values) {
            addCriterionForJDBCDate("fechaConsulta not in", values, "fechaconsulta");
            return (Criteria) this;
        }

        public Criteria andFechaconsultaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechaConsulta between", value1, value2, "fechaconsulta");
            return (Criteria) this;
        }

        public Criteria andFechaconsultaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechaConsulta not between", value1, value2, "fechaconsulta");
            return (Criteria) this;
        }

        public Criteria andIdexpedienteIsNull() {
            addCriterion("idExpediente is null");
            return (Criteria) this;
        }

        public Criteria andIdexpedienteIsNotNull() {
            addCriterion("idExpediente is not null");
            return (Criteria) this;
        }

        public Criteria andIdexpedienteEqualTo(Integer value) {
            addCriterion("idExpediente =", value, "idexpediente");
            return (Criteria) this;
        }

        public Criteria andIdexpedienteNotEqualTo(Integer value) {
            addCriterion("idExpediente <>", value, "idexpediente");
            return (Criteria) this;
        }

        public Criteria andIdexpedienteGreaterThan(Integer value) {
            addCriterion("idExpediente >", value, "idexpediente");
            return (Criteria) this;
        }

        public Criteria andIdexpedienteGreaterThanOrEqualTo(Integer value) {
            addCriterion("idExpediente >=", value, "idexpediente");
            return (Criteria) this;
        }

        public Criteria andIdexpedienteLessThan(Integer value) {
            addCriterion("idExpediente <", value, "idexpediente");
            return (Criteria) this;
        }

        public Criteria andIdexpedienteLessThanOrEqualTo(Integer value) {
            addCriterion("idExpediente <=", value, "idexpediente");
            return (Criteria) this;
        }

        public Criteria andIdexpedienteIn(List<Integer> values) {
            addCriterion("idExpediente in", values, "idexpediente");
            return (Criteria) this;
        }

        public Criteria andIdexpedienteNotIn(List<Integer> values) {
            addCriterion("idExpediente not in", values, "idexpediente");
            return (Criteria) this;
        }

        public Criteria andIdexpedienteBetween(Integer value1, Integer value2) {
            addCriterion("idExpediente between", value1, value2, "idexpediente");
            return (Criteria) this;
        }

        public Criteria andIdexpedienteNotBetween(Integer value1, Integer value2) {
            addCriterion("idExpediente not between", value1, value2, "idexpediente");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table expediente_consulta
     *
     * @mbg.generated do_not_delete_during_merge Mon May 20 14:45:29 CDT 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table expediente_consulta
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}