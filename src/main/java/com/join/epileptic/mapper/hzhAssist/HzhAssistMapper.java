package com.join.epileptic.mapper.hzhAssist;

import com.join.epileptic.entity.hzhAssist.HzhAssist;
import com.join.epileptic.entity.hzhAssist.HzhAssistExample;
import com.join.epileptic.mapper.MyBatisBaseDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HzhAssistMapper继承基类
 */
@Repository
public interface HzhAssistMapper extends MyBatisBaseDao<HzhAssist, Integer, HzhAssistExample> {
    List<HzhAssist> multiSelect(@Param("hzh_assist") HzhAssist hzhAssist);
}