package com.join.epileptic;

import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.entity.hzhGeneral.HzhGeneralExample;
import com.join.epileptic.entity.hzhIllnerssed.HzhIllnerssed;
import com.join.epileptic.entity.hzhInborn.HzhInborn;
import com.join.epileptic.mapper.hzhGeneral.HzhGeneralMapper;
import com.join.epileptic.mapper.hzhIllnerssed.HzhIllnerssedMapper;
import com.join.epileptic.mapper.hzhInborn.HzhInbornMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EpilepticApplicationTests {

    @Autowired
    HzhGeneralMapper hzhGeneralMapper;
    @Autowired
    HzhIllnerssedMapper hzhIllnerssedMapper;
    @Autowired
    HzhInbornMapper hzhInbornMapper;

    @Test
    void contextLoads() {
        HzhGeneral hzhGeneral = new HzhGeneral();
//        hzhGeneral.setName("礼拜1");
        hzhGeneral.setAge(20);
        System.out.println(hzhGeneralMapper.multiSelect(hzhGeneral));
//        hzhGeneralMapper.insert(hzhGeneral);
//        hzhGeneralMapper.deleteByPrimaryKey(hzhGeneral.getId()) ;
    }

    @Test
    void testHzhIllnerssedMapper(){
        HzhIllnerssed hzhIllnerssed=new HzhIllnerssed();
        hzhIllnerssed.setTell("可l");
        System.out.println(hzhIllnerssedMapper.multiSelect(hzhIllnerssed));
    }

    @Test
    void testHzhInbornMapper(){
        HzhInborn hzhInborn=new HzhInborn();
        hzhInborn.setNosereason("42424");
        System.out.println(hzhInbornMapper.multiSelect(hzhInborn));
    }


}
