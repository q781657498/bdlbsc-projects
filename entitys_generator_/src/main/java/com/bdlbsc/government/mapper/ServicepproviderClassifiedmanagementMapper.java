package com.bdlbsc.government.mapper;

import com.bdlbsc.government.entity.ServicepproviderClassifiedmanagement;
import java.util.List;

public interface ServicepproviderClassifiedmanagementMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(ServicepproviderClassifiedmanagement record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    ServicepproviderClassifiedmanagement selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<ServicepproviderClassifiedmanagement> selectAll();

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int updateByPrimaryKey(ServicepproviderClassifiedmanagement record);
}