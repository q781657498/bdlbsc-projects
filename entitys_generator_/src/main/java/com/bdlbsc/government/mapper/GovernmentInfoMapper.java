package com.bdlbsc.government.mapper;

import com.bdlbsc.government.entity.GovernmentInfo;
import java.util.List;

public interface GovernmentInfoMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(GovernmentInfo record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    GovernmentInfo selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<GovernmentInfo> selectAll();

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int updateByPrimaryKey(GovernmentInfo record);
}