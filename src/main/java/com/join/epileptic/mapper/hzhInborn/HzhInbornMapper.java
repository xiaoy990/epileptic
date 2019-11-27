package com.join.epileptic.mapper.hzhInborn;

import com.join.epileptic.entity.hzhInborn.HzhInborn;
import com.join.epileptic.entity.hzhInborn.HzhInbornExample;
import org.springframework.stereotype.Repository;
import com.join.epileptic.mapper.MyBatisBaseDao;
/**
 * HzhInbornMapper继承基类
 */
@Repository
public interface HzhInbornMapper extends MyBatisBaseDao<HzhInborn, Integer, HzhInbornExample> {
}