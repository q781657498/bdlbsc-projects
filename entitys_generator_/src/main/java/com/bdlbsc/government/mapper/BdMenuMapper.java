package com.bdlbsc.government.mapper;

import com.bdlbsc.government.entity.BdMenu;
import java.util.List;

public interface BdMenuMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(Long menuId);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(BdMenu record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    BdMenu selectByPrimaryKey(Long menuId);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<BdMenu> selectAll();

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int updateByPrimaryKey(BdMenu record);
}