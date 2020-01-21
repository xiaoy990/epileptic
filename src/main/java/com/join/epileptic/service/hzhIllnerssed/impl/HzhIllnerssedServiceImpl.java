package com.join.epileptic.service.hzhIllnerssed.impl;

import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.entity.hzhIllnerssed.HzhIllnerssed;
import com.join.epileptic.entity.hzhIllnerssed.HzhIllnerssedDto;
import com.join.epileptic.mapper.hzhIllnerssed.HzhIllnerssedMapper;
import com.join.epileptic.service.hzhIllnerssed.HzhIllnerssedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;

/**
 * @Author:ljx
 * @Date:2019/11/28
 * @Description:
 */
@Service
public class HzhIllnerssedServiceImpl implements HzhIllnerssedService {
    @Autowired
    HzhIllnerssedMapper hzhIllnerssedMapper;

    @Override
    public int insert(HzhIllnerssed hzhIllnerssed) {
        hzhIllnerssedMapper.insert(hzhIllnerssed);
        return hzhIllnerssed.getId();
    }

    @Override
    public int updateById(HzhIllnerssed hzhIllnerssed) {
        hzhIllnerssedMapper.updateByPrimaryKey(hzhIllnerssed);
        return hzhIllnerssed.getId();
    }

    @Override
    public int deleteById(int id) {
        hzhIllnerssedMapper.deleteByPrimaryKey(id);
        return id;
    }

    @Override
    public List<HzhIllnerssedDto> multiSelect(HzhIllnerssed hzhIllnerssed, HzhGeneral hzhGeneral) {
        return hzhIllnerssedMapper.multiSelect(hzhIllnerssed, hzhGeneral);
    }
}
