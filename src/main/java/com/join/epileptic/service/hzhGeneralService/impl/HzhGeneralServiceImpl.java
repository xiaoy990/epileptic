package com.join.epileptic.service.hzhGeneralService.impl;

import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.mapper.hzhGeneral.HzhGeneralMapper;
import com.join.epileptic.service.hzhGeneralService.HzhGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HzhGeneralServiceImpl implements HzhGeneralService {

    @Autowired
    HzhGeneralMapper hzhGeneralMapper;

    @Override
    public List<HzhGeneral> multiSelect(HzhGeneral hzhGeneral) {
        return hzhGeneralMapper.multiSelect(hzhGeneral);
    }

    @Override
    public void deleteByPrimaryKey(Integer id) {
        hzhGeneralMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKey(HzhGeneral hzhGeneral) {
        hzhGeneralMapper.updateByPrimaryKey(hzhGeneral);
    }

    @Override
    public int insert(HzhGeneral hzhGeneral) {
        return hzhGeneralMapper.insert(hzhGeneral);
    }

    @Override
    public HzhGeneral selectByPk(Integer pk) {
        return hzhGeneralMapper.selectByPrimaryKey(pk);
    }
}
