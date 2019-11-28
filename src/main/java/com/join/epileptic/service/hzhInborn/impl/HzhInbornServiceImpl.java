package com.join.epileptic.service.hzhInborn.impl;

import com.join.epileptic.entity.hzhInborn.HzhInborn;
import com.join.epileptic.mapper.hzhInborn.HzhInbornMapper;
import com.join.epileptic.service.hzhInborn.HzhInbornService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:ljx
 * @Date:2019/11/28
 * @Description:
 */
@Service
public class HzhInbornServiceImpl implements HzhInbornService {
    @Autowired
    HzhInbornMapper hzhInbornMapper;

    @Override
    public int insert(HzhInborn hzhInborn) {
        hzhInbornMapper.insert(hzhInborn);
        return hzhInborn.getId();
    }

    @Override
    public int updateById(HzhInborn hzhInborn) {
        hzhInbornMapper.updateByPrimaryKey(hzhInborn);
        return hzhInborn.getId();
    }

    @Override
    public int deleteById(int id) {
        hzhInbornMapper.deleteByPrimaryKey(id);
        return id;
    }

    @Override
    public List<HzhInborn> multiSelect(HzhInborn hzhInborn) {
        return hzhInbornMapper.multiSelect(hzhInborn);
    }
}
