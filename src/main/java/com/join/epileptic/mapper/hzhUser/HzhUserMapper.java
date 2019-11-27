package com.join.epileptic.mapper.hzhUser;

import com.join.epileptic.entity.hzhUser.HzhUser;
import com.join.epileptic.entity.hzhUser.HzhUserExample;
import org.springframework.stereotype.Repository;
import com.join.epileptic.mapper.MyBatisBaseDao;
/**
 * HzhUserMapper继承基类
 */
@Repository
public interface HzhUserMapper extends MyBatisBaseDao<HzhUser, Integer, HzhUserExample> {
}