package com.lab.sdt.model;

import java.util.ArrayList;
import java.util.List;

public class MaterialExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table material
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table material
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table material
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public MaterialExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
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
     * This method corresponds to the database table material
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
     * This method corresponds to the database table material
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material
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
     * This class corresponds to the database table material
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

        public Criteria andIdmaterialIsNull() {
            addCriterion("idMaterial is null");
            return (Criteria) this;
        }

        public Criteria andIdmaterialIsNotNull() {
            addCriterion("idMaterial is not null");
            return (Criteria) this;
        }

        public Criteria andIdmaterialEqualTo(Integer value) {
            addCriterion("idMaterial =", value, "idmaterial");
            return (Criteria) this;
        }

        public Criteria andIdmaterialNotEqualTo(Integer value) {
            addCriterion("idMaterial <>", value, "idmaterial");
            return (Criteria) this;
        }

        public Criteria andIdmaterialGreaterThan(Integer value) {
            addCriterion("idMaterial >", value, "idmaterial");
            return (Criteria) this;
        }

        public Criteria andIdmaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("idMaterial >=", value, "idmaterial");
            return (Criteria) this;
        }

        public Criteria andIdmaterialLessThan(Integer value) {
            addCriterion("idMaterial <", value, "idmaterial");
            return (Criteria) this;
        }

        public Criteria andIdmaterialLessThanOrEqualTo(Integer value) {
            addCriterion("idMaterial <=", value, "idmaterial");
            return (Criteria) this;
        }

        public Criteria andIdmaterialIn(List<Integer> values) {
            addCriterion("idMaterial in", values, "idmaterial");
            return (Criteria) this;
        }

        public Criteria andIdmaterialNotIn(List<Integer> values) {
            addCriterion("idMaterial not in", values, "idmaterial");
            return (Criteria) this;
        }

        public Criteria andIdmaterialBetween(Integer value1, Integer value2) {
            addCriterion("idMaterial between", value1, value2, "idmaterial");
            return (Criteria) this;
        }

        public Criteria andIdmaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("idMaterial not between", value1, value2, "idmaterial");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("material like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("material not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("material not between", value1, value2, "material");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table material
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
     * This class corresponds to the database table material
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