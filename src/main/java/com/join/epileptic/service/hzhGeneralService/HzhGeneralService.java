package com.join.epileptic.service.hzhGeneralService;

import com.join.epileptic.entity.hzhGeneral.HzhGeneral;

import java.util.List;

public interface HzhGeneralService {
    List<HzhGeneral> multiSelect(HzhGeneral hzhGeneral);
    void deleteByPrimaryKey(Integer id);
    void updateByPrimaryKey(HzhGeneral hzhGeneral);
    int insert(HzhGeneral hzhGeneral);
    HzhGeneral selectByPk(Integer pk);
}
