package com.mkluo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: luomingkui
 * @Date: 2019/1/4 11:19
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ParkInfoQO",description = "城市名code和城市名称")
public class ParkInfoQO {

    @ApiModelProperty(value = "城市code",example = "abc",required = false)
    private String orgCode;

    @ApiModelProperty(value = "城市名称",example = "北京",required = false)
    private String city;

}
