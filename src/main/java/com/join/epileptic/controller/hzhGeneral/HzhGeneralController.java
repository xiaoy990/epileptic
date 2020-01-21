package com.join.epileptic.controller.hzhGeneral;

import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.service.hzhGeneralService.HzhGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("general")
public class HzhGeneralController {

    @Autowired
    HzhGeneralService hzhGeneralService;

    @RequestMapping("selectGeneral")
    public List<HzhGeneral> queryGenerals(HzhGeneral hzhGeneral){
        return hzhGeneralService.multiSelect(hzhGeneral);
    }

    @RequestMapping("delGeneral")
    public void deleteGeneral(HzhGeneral hzhGeneral){
        hzhGeneralService.deleteByPrimaryKey(hzhGeneral.getId());
    }

    @RequestMapping("updateGeneral")
    public void updateGeneral(HzhGeneral hzhGeneral){
        hzhGeneralService.updateByPrimaryKey(hzhGeneral);
    }

    @RequestMapping("insertGeneral")
    public List<HzhGeneral> insertGeneral(HzhGeneral hzhGeneral){
        int insertResult = hzhGeneralService.insert(hzhGeneral);
        List hzhGenerals = hzhGeneralService.multiSelect(hzhGeneral);
        return hzhGenerals;
    }
}
