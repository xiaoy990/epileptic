package com.join.epileptic.controller.hzhTreatController;

import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.entity.hzhTreat.HzhTreat;
import com.join.epileptic.entity.hzhTreat.HzhTreatDto;
import com.join.epileptic.service.hzhTreatService.HzhTreatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("treat")
public class HzhTreatController {

    @Autowired
    HzhTreatService hzhTreatService;

    @RequestMapping("selectTreat")
    public List<HzhTreatDto> multiSelect(HzhTreat hzhTreat, HzhGeneral hzhGeneral) {
        return hzhTreatService.multiSelect(hzhTreat,hzhGeneral);
    }

    @RequestMapping("delTreat")
    public void deleteByPrimaryKey(Integer id) {
        hzhTreatService.deleteByPrimaryKey(id);
    }

    @RequestMapping("updateTreat")
    public void updateByPrimaryKey(HzhTreat hzhTreat) {
        hzhTreatService.updateByPrimaryKey(hzhTreat);
    }

    @RequestMapping("insertTreat")
    public void insert(HzhTreat hzhTreat) {
        hzhTreatService.insert(hzhTreat);
    }
}
