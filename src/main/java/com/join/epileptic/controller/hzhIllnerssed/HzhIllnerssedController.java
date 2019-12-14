package com.join.epileptic.controller.hzhIllnerssed;

import com.join.epileptic.entity.hzhIllnerssed.HzhIllnerssed;
import com.join.epileptic.service.hzhIllnerssed.HzhIllnerssedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author:ljx
 * @Date:2019/11/28
 * @Description:
 */
@Controller
@CrossOrigin
@RequestMapping("/hzhIllnerssed")
public class HzhIllnerssedController {
    @Autowired
    HzhIllnerssedService hzhIllnerssedService;


    @RequestMapping("/insert")
    public int insert(@RequestBody HzhIllnerssed hzhIllnerssed){
        return hzhIllnerssedService.insert(hzhIllnerssed);
    }

    @RequestMapping("/listAll")
    public List<HzhIllnerssed> listAll(){
        return hzhIllnerssedService.multiSelect(new HzhIllnerssed());
    }

    @RequestMapping("/updateById")
    public int updateById(@RequestBody HzhIllnerssed hzhIllnerssed){
        return hzhIllnerssedService.updateById(hzhIllnerssed);
    }

    @RequestMapping("/deleteById")
    public int deleteById(@RequestBody int id){
        return hzhIllnerssedService.deleteById(id);
    }

}
