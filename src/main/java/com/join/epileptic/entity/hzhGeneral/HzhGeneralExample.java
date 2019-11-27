package com.join.epileptic.entity.hzhGeneral;

import java.util.ArrayList;
import java.util.List;

public class HzhGeneralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhGeneralExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andTownIsNull() {
            addCriterion("town is null");
            return (Criteria) this;
        }

        public Criteria andTownIsNotNull() {
            addCriterion("town is not null");
            return (Criteria) this;
        }

        public Criteria andTownEqualTo(String value) {
            addCriterion("town =", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotEqualTo(String value) {
            addCriterion("town <>", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThan(String value) {
            addCriterion("town >", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThanOrEqualTo(String value) {
            addCriterion("town >=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThan(String value) {
            addCriterion("town <", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThanOrEqualTo(String value) {
            addCriterion("town <=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLike(String value) {
            addCriterion("town like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotLike(String value) {
            addCriterion("town not like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownIn(List<String> values) {
            addCriterion("town in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotIn(List<String> values) {
            addCriterion("town not in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownBetween(String value1, String value2) {
            addCriterion("town between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotBetween(String value1, String value2) {
            addCriterion("town not between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andSfnameIsNull() {
            addCriterion("sfname is null");
            return (Criteria) this;
        }

        public Criteria andSfnameIsNotNull() {
            addCriterion("sfname is not null");
            return (Criteria) this;
        }

        public Criteria andSfnameEqualTo(String value) {
            addCriterion("sfname =", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotEqualTo(String value) {
            addCriterion("sfname <>", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameGreaterThan(String value) {
            addCriterion("sfname >", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameGreaterThanOrEqualTo(String value) {
            addCriterion("sfname >=", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameLessThan(String value) {
            addCriterion("sfname <", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameLessThanOrEqualTo(String value) {
            addCriterion("sfname <=", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameLike(String value) {
            addCriterion("sfname like", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotLike(String value) {
            addCriterion("sfname not like", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameIn(List<String> values) {
            addCriterion("sfname in", values, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotIn(List<String> values) {
            addCriterion("sfname not in", values, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameBetween(String value1, String value2) {
            addCriterion("sfname between", value1, value2, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotBetween(String value1, String value2) {
            addCriterion("sfname not between", value1, value2, "sfname");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("relation is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("relation =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("relation <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("relation >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("relation >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("relation <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("relation <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("relation like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("relation not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("relation in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("relation not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("relation between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("relation not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andSicknumIsNull() {
            addCriterion("sicknum is null");
            return (Criteria) this;
        }

        public Criteria andSicknumIsNotNull() {
            addCriterion("sicknum is not null");
            return (Criteria) this;
        }

        public Criteria andSicknumEqualTo(String value) {
            addCriterion("sicknum =", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumNotEqualTo(String value) {
            addCriterion("sicknum <>", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumGreaterThan(String value) {
            addCriterion("sicknum >", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumGreaterThanOrEqualTo(String value) {
            addCriterion("sicknum >=", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumLessThan(String value) {
            addCriterion("sicknum <", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumLessThanOrEqualTo(String value) {
            addCriterion("sicknum <=", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumLike(String value) {
            addCriterion("sicknum like", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumNotLike(String value) {
            addCriterion("sicknum not like", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumIn(List<String> values) {
            addCriterion("sicknum in", values, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumNotIn(List<String> values) {
            addCriterion("sicknum not in", values, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumBetween(String value1, String value2) {
            addCriterion("sicknum between", value1, value2, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumNotBetween(String value1, String value2) {
            addCriterion("sicknum not between", value1, value2, "sicknum");
            return (Criteria) this;
        }

        public Criteria andDoctorIsNull() {
            addCriterion("doctor is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIsNotNull() {
            addCriterion("doctor is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorEqualTo(String value) {
            addCriterion("doctor =", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotEqualTo(String value) {
            addCriterion("doctor <>", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThan(String value) {
            addCriterion("doctor >", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("doctor >=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThan(String value) {
            addCriterion("doctor <", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThanOrEqualTo(String value) {
            addCriterion("doctor <=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLike(String value) {
            addCriterion("doctor like", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotLike(String value) {
            addCriterion("doctor not like", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorIn(List<String> values) {
            addCriterion("doctor in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotIn(List<String> values) {
            addCriterion("doctor not in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorBetween(String value1, String value2) {
            addCriterion("doctor between", value1, value2, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotBetween(String value1, String value2) {
            addCriterion("doctor not between", value1, value2, "doctor");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeIsNull() {
            addCriterion("survey_time is null");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeIsNotNull() {
            addCriterion("survey_time is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeEqualTo(String value) {
            addCriterion("survey_time =", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeNotEqualTo(String value) {
            addCriterion("survey_time <>", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeGreaterThan(String value) {
            addCriterion("survey_time >", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("survey_time >=", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeLessThan(String value) {
            addCriterion("survey_time <", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeLessThanOrEqualTo(String value) {
            addCriterion("survey_time <=", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeLike(String value) {
            addCriterion("survey_time like", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeNotLike(String value) {
            addCriterion("survey_time not like", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeIn(List<String> values) {
            addCriterion("survey_time in", values, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeNotIn(List<String> values) {
            addCriterion("survey_time not in", values, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeBetween(String value1, String value2) {
            addCriterion("survey_time between", value1, value2, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeNotBetween(String value1, String value2) {
            addCriterion("survey_time not between", value1, value2, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andLivenumIsNull() {
            addCriterion("livenum is null");
            return (Criteria) this;
        }

        public Criteria andLivenumIsNotNull() {
            addCriterion("livenum is not null");
            return (Criteria) this;
        }

        public Criteria andLivenumEqualTo(String value) {
            addCriterion("livenum =", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumNotEqualTo(String value) {
            addCriterion("livenum <>", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumGreaterThan(String value) {
            addCriterion("livenum >", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumGreaterThanOrEqualTo(String value) {
            addCriterion("livenum >=", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumLessThan(String value) {
            addCriterion("livenum <", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumLessThanOrEqualTo(String value) {
            addCriterion("livenum <=", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumLike(String value) {
            addCriterion("livenum like", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumNotLike(String value) {
            addCriterion("livenum not like", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumIn(List<String> values) {
            addCriterion("livenum in", values, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumNotIn(List<String> values) {
            addCriterion("livenum not in", values, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumBetween(String value1, String value2) {
            addCriterion("livenum between", value1, value2, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumNotBetween(String value1, String value2) {
            addCriterion("livenum not between", value1, value2, "livenum");
            return (Criteria) this;
        }

        public Criteria andSixIsNull() {
            addCriterion("six is null");
            return (Criteria) this;
        }

        public Criteria andSixIsNotNull() {
            addCriterion("six is not null");
            return (Criteria) this;
        }

        public Criteria andSixEqualTo(String value) {
            addCriterion("six =", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotEqualTo(String value) {
            addCriterion("six <>", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixGreaterThan(String value) {
            addCriterion("six >", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixGreaterThanOrEqualTo(String value) {
            addCriterion("six >=", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixLessThan(String value) {
            addCriterion("six <", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixLessThanOrEqualTo(String value) {
            addCriterion("six <=", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixLike(String value) {
            addCriterion("six like", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotLike(String value) {
            addCriterion("six not like", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixIn(List<String> values) {
            addCriterion("six in", values, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotIn(List<String> values) {
            addCriterion("six not in", values, "six");
            return (Criteria) this;
        }

        public Criteria andSixBetween(String value1, String value2) {
            addCriterion("six between", value1, value2, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotBetween(String value1, String value2) {
            addCriterion("six not between", value1, value2, "six");
            return (Criteria) this;
        }

        public Criteria andCitysIsNull() {
            addCriterion("citys is null");
            return (Criteria) this;
        }

        public Criteria andCitysIsNotNull() {
            addCriterion("citys is not null");
            return (Criteria) this;
        }

        public Criteria andCitysEqualTo(String value) {
            addCriterion("citys =", value, "citys");
            return (Criteria) this;
        }

        public Criteria andCitysNotEqualTo(String value) {
            addCriterion("citys <>", value, "citys");
            return (Criteria) this;
        }

        public Criteria andCitysGreaterThan(String value) {
            addCriterion("citys >", value, "citys");
            return (Criteria) this;
        }

        public Criteria andCitysGreaterThanOrEqualTo(String value) {
            addCriterion("citys >=", value, "citys");
            return (Criteria) this;
        }

        public Criteria andCitysLessThan(String value) {
            addCriterion("citys <", value, "citys");
            return (Criteria) this;
        }

        public Criteria andCitysLessThanOrEqualTo(String value) {
            addCriterion("citys <=", value, "citys");
            return (Criteria) this;
        }

        public Criteria andCitysLike(String value) {
            addCriterion("citys like", value, "citys");
            return (Criteria) this;
        }

        public Criteria andCitysNotLike(String value) {
            addCriterion("citys not like", value, "citys");
            return (Criteria) this;
        }

        public Criteria andCitysIn(List<String> values) {
            addCriterion("citys in", values, "citys");
            return (Criteria) this;
        }

        public Criteria andCitysNotIn(List<String> values) {
            addCriterion("citys not in", values, "citys");
            return (Criteria) this;
        }

        public Criteria andCitysBetween(String value1, String value2) {
            addCriterion("citys between", value1, value2, "citys");
            return (Criteria) this;
        }

        public Criteria andCitysNotBetween(String value1, String value2) {
            addCriterion("citys not between", value1, value2, "citys");
            return (Criteria) this;
        }

        public Criteria andXzIsNull() {
            addCriterion("xz is null");
            return (Criteria) this;
        }

        public Criteria andXzIsNotNull() {
            addCriterion("xz is not null");
            return (Criteria) this;
        }

        public Criteria andXzEqualTo(String value) {
            addCriterion("xz =", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotEqualTo(String value) {
            addCriterion("xz <>", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzGreaterThan(String value) {
            addCriterion("xz >", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzGreaterThanOrEqualTo(String value) {
            addCriterion("xz >=", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLessThan(String value) {
            addCriterion("xz <", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLessThanOrEqualTo(String value) {
            addCriterion("xz <=", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLike(String value) {
            addCriterion("xz like", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotLike(String value) {
            addCriterion("xz not like", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzIn(List<String> values) {
            addCriterion("xz in", values, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotIn(List<String> values) {
            addCriterion("xz not in", values, "xz");
            return (Criteria) this;
        }

        public Criteria andXzBetween(String value1, String value2) {
            addCriterion("xz between", value1, value2, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotBetween(String value1, String value2) {
            addCriterion("xz not between", value1, value2, "xz");
            return (Criteria) this;
        }

        public Criteria andNcIsNull() {
            addCriterion("nc is null");
            return (Criteria) this;
        }

        public Criteria andNcIsNotNull() {
            addCriterion("nc is not null");
            return (Criteria) this;
        }

        public Criteria andNcEqualTo(String value) {
            addCriterion("nc =", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcNotEqualTo(String value) {
            addCriterion("nc <>", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcGreaterThan(String value) {
            addCriterion("nc >", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcGreaterThanOrEqualTo(String value) {
            addCriterion("nc >=", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcLessThan(String value) {
            addCriterion("nc <", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcLessThanOrEqualTo(String value) {
            addCriterion("nc <=", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcLike(String value) {
            addCriterion("nc like", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcNotLike(String value) {
            addCriterion("nc not like", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcIn(List<String> values) {
            addCriterion("nc in", values, "nc");
            return (Criteria) this;
        }

        public Criteria andNcNotIn(List<String> values) {
            addCriterion("nc not in", values, "nc");
            return (Criteria) this;
        }

        public Criteria andNcBetween(String value1, String value2) {
            addCriterion("nc between", value1, value2, "nc");
            return (Criteria) this;
        }

        public Criteria andNcNotBetween(String value1, String value2) {
            addCriterion("nc not between", value1, value2, "nc");
            return (Criteria) this;
        }

        public Criteria andNeIsNull() {
            addCriterion("ne is null");
            return (Criteria) this;
        }

        public Criteria andNeIsNotNull() {
            addCriterion("ne is not null");
            return (Criteria) this;
        }

        public Criteria andNeEqualTo(String value) {
            addCriterion("ne =", value, "ne");
            return (Criteria) this;
        }

        public Criteria andNeNotEqualTo(String value) {
            addCriterion("ne <>", value, "ne");
            return (Criteria) this;
        }

        public Criteria andNeGreaterThan(String value) {
            addCriterion("ne >", value, "ne");
            return (Criteria) this;
        }

        public Criteria andNeGreaterThanOrEqualTo(String value) {
            addCriterion("ne >=", value, "ne");
            return (Criteria) this;
        }

        public Criteria andNeLessThan(String value) {
            addCriterion("ne <", value, "ne");
            return (Criteria) this;
        }

        public Criteria andNeLessThanOrEqualTo(String value) {
            addCriterion("ne <=", value, "ne");
            return (Criteria) this;
        }

        public Criteria andNeLike(String value) {
            addCriterion("ne like", value, "ne");
            return (Criteria) this;
        }

        public Criteria andNeNotLike(String value) {
            addCriterion("ne not like", value, "ne");
            return (Criteria) this;
        }

        public Criteria andNeIn(List<String> values) {
            addCriterion("ne in", values, "ne");
            return (Criteria) this;
        }

        public Criteria andNeNotIn(List<String> values) {
            addCriterion("ne not in", values, "ne");
            return (Criteria) this;
        }

        public Criteria andNeBetween(String value1, String value2) {
            addCriterion("ne between", value1, value2, "ne");
            return (Criteria) this;
        }

        public Criteria andNeNotBetween(String value1, String value2) {
            addCriterion("ne not between", value1, value2, "ne");
            return (Criteria) this;
        }

        public Criteria andMatherIsNull() {
            addCriterion("mather is null");
            return (Criteria) this;
        }

        public Criteria andMatherIsNotNull() {
            addCriterion("mather is not null");
            return (Criteria) this;
        }

        public Criteria andMatherEqualTo(Integer value) {
            addCriterion("mather =", value, "mather");
            return (Criteria) this;
        }

        public Criteria andMatherNotEqualTo(Integer value) {
            addCriterion("mather <>", value, "mather");
            return (Criteria) this;
        }

        public Criteria andMatherGreaterThan(Integer value) {
            addCriterion("mather >", value, "mather");
            return (Criteria) this;
        }

        public Criteria andMatherGreaterThanOrEqualTo(Integer value) {
            addCriterion("mather >=", value, "mather");
            return (Criteria) this;
        }

        public Criteria andMatherLessThan(Integer value) {
            addCriterion("mather <", value, "mather");
            return (Criteria) this;
        }

        public Criteria andMatherLessThanOrEqualTo(Integer value) {
            addCriterion("mather <=", value, "mather");
            return (Criteria) this;
        }

        public Criteria andMatherIn(List<Integer> values) {
            addCriterion("mather in", values, "mather");
            return (Criteria) this;
        }

        public Criteria andMatherNotIn(List<Integer> values) {
            addCriterion("mather not in", values, "mather");
            return (Criteria) this;
        }

        public Criteria andMatherBetween(Integer value1, Integer value2) {
            addCriterion("mather between", value1, value2, "mather");
            return (Criteria) this;
        }

        public Criteria andMatherNotBetween(Integer value1, Integer value2) {
            addCriterion("mather not between", value1, value2, "mather");
            return (Criteria) this;
        }

        public Criteria andFatherIsNull() {
            addCriterion("father is null");
            return (Criteria) this;
        }

        public Criteria andFatherIsNotNull() {
            addCriterion("father is not null");
            return (Criteria) this;
        }

        public Criteria andFatherEqualTo(Integer value) {
            addCriterion("father =", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotEqualTo(Integer value) {
            addCriterion("father <>", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherGreaterThan(Integer value) {
            addCriterion("father >", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherGreaterThanOrEqualTo(Integer value) {
            addCriterion("father >=", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherLessThan(Integer value) {
            addCriterion("father <", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherLessThanOrEqualTo(Integer value) {
            addCriterion("father <=", value, "father");
            return (Criteria) this;
        }

        public Criteria andFatherIn(List<Integer> values) {
            addCriterion("father in", values, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotIn(List<Integer> values) {
            addCriterion("father not in", values, "father");
            return (Criteria) this;
        }

        public Criteria andFatherBetween(Integer value1, Integer value2) {
            addCriterion("father between", value1, value2, "father");
            return (Criteria) this;
        }

        public Criteria andFatherNotBetween(Integer value1, Integer value2) {
            addCriterion("father not between", value1, value2, "father");
            return (Criteria) this;
        }

        public Criteria andTaisIsNull() {
            addCriterion("tais is null");
            return (Criteria) this;
        }

        public Criteria andTaisIsNotNull() {
            addCriterion("tais is not null");
            return (Criteria) this;
        }

        public Criteria andTaisEqualTo(Integer value) {
            addCriterion("tais =", value, "tais");
            return (Criteria) this;
        }

        public Criteria andTaisNotEqualTo(Integer value) {
            addCriterion("tais <>", value, "tais");
            return (Criteria) this;
        }

        public Criteria andTaisGreaterThan(Integer value) {
            addCriterion("tais >", value, "tais");
            return (Criteria) this;
        }

        public Criteria andTaisGreaterThanOrEqualTo(Integer value) {
            addCriterion("tais >=", value, "tais");
            return (Criteria) this;
        }

        public Criteria andTaisLessThan(Integer value) {
            addCriterion("tais <", value, "tais");
            return (Criteria) this;
        }

        public Criteria andTaisLessThanOrEqualTo(Integer value) {
            addCriterion("tais <=", value, "tais");
            return (Criteria) this;
        }

        public Criteria andTaisIn(List<Integer> values) {
            addCriterion("tais in", values, "tais");
            return (Criteria) this;
        }

        public Criteria andTaisNotIn(List<Integer> values) {
            addCriterion("tais not in", values, "tais");
            return (Criteria) this;
        }

        public Criteria andTaisBetween(Integer value1, Integer value2) {
            addCriterion("tais between", value1, value2, "tais");
            return (Criteria) this;
        }

        public Criteria andTaisNotBetween(Integer value1, Integer value2) {
            addCriterion("tais not between", value1, value2, "tais");
            return (Criteria) this;
        }

        public Criteria andChanIsNull() {
            addCriterion("chan is null");
            return (Criteria) this;
        }

        public Criteria andChanIsNotNull() {
            addCriterion("chan is not null");
            return (Criteria) this;
        }

        public Criteria andChanEqualTo(Integer value) {
            addCriterion("chan =", value, "chan");
            return (Criteria) this;
        }

        public Criteria andChanNotEqualTo(Integer value) {
            addCriterion("chan <>", value, "chan");
            return (Criteria) this;
        }

        public Criteria andChanGreaterThan(Integer value) {
            addCriterion("chan >", value, "chan");
            return (Criteria) this;
        }

        public Criteria andChanGreaterThanOrEqualTo(Integer value) {
            addCriterion("chan >=", value, "chan");
            return (Criteria) this;
        }

        public Criteria andChanLessThan(Integer value) {
            addCriterion("chan <", value, "chan");
            return (Criteria) this;
        }

        public Criteria andChanLessThanOrEqualTo(Integer value) {
            addCriterion("chan <=", value, "chan");
            return (Criteria) this;
        }

        public Criteria andChanIn(List<Integer> values) {
            addCriterion("chan in", values, "chan");
            return (Criteria) this;
        }

        public Criteria andChanNotIn(List<Integer> values) {
            addCriterion("chan not in", values, "chan");
            return (Criteria) this;
        }

        public Criteria andChanBetween(Integer value1, Integer value2) {
            addCriterion("chan between", value1, value2, "chan");
            return (Criteria) this;
        }

        public Criteria andChanNotBetween(Integer value1, Integer value2) {
            addCriterion("chan not between", value1, value2, "chan");
            return (Criteria) this;
        }

        public Criteria andZhouIsNull() {
            addCriterion("zhou is null");
            return (Criteria) this;
        }

        public Criteria andZhouIsNotNull() {
            addCriterion("zhou is not null");
            return (Criteria) this;
        }

        public Criteria andZhouEqualTo(Integer value) {
            addCriterion("zhou =", value, "zhou");
            return (Criteria) this;
        }

        public Criteria andZhouNotEqualTo(Integer value) {
            addCriterion("zhou <>", value, "zhou");
            return (Criteria) this;
        }

        public Criteria andZhouGreaterThan(Integer value) {
            addCriterion("zhou >", value, "zhou");
            return (Criteria) this;
        }

        public Criteria andZhouGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhou >=", value, "zhou");
            return (Criteria) this;
        }

        public Criteria andZhouLessThan(Integer value) {
            addCriterion("zhou <", value, "zhou");
            return (Criteria) this;
        }

        public Criteria andZhouLessThanOrEqualTo(Integer value) {
            addCriterion("zhou <=", value, "zhou");
            return (Criteria) this;
        }

        public Criteria andZhouIn(List<Integer> values) {
            addCriterion("zhou in", values, "zhou");
            return (Criteria) this;
        }

        public Criteria andZhouNotIn(List<Integer> values) {
            addCriterion("zhou not in", values, "zhou");
            return (Criteria) this;
        }

        public Criteria andZhouBetween(Integer value1, Integer value2) {
            addCriterion("zhou between", value1, value2, "zhou");
            return (Criteria) this;
        }

        public Criteria andZhouNotBetween(Integer value1, Integer value2) {
            addCriterion("zhou not between", value1, value2, "zhou");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNull() {
            addCriterion("ctype is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("ctype is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(String value) {
            addCriterion("ctype =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(String value) {
            addCriterion("ctype <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(String value) {
            addCriterion("ctype >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ctype >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(String value) {
            addCriterion("ctype <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(String value) {
            addCriterion("ctype <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLike(String value) {
            addCriterion("ctype like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotLike(String value) {
            addCriterion("ctype not like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<String> values) {
            addCriterion("ctype in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<String> values) {
            addCriterion("ctype not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(String value1, String value2) {
            addCriterion("ctype between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(String value1, String value2) {
            addCriterion("ctype not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andKgIsNull() {
            addCriterion("kg is null");
            return (Criteria) this;
        }

        public Criteria andKgIsNotNull() {
            addCriterion("kg is not null");
            return (Criteria) this;
        }

        public Criteria andKgEqualTo(Integer value) {
            addCriterion("kg =", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgNotEqualTo(Integer value) {
            addCriterion("kg <>", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgGreaterThan(Integer value) {
            addCriterion("kg >", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgGreaterThanOrEqualTo(Integer value) {
            addCriterion("kg >=", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgLessThan(Integer value) {
            addCriterion("kg <", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgLessThanOrEqualTo(Integer value) {
            addCriterion("kg <=", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgIn(List<Integer> values) {
            addCriterion("kg in", values, "kg");
            return (Criteria) this;
        }

        public Criteria andKgNotIn(List<Integer> values) {
            addCriterion("kg not in", values, "kg");
            return (Criteria) this;
        }

        public Criteria andKgBetween(Integer value1, Integer value2) {
            addCriterion("kg between", value1, value2, "kg");
            return (Criteria) this;
        }

        public Criteria andKgNotBetween(Integer value1, Integer value2) {
            addCriterion("kg not between", value1, value2, "kg");
            return (Criteria) this;
        }

        public Criteria andMyqbsIsNull() {
            addCriterion("myqbs is null");
            return (Criteria) this;
        }

        public Criteria andMyqbsIsNotNull() {
            addCriterion("myqbs is not null");
            return (Criteria) this;
        }

        public Criteria andMyqbsEqualTo(Integer value) {
            addCriterion("myqbs =", value, "myqbs");
            return (Criteria) this;
        }

        public Criteria andMyqbsNotEqualTo(Integer value) {
            addCriterion("myqbs <>", value, "myqbs");
            return (Criteria) this;
        }

        public Criteria andMyqbsGreaterThan(Integer value) {
            addCriterion("myqbs >", value, "myqbs");
            return (Criteria) this;
        }

        public Criteria andMyqbsGreaterThanOrEqualTo(Integer value) {
            addCriterion("myqbs >=", value, "myqbs");
            return (Criteria) this;
        }

        public Criteria andMyqbsLessThan(Integer value) {
            addCriterion("myqbs <", value, "myqbs");
            return (Criteria) this;
        }

        public Criteria andMyqbsLessThanOrEqualTo(Integer value) {
            addCriterion("myqbs <=", value, "myqbs");
            return (Criteria) this;
        }

        public Criteria andMyqbsIn(List<Integer> values) {
            addCriterion("myqbs in", values, "myqbs");
            return (Criteria) this;
        }

        public Criteria andMyqbsNotIn(List<Integer> values) {
            addCriterion("myqbs not in", values, "myqbs");
            return (Criteria) this;
        }

        public Criteria andMyqbsBetween(Integer value1, Integer value2) {
            addCriterion("myqbs between", value1, value2, "myqbs");
            return (Criteria) this;
        }

        public Criteria andMyqbsNotBetween(Integer value1, Integer value2) {
            addCriterion("myqbs not between", value1, value2, "myqbs");
            return (Criteria) this;
        }

        public Criteria andMyqbsesIsNull() {
            addCriterion("myqbses is null");
            return (Criteria) this;
        }

        public Criteria andMyqbsesIsNotNull() {
            addCriterion("myqbses is not null");
            return (Criteria) this;
        }

        public Criteria andMyqbsesEqualTo(String value) {
            addCriterion("myqbses =", value, "myqbses");
            return (Criteria) this;
        }

        public Criteria andMyqbsesNotEqualTo(String value) {
            addCriterion("myqbses <>", value, "myqbses");
            return (Criteria) this;
        }

        public Criteria andMyqbsesGreaterThan(String value) {
            addCriterion("myqbses >", value, "myqbses");
            return (Criteria) this;
        }

        public Criteria andMyqbsesGreaterThanOrEqualTo(String value) {
            addCriterion("myqbses >=", value, "myqbses");
            return (Criteria) this;
        }

        public Criteria andMyqbsesLessThan(String value) {
            addCriterion("myqbses <", value, "myqbses");
            return (Criteria) this;
        }

        public Criteria andMyqbsesLessThanOrEqualTo(String value) {
            addCriterion("myqbses <=", value, "myqbses");
            return (Criteria) this;
        }

        public Criteria andMyqbsesLike(String value) {
            addCriterion("myqbses like", value, "myqbses");
            return (Criteria) this;
        }

        public Criteria andMyqbsesNotLike(String value) {
            addCriterion("myqbses not like", value, "myqbses");
            return (Criteria) this;
        }

        public Criteria andMyqbsesIn(List<String> values) {
            addCriterion("myqbses in", values, "myqbses");
            return (Criteria) this;
        }

        public Criteria andMyqbsesNotIn(List<String> values) {
            addCriterion("myqbses not in", values, "myqbses");
            return (Criteria) this;
        }

        public Criteria andMyqbsesBetween(String value1, String value2) {
            addCriterion("myqbses between", value1, value2, "myqbses");
            return (Criteria) this;
        }

        public Criteria andMyqbsesNotBetween(String value1, String value2) {
            addCriterion("myqbses not between", value1, value2, "myqbses");
            return (Criteria) this;
        }

        public Criteria andShbsIsNull() {
            addCriterion("shbs is null");
            return (Criteria) this;
        }

        public Criteria andShbsIsNotNull() {
            addCriterion("shbs is not null");
            return (Criteria) this;
        }

        public Criteria andShbsEqualTo(String value) {
            addCriterion("shbs =", value, "shbs");
            return (Criteria) this;
        }

        public Criteria andShbsNotEqualTo(String value) {
            addCriterion("shbs <>", value, "shbs");
            return (Criteria) this;
        }

        public Criteria andShbsGreaterThan(String value) {
            addCriterion("shbs >", value, "shbs");
            return (Criteria) this;
        }

        public Criteria andShbsGreaterThanOrEqualTo(String value) {
            addCriterion("shbs >=", value, "shbs");
            return (Criteria) this;
        }

        public Criteria andShbsLessThan(String value) {
            addCriterion("shbs <", value, "shbs");
            return (Criteria) this;
        }

        public Criteria andShbsLessThanOrEqualTo(String value) {
            addCriterion("shbs <=", value, "shbs");
            return (Criteria) this;
        }

        public Criteria andShbsLike(String value) {
            addCriterion("shbs like", value, "shbs");
            return (Criteria) this;
        }

        public Criteria andShbsNotLike(String value) {
            addCriterion("shbs not like", value, "shbs");
            return (Criteria) this;
        }

        public Criteria andShbsIn(List<String> values) {
            addCriterion("shbs in", values, "shbs");
            return (Criteria) this;
        }

        public Criteria andShbsNotIn(List<String> values) {
            addCriterion("shbs not in", values, "shbs");
            return (Criteria) this;
        }

        public Criteria andShbsBetween(String value1, String value2) {
            addCriterion("shbs between", value1, value2, "shbs");
            return (Criteria) this;
        }

        public Criteria andShbsNotBetween(String value1, String value2) {
            addCriterion("shbs not between", value1, value2, "shbs");
            return (Criteria) this;
        }

        public Criteria andFychIsNull() {
            addCriterion("fych is null");
            return (Criteria) this;
        }

        public Criteria andFychIsNotNull() {
            addCriterion("fych is not null");
            return (Criteria) this;
        }

        public Criteria andFychEqualTo(Integer value) {
            addCriterion("fych =", value, "fych");
            return (Criteria) this;
        }

        public Criteria andFychNotEqualTo(Integer value) {
            addCriterion("fych <>", value, "fych");
            return (Criteria) this;
        }

        public Criteria andFychGreaterThan(Integer value) {
            addCriterion("fych >", value, "fych");
            return (Criteria) this;
        }

        public Criteria andFychGreaterThanOrEqualTo(Integer value) {
            addCriterion("fych >=", value, "fych");
            return (Criteria) this;
        }

        public Criteria andFychLessThan(Integer value) {
            addCriterion("fych <", value, "fych");
            return (Criteria) this;
        }

        public Criteria andFychLessThanOrEqualTo(Integer value) {
            addCriterion("fych <=", value, "fych");
            return (Criteria) this;
        }

        public Criteria andFychIn(List<Integer> values) {
            addCriterion("fych in", values, "fych");
            return (Criteria) this;
        }

        public Criteria andFychNotIn(List<Integer> values) {
            addCriterion("fych not in", values, "fych");
            return (Criteria) this;
        }

        public Criteria andFychBetween(Integer value1, Integer value2) {
            addCriterion("fych between", value1, value2, "fych");
            return (Criteria) this;
        }

        public Criteria andFychNotBetween(Integer value1, Integer value2) {
            addCriterion("fych not between", value1, value2, "fych");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("`action` is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("`action` is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("`action` =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("`action` <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("`action` >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("`action` >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("`action` <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("`action` <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("`action` like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("`action` not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("`action` in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("`action` not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("`action` between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("`action` not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionsIsNull() {
            addCriterion("actions is null");
            return (Criteria) this;
        }

        public Criteria andActionsIsNotNull() {
            addCriterion("actions is not null");
            return (Criteria) this;
        }

        public Criteria andActionsEqualTo(String value) {
            addCriterion("actions =", value, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsNotEqualTo(String value) {
            addCriterion("actions <>", value, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsGreaterThan(String value) {
            addCriterion("actions >", value, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsGreaterThanOrEqualTo(String value) {
            addCriterion("actions >=", value, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsLessThan(String value) {
            addCriterion("actions <", value, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsLessThanOrEqualTo(String value) {
            addCriterion("actions <=", value, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsLike(String value) {
            addCriterion("actions like", value, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsNotLike(String value) {
            addCriterion("actions not like", value, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsIn(List<String> values) {
            addCriterion("actions in", values, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsNotIn(List<String> values) {
            addCriterion("actions not in", values, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsBetween(String value1, String value2) {
            addCriterion("actions between", value1, value2, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsNotBetween(String value1, String value2) {
            addCriterion("actions not between", value1, value2, "actions");
            return (Criteria) this;
        }

        public Criteria andTaiIsNull() {
            addCriterion("tai is null");
            return (Criteria) this;
        }

        public Criteria andTaiIsNotNull() {
            addCriterion("tai is not null");
            return (Criteria) this;
        }

        public Criteria andTaiEqualTo(Integer value) {
            addCriterion("tai =", value, "tai");
            return (Criteria) this;
        }

        public Criteria andTaiNotEqualTo(Integer value) {
            addCriterion("tai <>", value, "tai");
            return (Criteria) this;
        }

        public Criteria andTaiGreaterThan(Integer value) {
            addCriterion("tai >", value, "tai");
            return (Criteria) this;
        }

        public Criteria andTaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("tai >=", value, "tai");
            return (Criteria) this;
        }

        public Criteria andTaiLessThan(Integer value) {
            addCriterion("tai <", value, "tai");
            return (Criteria) this;
        }

        public Criteria andTaiLessThanOrEqualTo(Integer value) {
            addCriterion("tai <=", value, "tai");
            return (Criteria) this;
        }

        public Criteria andTaiIn(List<Integer> values) {
            addCriterion("tai in", values, "tai");
            return (Criteria) this;
        }

        public Criteria andTaiNotIn(List<Integer> values) {
            addCriterion("tai not in", values, "tai");
            return (Criteria) this;
        }

        public Criteria andTaiBetween(Integer value1, Integer value2) {
            addCriterion("tai between", value1, value2, "tai");
            return (Criteria) this;
        }

        public Criteria andTaiNotBetween(Integer value1, Integer value2) {
            addCriterion("tai not between", value1, value2, "tai");
            return (Criteria) this;
        }

        public Criteria andFanIsNull() {
            addCriterion("fan is null");
            return (Criteria) this;
        }

        public Criteria andFanIsNotNull() {
            addCriterion("fan is not null");
            return (Criteria) this;
        }

        public Criteria andFanEqualTo(Integer value) {
            addCriterion("fan =", value, "fan");
            return (Criteria) this;
        }

        public Criteria andFanNotEqualTo(Integer value) {
            addCriterion("fan <>", value, "fan");
            return (Criteria) this;
        }

        public Criteria andFanGreaterThan(Integer value) {
            addCriterion("fan >", value, "fan");
            return (Criteria) this;
        }

        public Criteria andFanGreaterThanOrEqualTo(Integer value) {
            addCriterion("fan >=", value, "fan");
            return (Criteria) this;
        }

        public Criteria andFanLessThan(Integer value) {
            addCriterion("fan <", value, "fan");
            return (Criteria) this;
        }

        public Criteria andFanLessThanOrEqualTo(Integer value) {
            addCriterion("fan <=", value, "fan");
            return (Criteria) this;
        }

        public Criteria andFanIn(List<Integer> values) {
            addCriterion("fan in", values, "fan");
            return (Criteria) this;
        }

        public Criteria andFanNotIn(List<Integer> values) {
            addCriterion("fan not in", values, "fan");
            return (Criteria) this;
        }

        public Criteria andFanBetween(Integer value1, Integer value2) {
            addCriterion("fan between", value1, value2, "fan");
            return (Criteria) this;
        }

        public Criteria andFanNotBetween(Integer value1, Integer value2) {
            addCriterion("fan not between", value1, value2, "fan");
            return (Criteria) this;
        }

        public Criteria andDzIsNull() {
            addCriterion("dz is null");
            return (Criteria) this;
        }

        public Criteria andDzIsNotNull() {
            addCriterion("dz is not null");
            return (Criteria) this;
        }

        public Criteria andDzEqualTo(Integer value) {
            addCriterion("dz =", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotEqualTo(Integer value) {
            addCriterion("dz <>", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThan(Integer value) {
            addCriterion("dz >", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThanOrEqualTo(Integer value) {
            addCriterion("dz >=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThan(Integer value) {
            addCriterion("dz <", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThanOrEqualTo(Integer value) {
            addCriterion("dz <=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzIn(List<Integer> values) {
            addCriterion("dz in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotIn(List<Integer> values) {
            addCriterion("dz not in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzBetween(Integer value1, Integer value2) {
            addCriterion("dz between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotBetween(Integer value1, Integer value2) {
            addCriterion("dz not between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andPaIsNull() {
            addCriterion("pa is null");
            return (Criteria) this;
        }

        public Criteria andPaIsNotNull() {
            addCriterion("pa is not null");
            return (Criteria) this;
        }

        public Criteria andPaEqualTo(Integer value) {
            addCriterion("pa =", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaNotEqualTo(Integer value) {
            addCriterion("pa <>", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaGreaterThan(Integer value) {
            addCriterion("pa >", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaGreaterThanOrEqualTo(Integer value) {
            addCriterion("pa >=", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaLessThan(Integer value) {
            addCriterion("pa <", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaLessThanOrEqualTo(Integer value) {
            addCriterion("pa <=", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaIn(List<Integer> values) {
            addCriterion("pa in", values, "pa");
            return (Criteria) this;
        }

        public Criteria andPaNotIn(List<Integer> values) {
            addCriterion("pa not in", values, "pa");
            return (Criteria) this;
        }

        public Criteria andPaBetween(Integer value1, Integer value2) {
            addCriterion("pa between", value1, value2, "pa");
            return (Criteria) this;
        }

        public Criteria andPaNotBetween(Integer value1, Integer value2) {
            addCriterion("pa not between", value1, value2, "pa");
            return (Criteria) this;
        }

        public Criteria andZouIsNull() {
            addCriterion("zou is null");
            return (Criteria) this;
        }

        public Criteria andZouIsNotNull() {
            addCriterion("zou is not null");
            return (Criteria) this;
        }

        public Criteria andZouEqualTo(Integer value) {
            addCriterion("zou =", value, "zou");
            return (Criteria) this;
        }

        public Criteria andZouNotEqualTo(Integer value) {
            addCriterion("zou <>", value, "zou");
            return (Criteria) this;
        }

        public Criteria andZouGreaterThan(Integer value) {
            addCriterion("zou >", value, "zou");
            return (Criteria) this;
        }

        public Criteria andZouGreaterThanOrEqualTo(Integer value) {
            addCriterion("zou >=", value, "zou");
            return (Criteria) this;
        }

        public Criteria andZouLessThan(Integer value) {
            addCriterion("zou <", value, "zou");
            return (Criteria) this;
        }

        public Criteria andZouLessThanOrEqualTo(Integer value) {
            addCriterion("zou <=", value, "zou");
            return (Criteria) this;
        }

        public Criteria andZouIn(List<Integer> values) {
            addCriterion("zou in", values, "zou");
            return (Criteria) this;
        }

        public Criteria andZouNotIn(List<Integer> values) {
            addCriterion("zou not in", values, "zou");
            return (Criteria) this;
        }

        public Criteria andZouBetween(Integer value1, Integer value2) {
            addCriterion("zou between", value1, value2, "zou");
            return (Criteria) this;
        }

        public Criteria andZouNotBetween(Integer value1, Integer value2) {
            addCriterion("zou not between", value1, value2, "zou");
            return (Criteria) this;
        }

        public Criteria andLauIsNull() {
            addCriterion("lau is null");
            return (Criteria) this;
        }

        public Criteria andLauIsNotNull() {
            addCriterion("lau is not null");
            return (Criteria) this;
        }

        public Criteria andLauEqualTo(String value) {
            addCriterion("lau =", value, "lau");
            return (Criteria) this;
        }

        public Criteria andLauNotEqualTo(String value) {
            addCriterion("lau <>", value, "lau");
            return (Criteria) this;
        }

        public Criteria andLauGreaterThan(String value) {
            addCriterion("lau >", value, "lau");
            return (Criteria) this;
        }

        public Criteria andLauGreaterThanOrEqualTo(String value) {
            addCriterion("lau >=", value, "lau");
            return (Criteria) this;
        }

        public Criteria andLauLessThan(String value) {
            addCriterion("lau <", value, "lau");
            return (Criteria) this;
        }

        public Criteria andLauLessThanOrEqualTo(String value) {
            addCriterion("lau <=", value, "lau");
            return (Criteria) this;
        }

        public Criteria andLauLike(String value) {
            addCriterion("lau like", value, "lau");
            return (Criteria) this;
        }

        public Criteria andLauNotLike(String value) {
            addCriterion("lau not like", value, "lau");
            return (Criteria) this;
        }

        public Criteria andLauIn(List<String> values) {
            addCriterion("lau in", values, "lau");
            return (Criteria) this;
        }

        public Criteria andLauNotIn(List<String> values) {
            addCriterion("lau not in", values, "lau");
            return (Criteria) this;
        }

        public Criteria andLauBetween(String value1, String value2) {
            addCriterion("lau between", value1, value2, "lau");
            return (Criteria) this;
        }

        public Criteria andLauNotBetween(String value1, String value2) {
            addCriterion("lau not between", value1, value2, "lau");
            return (Criteria) this;
        }

        public Criteria andLausIsNull() {
            addCriterion("laus is null");
            return (Criteria) this;
        }

        public Criteria andLausIsNotNull() {
            addCriterion("laus is not null");
            return (Criteria) this;
        }

        public Criteria andLausEqualTo(String value) {
            addCriterion("laus =", value, "laus");
            return (Criteria) this;
        }

        public Criteria andLausNotEqualTo(String value) {
            addCriterion("laus <>", value, "laus");
            return (Criteria) this;
        }

        public Criteria andLausGreaterThan(String value) {
            addCriterion("laus >", value, "laus");
            return (Criteria) this;
        }

        public Criteria andLausGreaterThanOrEqualTo(String value) {
            addCriterion("laus >=", value, "laus");
            return (Criteria) this;
        }

        public Criteria andLausLessThan(String value) {
            addCriterion("laus <", value, "laus");
            return (Criteria) this;
        }

        public Criteria andLausLessThanOrEqualTo(String value) {
            addCriterion("laus <=", value, "laus");
            return (Criteria) this;
        }

        public Criteria andLausLike(String value) {
            addCriterion("laus like", value, "laus");
            return (Criteria) this;
        }

        public Criteria andLausNotLike(String value) {
            addCriterion("laus not like", value, "laus");
            return (Criteria) this;
        }

        public Criteria andLausIn(List<String> values) {
            addCriterion("laus in", values, "laus");
            return (Criteria) this;
        }

        public Criteria andLausNotIn(List<String> values) {
            addCriterion("laus not in", values, "laus");
            return (Criteria) this;
        }

        public Criteria andLausBetween(String value1, String value2) {
            addCriterion("laus between", value1, value2, "laus");
            return (Criteria) this;
        }

        public Criteria andLausNotBetween(String value1, String value2) {
            addCriterion("laus not between", value1, value2, "laus");
            return (Criteria) this;
        }
    }

    /**
     */
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