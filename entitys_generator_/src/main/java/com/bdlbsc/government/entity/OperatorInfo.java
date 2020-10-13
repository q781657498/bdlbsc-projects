package com.bdlbsc.government.entity;

import java.util.Date;

/**
 * operator_info 
 * @author liushuai 2020-09-25
 */
public class OperatorInfo {
    /**
     * @column id
     * @desc 主键id
     * @required true
     */
    private Long id;

    /**
     * @column parent_id
     * @desc 父节点id
     */
    private Long parentId;

    /**
     * @column level
     * @desc 祖级列表
     */
    private String level;

    /**
     * @column names
     * @desc 运营商名称
     * @required true
     */
    private String names;

    /**
     * @column logo_url
     * @desc logo地址
     */
    private String logoUrl;

    /**
     * @column types
     * @desc 类型(公司、呼叫中心、社区/日间照料中心、其他、)
     */
    private String types;

    /**
     * @column address
     * @desc 地址
     */
    private String address;

    /**
     * @column address_x
     * @desc 地址经度
     */
    private String addressX;

    /**
     * @column address_y
     * @desc 地址纬度
     */
    private String addressY;

    /**
     * @column hourse_numbers
     * @desc 门牌号
     */
    private String hourseNumbers;

    /**
     * @column operating_range_code
     * @desc 运营范围：必填项。五层级省、市、区县、乡镇街道、村
     */
    private String operatingRangeCode;

    /**
     * @column business_license_url
     * @desc 营业执照
     */
    private String businessLicenseUrl;

    /**
     * @column business_certificate_
     * @desc 经营许可证
     */
    private String businessCertificate;

    /**
     * @column principle_name
     * @desc 负责人姓名
     */
    private String principleName;

    /**
     * @column principle_contact
     * @desc 负责人联系方式
     */
    private String principleContact;

    /**
     * @column principle_idcard
     * @desc 负责人身份证号码
     */
    private String principleIdcard;

    /**
     * @column create_time
     * @desc 
     * @required true
     */
    private Date createTime;

    /**
     * @column update_time
     * @desc 
     */
    private Date updateTime;

    /**
     * @column is_delete
     * @desc 是否删除  1删除，0未删除
     * @required true
     */
    private String isDelete;

    /**
     * @column status
     * @desc 停用0，启用1
     * @required true
     */
    private String status;

    /**
     * @column province_id
     * @desc 省码
     */
    private String provinceId;

    /**
     * @column province_name
     * @desc 
     */
    private String provinceName;

    /**
     * @column city_id
     * @desc 市码
     */
    private String cityId;

    /**
     * @column city_name
     * @desc 
     */
    private String cityName;

    /**
     * @column county_id
     * @desc 县码
     */
    private String countyId;

    /**
     * @column county_name
     * @desc 
     */
    private String countyName;

    /**
     * @column street_id
     * @desc 街道id
     */
    private String streetId;

    /**
     * @column street_name
     * @desc 
     */
    private String streetName;

    /**
     * @column community_id
     * @desc 社区id
     */
    private String communityId;

    /**
     * @column community_name
     * @desc 
     */
    private String communityName;

    /**
     * @column manager_name
     * @desc 管理员姓名
     */
    private String managerName;

    /**
     * @column manager_phone
     * @desc 管理员手机号
     */
    private String managerPhone;

    /**
     * @column manager_userid
     * @desc 管理员用户id
     */
    private String managerUserid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressX() {
        return addressX;
    }

    public void setAddressX(String addressX) {
        this.addressX = addressX;
    }

    public String getAddressY() {
        return addressY;
    }

    public void setAddressY(String addressY) {
        this.addressY = addressY;
    }

    public String getHourseNumbers() {
        return hourseNumbers;
    }

    public void setHourseNumbers(String hourseNumbers) {
        this.hourseNumbers = hourseNumbers;
    }

    public String getOperatingRangeCode() {
        return operatingRangeCode;
    }

    public void setOperatingRangeCode(String operatingRangeCode) {
        this.operatingRangeCode = operatingRangeCode;
    }

    public String getBusinessLicenseUrl() {
        return businessLicenseUrl;
    }

    public void setBusinessLicenseUrl(String businessLicenseUrl) {
        this.businessLicenseUrl = businessLicenseUrl;
    }

    public String getBusinessCertificate() {
        return businessCertificate;
    }

    public void setBusinessCertificate(String businessCertificate) {
        this.businessCertificate = businessCertificate;
    }

    public String getPrincipleName() {
        return principleName;
    }

    public void setPrincipleName(String principleName) {
        this.principleName = principleName;
    }

    public String getPrincipleContact() {
        return principleContact;
    }

    public void setPrincipleContact(String principleContact) {
        this.principleContact = principleContact;
    }

    public String getPrincipleIdcard() {
        return principleIdcard;
    }

    public void setPrincipleIdcard(String principleIdcard) {
        this.principleIdcard = principleIdcard;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getStreetId() {
        return streetId;
    }

    public void setStreetId(String streetId) {
        this.streetId = streetId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public String getManagerUserid() {
        return managerUserid;
    }

    public void setManagerUserid(String managerUserid) {
        this.managerUserid = managerUserid;
    }
}