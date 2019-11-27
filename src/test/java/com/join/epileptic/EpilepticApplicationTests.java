package com.join.epileptic;

import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.entity.hzhGeneral.HzhGeneralExample;
import com.join.epileptic.mapper.hzhGeneral.HzhGeneralMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EpilepticApplicationTests {

    @Autowired
    HzhGeneralMapper hzhGeneralMapper;

    @Test
    void contextLoads() {
        HzhGeneral hzhGeneral = new HzhGeneral();
//        hzhGeneral.setName("礼拜1");
        System.out.println(hzhGeneralMapper.multiSelect(hzhGeneral));
    }

}
