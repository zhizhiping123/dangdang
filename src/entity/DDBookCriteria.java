package entity;

import java.util.ArrayList;
import java.util.List;

public class DDBookCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DDBookCriteria() {
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

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andPublishingIsNull() {
            addCriterion("publishing is null");
            return (Criteria) this;
        }

        public Criteria andPublishingIsNotNull() {
            addCriterion("publishing is not null");
            return (Criteria) this;
        }

        public Criteria andPublishingEqualTo(String value) {
            addCriterion("publishing =", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingNotEqualTo(String value) {
            addCriterion("publishing <>", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingGreaterThan(String value) {
            addCriterion("publishing >", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingGreaterThanOrEqualTo(String value) {
            addCriterion("publishing >=", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingLessThan(String value) {
            addCriterion("publishing <", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingLessThanOrEqualTo(String value) {
            addCriterion("publishing <=", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingLike(String value) {
            addCriterion("publishing like", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingNotLike(String value) {
            addCriterion("publishing not like", value, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingIn(List<String> values) {
            addCriterion("publishing in", values, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingNotIn(List<String> values) {
            addCriterion("publishing not in", values, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingBetween(String value1, String value2) {
            addCriterion("publishing between", value1, value2, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishingNotBetween(String value1, String value2) {
            addCriterion("publishing not between", value1, value2, "publishing");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Long value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Long value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Long value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Long value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Long value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Long> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Long> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Long value1, Long value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Long value1, Long value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andWordNumberIsNull() {
            addCriterion("word_number is null");
            return (Criteria) this;
        }

        public Criteria andWordNumberIsNotNull() {
            addCriterion("word_number is not null");
            return (Criteria) this;
        }

        public Criteria andWordNumberEqualTo(String value) {
            addCriterion("word_number =", value, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberNotEqualTo(String value) {
            addCriterion("word_number <>", value, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberGreaterThan(String value) {
            addCriterion("word_number >", value, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberGreaterThanOrEqualTo(String value) {
            addCriterion("word_number >=", value, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberLessThan(String value) {
            addCriterion("word_number <", value, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberLessThanOrEqualTo(String value) {
            addCriterion("word_number <=", value, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberLike(String value) {
            addCriterion("word_number like", value, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberNotLike(String value) {
            addCriterion("word_number not like", value, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberIn(List<String> values) {
            addCriterion("word_number in", values, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberNotIn(List<String> values) {
            addCriterion("word_number not in", values, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberBetween(String value1, String value2) {
            addCriterion("word_number between", value1, value2, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWordNumberNotBetween(String value1, String value2) {
            addCriterion("word_number not between", value1, value2, "wordNumber");
            return (Criteria) this;
        }

        public Criteria andWhichEdtionIsNull() {
            addCriterion("which_edtion is null");
            return (Criteria) this;
        }

        public Criteria andWhichEdtionIsNotNull() {
            addCriterion("which_edtion is not null");
            return (Criteria) this;
        }

        public Criteria andWhichEdtionEqualTo(String value) {
            addCriterion("which_edtion =", value, "whichEdtion");
            return (Criteria) this;
        }

        public Criteria andWhichEdtionNotEqualTo(String value) {
            addCriterion("which_edtion <>", value, "whichEdtion");
            return (Criteria) this;
        }

        public Criteria andWhichEdtionGreaterThan(String value) {
            addCriterion("which_edtion >", value, "whichEdtion");
            return (Criteria) this;
        }

        public Criteria andWhichEdtionGreaterThanOrEqualTo(String value) {
            addCriterion("which_edtion >=", value, "whichEdtion");
            return (Criteria) this;
        }

        public Criteria andWhichEdtionLessThan(String value) {
            addCriterion("which_edtion <", value, "whichEdtion");
            return (Criteria) this;
        }

        public Criteria andWhichEdtionLessThanOrEqualTo(String value) {
            addCriterion("which_edtion <=", value, "whichEdtion");
            return (Criteria) this;
        }

        public Criteria andWhichEdtionLike(String value) {
            addCriterion("which_edtion like", value, "whichEdtion");
            return (Criteria) this;
        }

        public Criteria andWhichEdtionNotLike(String value) {
            addCriterion("which_edtion not like", value, "whichEdtion");
            return (Criteria) this;
        }

        public Criteria andWhichEdtionIn(List<String> values) {
            addCriterion("which_edtion in", values, "whichEdtion");
            return (Criteria) this;
        }

        public Criteria andWhichEdtionNotIn(List<String> values) {
            addCriterion("which_edtion not in", values, "whichEdtion");
            return (Criteria) this;
        }

        public Criteria andWhichEdtionBetween(String value1, String value2) {
            addCriterion("which_edtion between", value1, value2, "whichEdtion");
            return (Criteria) this;
        }

        public Criteria andWhichEdtionNotBetween(String value1, String value2) {
            addCriterion("which_edtion not between", value1, value2, "whichEdtion");
            return (Criteria) this;
        }

        public Criteria andTotalPageIsNull() {
            addCriterion("total_page is null");
            return (Criteria) this;
        }

        public Criteria andTotalPageIsNotNull() {
            addCriterion("total_page is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPageEqualTo(String value) {
            addCriterion("total_page =", value, "totalPage");
            return (Criteria) this;
        }

        public Criteria andTotalPageNotEqualTo(String value) {
            addCriterion("total_page <>", value, "totalPage");
            return (Criteria) this;
        }

        public Criteria andTotalPageGreaterThan(String value) {
            addCriterion("total_page >", value, "totalPage");
            return (Criteria) this;
        }

        public Criteria andTotalPageGreaterThanOrEqualTo(String value) {
            addCriterion("total_page >=", value, "totalPage");
            return (Criteria) this;
        }

        public Criteria andTotalPageLessThan(String value) {
            addCriterion("total_page <", value, "totalPage");
            return (Criteria) this;
        }

        public Criteria andTotalPageLessThanOrEqualTo(String value) {
            addCriterion("total_page <=", value, "totalPage");
            return (Criteria) this;
        }

        public Criteria andTotalPageLike(String value) {
            addCriterion("total_page like", value, "totalPage");
            return (Criteria) this;
        }

        public Criteria andTotalPageNotLike(String value) {
            addCriterion("total_page not like", value, "totalPage");
            return (Criteria) this;
        }

        public Criteria andTotalPageIn(List<String> values) {
            addCriterion("total_page in", values, "totalPage");
            return (Criteria) this;
        }

        public Criteria andTotalPageNotIn(List<String> values) {
            addCriterion("total_page not in", values, "totalPage");
            return (Criteria) this;
        }

        public Criteria andTotalPageBetween(String value1, String value2) {
            addCriterion("total_page between", value1, value2, "totalPage");
            return (Criteria) this;
        }

        public Criteria andTotalPageNotBetween(String value1, String value2) {
            addCriterion("total_page not between", value1, value2, "totalPage");
            return (Criteria) this;
        }

        public Criteria andPrintTimeIsNull() {
            addCriterion("print_time is null");
            return (Criteria) this;
        }

        public Criteria andPrintTimeIsNotNull() {
            addCriterion("print_time is not null");
            return (Criteria) this;
        }

        public Criteria andPrintTimeEqualTo(Long value) {
            addCriterion("print_time =", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotEqualTo(Long value) {
            addCriterion("print_time <>", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeGreaterThan(Long value) {
            addCriterion("print_time >", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("print_time >=", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeLessThan(Long value) {
            addCriterion("print_time <", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeLessThanOrEqualTo(Long value) {
            addCriterion("print_time <=", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeIn(List<Long> values) {
            addCriterion("print_time in", values, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotIn(List<Long> values) {
            addCriterion("print_time not in", values, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeBetween(Long value1, Long value2) {
            addCriterion("print_time between", value1, value2, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotBetween(Long value1, Long value2) {
            addCriterion("print_time not between", value1, value2, "printTime");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("isbn is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("isbn is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("isbn =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("isbn <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("isbn >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("isbn >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("isbn <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("isbn <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("isbn like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("isbn not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("isbn in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("isbn not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("isbn between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("isbn not between", value1, value2, "isbn");
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