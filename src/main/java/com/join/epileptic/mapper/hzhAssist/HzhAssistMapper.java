package com.join.epileptic.mapper.hzhAssist;

import com.join.epileptic.entity.hzhAssist.HzhAssist;
import com.join.epileptic.entity.hzhAssist.HzhAssistExample;
import com.join.epileptic.mapper.MyBatisBaseDao;
import org.springframework.stereotype.Repository;

/**
 * HzhAssistMapper继承基类
 */
@Repository
public interface HzhAssistMapper extends MyBatisBaseDao<HzhAssist, Integer, HzhAssistExample> {
}