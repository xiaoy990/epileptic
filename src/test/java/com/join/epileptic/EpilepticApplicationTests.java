package com.join.epileptic;

import com.join.epileptic.entity.hzhDiagnose.HzhDiagnose;
import com.join.epileptic.entity.hzhFlup.HzhFlup;
import com.join.epileptic.entity.hzhGeneral.HzhGeneral;
import com.join.epileptic.entity.hzhTreat.HzhTreat;
import com.join.epileptic.mapper.hzhDiagnose.HzhDiagnoseMapper;
import com.join.epileptic.mapper.hzhFlup.HzhFlupMapper;
import com.join.epileptic.mapper.hzhGeneral.HzhGeneralMapper;
import com.join.epileptic.mapper.hzhTreat.HzhTreatMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EpilepticApplicationTests {

    @Autowired
    HzhGeneralMapper hzhGeneralMapper;
    @Autowired
    HzhDiagnoseMapper hzhDiagnoseMapper;
    @Autowired
    HzhTreatMapper hzhTreatMapper;
    @Autowired
    HzhFlupMapper hzhFlupMapper;

    @Test
    void contextLoads() {
        HzhGeneral hzhGeneral = new HzhGeneral();
        hzhGeneral.setName("礼拜1");
        hzhGeneralMapper.multiSelect(hzhGeneral).forEach(System.out::println);
        hzhDiagnoseMapper.multiSelect(new HzhDiagnose(),new HzhGeneral()).forEach(System.out::println);
        hzhTreatMapper.multiSelect(new HzhTreat(),new HzhGeneral()).forEach(System.out::println);
        hzhFlupMapper.multiSelect(new HzhFlup(),new HzhGeneral()).forEach(System.out::println);
    }

}
