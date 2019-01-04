package com.mkluo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: luomingkui
 * @Date: 2019/1/4 11:20
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ParkInfoDO",description = "园区的详细信息")
public class ParkInfoVo {
    /**园区编码*/
    @ApiModelProperty(value = "园区编码")
    private String parkCode;

    /**园区名称*/
    @ApiModelProperty(value = "园区名称")
    private String parkName;

    /**园区面积*/
    @ApiModelProperty(value = "园区面积")
    private String architectureArea;

    @ApiModelProperty(value = "所属城市")
    private String city;

}