package com.join.epileptic.mapper.hzhRegion;

import com.join.epileptic.entity.hzhRegion.HzhRegion;
import com.join.epileptic.entity.hzhRegion.HzhRegionExample;
import org.springframework.stereotype.Repository;
import com.join.epileptic.mapper.MyBatisBaseDao;
/**
 * HzhRegionMapper继承基类
 */
@Repository
public interface HzhRegionMapper extends MyBatisBaseDao<HzhRegion, Short, HzhRegionExample> {
}