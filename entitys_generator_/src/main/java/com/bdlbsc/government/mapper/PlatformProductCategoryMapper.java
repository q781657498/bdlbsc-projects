package com.bdlbsc.government.mapper;

import com.bdlbsc.government.entity.PlatformProductCategory;
import java.util.List;

public interface PlatformProductCategoryMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(PlatformProductCategory record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    PlatformProductCategory selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<PlatformProductCategory> selectAll();

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int updateByPrimaryKey(PlatformProductCategory record);
}