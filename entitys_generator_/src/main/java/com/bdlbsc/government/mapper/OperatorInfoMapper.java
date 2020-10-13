package com.bdlbsc.government.mapper;

import com.bdlbsc.government.entity.OperatorInfo;
import java.util.List;

public interface OperatorInfoMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(OperatorInfo record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    OperatorInfo selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<OperatorInfo> selectAll();

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int updateByPrimaryKey(OperatorInfo record);
}