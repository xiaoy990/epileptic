package com.join.epileptic.mapper.hzhInborn;

import com.join.epileptic.entity.hzhInborn.HzhInborn;
import com.join.epileptic.entity.hzhInborn.HzhInbornExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.join.epileptic.mapper.MyBatisBaseDao;

import java.util.List;

/**
 * HzhInbornMapper继承基类
 */
@Repository
public interface HzhInbornMapper extends MyBatisBaseDao<HzhInborn, Integer, HzhInbornExample> {
    List<HzhInborn> multiSelect(@Param("hzhInborn") HzhInborn hzhInborn);
}