package com.lab.sdt.model;

import java.util.ArrayList;
import java.util.List;

public class GradoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table grado
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table grado
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table grado
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grado
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public GradoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grado
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grado
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grado
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grado
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grado
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grado
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grado
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
     * This method corresponds to the database table grado
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
     * This method corresponds to the database table grado
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grado
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
     * This class corresponds to the database table grado
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

        public Criteria andIdgradoIsNull() {
            addCriterion("idGrado is null");
            return (Criteria) this;
        }

        public Criteria andIdgradoIsNotNull() {
            addCriterion("idGrado is not null");
            return (Criteria) this;
        }

        public Criteria andIdgradoEqualTo(Integer value) {
            addCriterion("idGrado =", value, "idgrado");
            return (Criteria) this;
        }

        public Criteria andIdgradoNotEqualTo(Integer value) {
            addCriterion("idGrado <>", value, "idgrado");
            return (Criteria) this;
        }

        public Criteria andIdgradoGreaterThan(Integer value) {
            addCriterion("idGrado >", value, "idgrado");
            return (Criteria) this;
        }

        public Criteria andIdgradoGreaterThanOrEqualTo(Integer value) {
            addCriterion("idGrado >=", value, "idgrado");
            return (Criteria) this;
        }

        public Criteria andIdgradoLessThan(Integer value) {
            addCriterion("idGrado <", value, "idgrado");
            return (Criteria) this;
        }

        public Criteria andIdgradoLessThanOrEqualTo(Integer value) {
            addCriterion("idGrado <=", value, "idgrado");
            return (Criteria) this;
        }

        public Criteria andIdgradoIn(List<Integer> values) {
            addCriterion("idGrado in", values, "idgrado");
            return (Criteria) this;
        }

        public Criteria andIdgradoNotIn(List<Integer> values) {
            addCriterion("idGrado not in", values, "idgrado");
            return (Criteria) this;
        }

        public Criteria andIdgradoBetween(Integer value1, Integer value2) {
            addCriterion("idGrado between", value1, value2, "idgrado");
            return (Criteria) this;
        }

        public Criteria andIdgradoNotBetween(Integer value1, Integer value2) {
            addCriterion("idGrado not between", value1, value2, "idgrado");
            return (Criteria) this;
        }

        public Criteria andGradoIsNull() {
            addCriterion("grado is null");
            return (Criteria) this;
        }

        public Criteria andGradoIsNotNull() {
            addCriterion("grado is not null");
            return (Criteria) this;
        }

        public Criteria andGradoEqualTo(String value) {
            addCriterion("grado =", value, "grado");
            return (Criteria) this;
        }

        public Criteria andGradoNotEqualTo(String value) {
            addCriterion("grado <>", value, "grado");
            return (Criteria) this;
        }

        public Criteria andGradoGreaterThan(String value) {
            addCriterion("grado >", value, "grado");
            return (Criteria) this;
        }

        public Criteria andGradoGreaterThanOrEqualTo(String value) {
            addCriterion("grado >=", value, "grado");
            return (Criteria) this;
        }

        public Criteria andGradoLessThan(String value) {
            addCriterion("grado <", value, "grado");
            return (Criteria) this;
        }

        public Criteria andGradoLessThanOrEqualTo(String value) {
            addCriterion("grado <=", value, "grado");
            return (Criteria) this;
        }

        public Criteria andGradoLike(String value) {
            addCriterion("grado like", value, "grado");
            return (Criteria) this;
        }

        public Criteria andGradoNotLike(String value) {
            addCriterion("grado not like", value, "grado");
            return (Criteria) this;
        }

        public Criteria andGradoIn(List<String> values) {
            addCriterion("grado in", values, "grado");
            return (Criteria) this;
        }

        public Criteria andGradoNotIn(List<String> values) {
            addCriterion("grado not in", values, "grado");
            return (Criteria) this;
        }

        public Criteria andGradoBetween(String value1, String value2) {
            addCriterion("grado between", value1, value2, "grado");
            return (Criteria) this;
        }

        public Criteria andGradoNotBetween(String value1, String value2) {
            addCriterion("grado not between", value1, value2, "grado");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table grado
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
     * This class corresponds to the database table grado
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