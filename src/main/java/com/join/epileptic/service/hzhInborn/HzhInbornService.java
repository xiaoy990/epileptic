package com.join.epileptic.service.hzhInborn;


import com.join.epileptic.entity.hzhInborn.HzhInborn;

import java.util.List;

/**
 * @Author:ljx
 * @Date:2019/11/28
 * @Description:
 */
public interface HzhInbornService {
    int insert(HzhInborn hzhInborn);
    int updateById(HzhInborn hzhInborn);
    int deleteById(int id);
    List<HzhInborn> multiSelect(HzhInborn hzhInborn);
}
