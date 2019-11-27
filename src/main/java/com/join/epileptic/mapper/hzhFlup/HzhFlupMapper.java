package com.join.epileptic.mapper.hzhFlup;

import com.join.epileptic.entity.hzhFlup.HzhFlup;
import com.join.epileptic.entity.hzhFlup.HzhFlupExample;
import org.springframework.stereotype.Repository;
import com.join.epileptic.mapper.MyBatisBaseDao;

/**
 * HzhFlupMapper继承基类
 */
@Repository
public interface HzhFlupMapper extends MyBatisBaseDao<HzhFlup, Integer, HzhFlupExample> {
}