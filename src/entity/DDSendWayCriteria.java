package entity;

import java.util.ArrayList;
import java.util.List;

public class DDSendWayCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DDSendWayCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIsCloseIsNull() {
            addCriterion("is_close is null");
            return (Criteria) this;
        }

        public Criteria andIsCloseIsNotNull() {
            addCriterion("is_close is not null");
            return (Criteria) this;
        }

        public Criteria andIsCloseEqualTo(Boolean value) {
            addCriterion("is_close =", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseNotEqualTo(Boolean value) {
            addCriterion("is_close <>", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseGreaterThan(Boolean value) {
            addCriterion("is_close >", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_close >=", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseLessThan(Boolean value) {
            addCriterion("is_close <", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseLessThanOrEqualTo(Boolean value) {
            addCriterion("is_close <=", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseIn(List<Boolean> values) {
            addCriterion("is_close in", values, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseNotIn(List<Boolean> values) {
            addCriterion("is_close not in", values, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseBetween(Boolean value1, Boolean value2) {
            addCriterion("is_close between", value1, value2, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_close not between", value1, value2, "isClose");
            return (Criteria) this;
        }

        public Criteria andSendWayIsNull() {
            addCriterion("send_way is null");
            return (Criteria) this;
        }

        public Criteria andSendWayIsNotNull() {
            addCriterion("send_way is not null");
            return (Criteria) this;
        }

        public Criteria andSendWayEqualTo(String value) {
            addCriterion("send_way =", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayNotEqualTo(String value) {
            addCriterion("send_way <>", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayGreaterThan(String value) {
            addCriterion("send_way >", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayGreaterThanOrEqualTo(String value) {
            addCriterion("send_way >=", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayLessThan(String value) {
            addCriterion("send_way <", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayLessThanOrEqualTo(String value) {
            addCriterion("send_way <=", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayLike(String value) {
            addCriterion("send_way like", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayNotLike(String value) {
            addCriterion("send_way not like", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayIn(List<String> values) {
            addCriterion("send_way in", values, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayNotIn(List<String> values) {
            addCriterion("send_way not in", values, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayBetween(String value1, String value2) {
            addCriterion("send_way between", value1, value2, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayNotBetween(String value1, String value2) {
            addCriterion("send_way not between", value1, value2, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendDescIsNull() {
            addCriterion("send_desc is null");
            return (Criteria) this;
        }

        public Criteria andSendDescIsNotNull() {
            addCriterion("send_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSendDescEqualTo(String value) {
            addCriterion("send_desc =", value, "sendDesc");
            return (Criteria) this;
        }

        public Criteria andSendDescNotEqualTo(String value) {
            addCriterion("send_desc <>", value, "sendDesc");
            return (Criteria) this;
        }

        public Criteria andSendDescGreaterThan(String value) {
            addCriterion("send_desc >", value, "sendDesc");
            return (Criteria) this;
        }

        public Criteria andSendDescGreaterThanOrEqualTo(String value) {
            addCriterion("send_desc >=", value, "sendDesc");
            return (Criteria) this;
        }

        public Criteria andSendDescLessThan(String value) {
            addCriterion("send_desc <", value, "sendDesc");
            return (Criteria) this;
        }

        public Criteria andSendDescLessThanOrEqualTo(String value) {
            addCriterion("send_desc <=", value, "sendDesc");
            return (Criteria) this;
        }

        public Criteria andSendDescLike(String value) {
            addCriterion("send_desc like", value, "sendDesc");
            return (Criteria) this;
        }

        public Criteria andSendDescNotLike(String value) {
            addCriterion("send_desc not like", value, "sendDesc");
            return (Criteria) this;
        }

        public Criteria andSendDescIn(List<String> values) {
            addCriterion("send_desc in", values, "sendDesc");
            return (Criteria) this;
        }

        public Criteria andSendDescNotIn(List<String> values) {
            addCriterion("send_desc not in", values, "sendDesc");
            return (Criteria) this;
        }

        public Criteria andSendDescBetween(String value1, String value2) {
            addCriterion("send_desc between", value1, value2, "sendDesc");
            return (Criteria) this;
        }

        public Criteria andSendDescNotBetween(String value1, String value2) {
            addCriterion("send_desc not between", value1, value2, "sendDesc");
            return (Criteria) this;
        }

        public Criteria andSendFeeIsNull() {
            addCriterion("send_fee is null");
            return (Criteria) this;
        }

        public Criteria andSendFeeIsNotNull() {
            addCriterion("send_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSendFeeEqualTo(Double value) {
            addCriterion("send_fee =", value, "sendFee");
            return (Criteria) this;
        }

        public Criteria andSendFeeNotEqualTo(Double value) {
            addCriterion("send_fee <>", value, "sendFee");
            return (Criteria) this;
        }

        public Criteria andSendFeeGreaterThan(Double value) {
            addCriterion("send_fee >", value, "sendFee");
            return (Criteria) this;
        }

        public Criteria andSendFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("send_fee >=", value, "sendFee");
            return (Criteria) this;
        }

        public Criteria andSendFeeLessThan(Double value) {
            addCriterion("send_fee <", value, "sendFee");
            return (Criteria) this;
        }

        public Criteria andSendFeeLessThanOrEqualTo(Double value) {
            addCriterion("send_fee <=", value, "sendFee");
            return (Criteria) this;
        }

        public Criteria andSendFeeIn(List<Double> values) {
            addCriterion("send_fee in", values, "sendFee");
            return (Criteria) this;
        }

        public Criteria andSendFeeNotIn(List<Double> values) {
            addCriterion("send_fee not in", values, "sendFee");
            return (Criteria) this;
        }

        public Criteria andSendFeeBetween(Double value1, Double value2) {
            addCriterion("send_fee between", value1, value2, "sendFee");
            return (Criteria) this;
        }

        public Criteria andSendFeeNotBetween(Double value1, Double value2) {
            addCriterion("send_fee not between", value1, value2, "sendFee");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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