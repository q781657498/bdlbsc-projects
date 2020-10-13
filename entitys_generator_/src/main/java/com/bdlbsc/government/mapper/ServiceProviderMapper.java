package com.bdlbsc.government.mapper;

import com.bdlbsc.government.entity.ServiceProvider;
import java.util.List;

public interface ServiceProviderMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(ServiceProvider record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    ServiceProvider selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<ServiceProvider> selectAll();

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int updateByPrimaryKey(ServiceProvider record);
}