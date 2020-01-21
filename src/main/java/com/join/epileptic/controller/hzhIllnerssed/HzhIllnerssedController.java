package com.join.epileptic.controller.hzhIllnerssed;

import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.entity.hzhIllnerssed.HzhIllnerssed;
import com.join.epileptic.entity.hzhIllnerssed.HzhIllnerssedDto;
import com.join.epileptic.service.hzhIllnerssed.HzhIllnerssedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:ljx
 * @Date:2019/11/28
 * @Description:
 */
@RestController
@CrossOrigin
@RequestMapping("/illnerssed")
public class HzhIllnerssedController {

    @Autowired
    HzhIllnerssedService hzhIllnerssedService;

    @RequestMapping("/insert")
    public int insert(HzhIllnerssed hzhIllnerssed){
        return hzhIllnerssedService.insert(hzhIllnerssed);
    }

    @RequestMapping("/selectIllnerssed")
    public List<HzhIllnerssedDto> listAll(HzhIllnerssed hzhIllnerssed, HzhGeneral hzhGeneral){
        if (hzhIllnerssed == null){
            return hzhIllnerssedService.multiSelect(new HzhIllnerssed(),new HzhGeneral());
        }
        return hzhIllnerssedService.multiSelect(hzhIllnerssed,hzhGeneral);
    }

    @RequestMapping("/update")
    public int updateById(HzhIllnerssed hzhIllnerssed){
        return hzhIllnerssedService.updateById(hzhIllnerssed);
    }

    @RequestMapping("/delete")
    public int deleteById(int id){
        return hzhIllnerssedService.deleteById(id);
    }

}
