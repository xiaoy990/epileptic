package com.join.epileptic.service.hzhAssist.impl;

import com.join.epileptic.entity.hzhAssist.HzhAssist;
import com.join.epileptic.mapper.hzhAssist.HzhAssistMapper;
import com.join.epileptic.service.hzhAssist.HzhAssistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:ljx
 * @Date:2019/11/28
 * @Description:
 */
@Service
public class HzhAssistServiceImpl implements HzhAssistService {
    @Autowired
    HzhAssistMapper hzhAssistMapper;

    @Override
    public int insert(HzhAssist hzhAssist) {
        hzhAssistMapper.insert(hzhAssist);
        return hzhAssist.getId();
    }

    @Override
    public int updateById(HzhAssist hzhAssist) {
        hzhAssistMapper.updateByPrimaryKey(hzhAssist);
        return hzhAssist.getId();
    }

    @Override
    public int deleteById(int id) {
        hzhAssistMapper.deleteByPrimaryKey(id);
        return id;
    }

    @Override
    public List<HzhAssist> multiSelect(HzhAssist hzhAssist) {
        return hzhAssistMapper.multiSelect(hzhAssist);
    }
}
