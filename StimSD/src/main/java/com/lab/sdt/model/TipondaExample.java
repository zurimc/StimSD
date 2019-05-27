package com.lab.sdt.model;

import java.util.ArrayList;
import java.util.List;

public class TipondaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tiponda
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tiponda
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tiponda
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiponda
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public TipondaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiponda
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiponda
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiponda
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiponda
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiponda
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiponda
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiponda
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
     * This method corresponds to the database table tiponda
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
     * This method corresponds to the database table tiponda
     *
     * @mbg.generated Mon May 20 14:45:29 CDT 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiponda
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
     * This class corresponds to the database table tiponda
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

        public Criteria andIdtipondaIsNull() {
            addCriterion("idTipOnda is null");
            return (Criteria) this;
        }

        public Criteria andIdtipondaIsNotNull() {
            addCriterion("idTipOnda is not null");
            return (Criteria) this;
        }

        public Criteria andIdtipondaEqualTo(Integer value) {
            addCriterion("idTipOnda =", value, "idtiponda");
            return (Criteria) this;
        }

        public Criteria andIdtipondaNotEqualTo(Integer value) {
            addCriterion("idTipOnda <>", value, "idtiponda");
            return (Criteria) this;
        }

        public Criteria andIdtipondaGreaterThan(Integer value) {
            addCriterion("idTipOnda >", value, "idtiponda");
            return (Criteria) this;
        }

        public Criteria andIdtipondaGreaterThanOrEqualTo(Integer value) {
            addCriterion("idTipOnda >=", value, "idtiponda");
            return (Criteria) this;
        }

        public Criteria andIdtipondaLessThan(Integer value) {
            addCriterion("idTipOnda <", value, "idtiponda");
            return (Criteria) this;
        }

        public Criteria andIdtipondaLessThanOrEqualTo(Integer value) {
            addCriterion("idTipOnda <=", value, "idtiponda");
            return (Criteria) this;
        }

        public Criteria andIdtipondaIn(List<Integer> values) {
            addCriterion("idTipOnda in", values, "idtiponda");
            return (Criteria) this;
        }

        public Criteria andIdtipondaNotIn(List<Integer> values) {
            addCriterion("idTipOnda not in", values, "idtiponda");
            return (Criteria) this;
        }

        public Criteria andIdtipondaBetween(Integer value1, Integer value2) {
            addCriterion("idTipOnda between", value1, value2, "idtiponda");
            return (Criteria) this;
        }

        public Criteria andIdtipondaNotBetween(Integer value1, Integer value2) {
            addCriterion("idTipOnda not between", value1, value2, "idtiponda");
            return (Criteria) this;
        }

        public Criteria andTipondaIsNull() {
            addCriterion("tipOnda is null");
            return (Criteria) this;
        }

        public Criteria andTipondaIsNotNull() {
            addCriterion("tipOnda is not null");
            return (Criteria) this;
        }

        public Criteria andTipondaEqualTo(Integer value) {
            addCriterion("tipOnda =", value, "tiponda");
            return (Criteria) this;
        }

        public Criteria andTipondaNotEqualTo(Integer value) {
            addCriterion("tipOnda <>", value, "tiponda");
            return (Criteria) this;
        }

        public Criteria andTipondaGreaterThan(Integer value) {
            addCriterion("tipOnda >", value, "tiponda");
            return (Criteria) this;
        }

        public Criteria andTipondaGreaterThanOrEqualTo(Integer value) {
            addCriterion("tipOnda >=", value, "tiponda");
            return (Criteria) this;
        }

        public Criteria andTipondaLessThan(Integer value) {
            addCriterion("tipOnda <", value, "tiponda");
            return (Criteria) this;
        }

        public Criteria andTipondaLessThanOrEqualTo(Integer value) {
            addCriterion("tipOnda <=", value, "tiponda");
            return (Criteria) this;
        }

        public Criteria andTipondaIn(List<Integer> values) {
            addCriterion("tipOnda in", values, "tiponda");
            return (Criteria) this;
        }

        public Criteria andTipondaNotIn(List<Integer> values) {
            addCriterion("tipOnda not in", values, "tiponda");
            return (Criteria) this;
        }

        public Criteria andTipondaBetween(Integer value1, Integer value2) {
            addCriterion("tipOnda between", value1, value2, "tiponda");
            return (Criteria) this;
        }

        public Criteria andTipondaNotBetween(Integer value1, Integer value2) {
            addCriterion("tipOnda not between", value1, value2, "tiponda");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tiponda
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
     * This class corresponds to the database table tiponda
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