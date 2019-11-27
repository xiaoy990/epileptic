package com.join.epileptic.mapper.hzhChildren;

import com.join.epileptic.entity.hzhChildren.HzhChildren;
import com.join.epileptic.entity.hzhChildren.HzhChildrenExample;
import org.springframework.stereotype.Repository;
import com.join.epileptic.mapper.MyBatisBaseDao;

/**
 * HzhChildrenMapper继承基类
 */
@Repository
public interface HzhChildrenMapper extends MyBatisBaseDao<HzhChildren, Integer, HzhChildrenExample> {
}