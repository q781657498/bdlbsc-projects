package com.bdlbsc.government.entity;

/**
 * servicepProvider_classifiedManagement 供应商和平台产品类别的关联表
 * @author liushuai 2020-09-25
 */
public class ServicepproviderClassifiedmanagement {
    /**
     * @column id
     * @desc 
     * @required true
     */
    private String id;

    /**
     * @column service_provider_id
     * @desc 供应商id
     * @required true
     */
    private Long serviceProviderId;

    /**
     * @column level_id
     * @desc 经营分类id
     * @required true
     */
    private String levelId;

    /**
     * @column level_name
     * @desc 经营分类名称
     */
    private String levelName;

    /**
     * @column checked
     * @desc 是否选中，1为选中，0为不选中
     */
    private String checked;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(Long serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }
}