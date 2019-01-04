package com.mkluo.controller;

import com.google.common.collect.Lists;
import com.mkluo.bean.ParkInfoQO;
import com.mkluo.bean.ParkInfoVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: luomingkui
 * @Date: 2019/1/4 11:22
 * @Description:
 */

@Api(tags = "测试Swagger接口", value = "test interface")
@RestController
@RequestMapping("/test")
public class SwaggerController {

    @ApiOperation(value = "测试swagger接口", notes = "测试swagger接口分组")
    @PostMapping("/swagger")
    public List<ParkInfoVo> selectByParkCode(@ApiParam(value = "城市（城市code和城市名称）") @RequestBody ParkInfoQO parkInfoQO){
        List<ParkInfoVo> list = Lists.newArrayList();
        ParkInfoVo pk = new ParkInfoVo();
        pk.setParkCode("110110");
        pk.setParkName("北京昌平园区");
        pk.setCity("北京");
        pk.setArchitectureArea("10000平米");
        list.add(pk);
        return list;
    }
}