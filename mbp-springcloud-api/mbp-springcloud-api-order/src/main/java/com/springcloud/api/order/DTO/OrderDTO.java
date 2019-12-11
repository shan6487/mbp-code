package com.springcloud.api.order.DTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: xieyongshan
 * @Date: 2019/8/22 11:27
 * @Description: todo
 */
@Data
@ApiModel(value = "订单请求参数")
public class OrderDTO implements Serializable {

    private static final long serialVersionUID = -2266856638707484665L;

    private Long id;

    @ApiModelProperty("订单号")
    private String orderNo;

    @ApiModelProperty("用户id")
    private Long userId;

    private String orderDesc;

    private BigDecimal orderPrice;

    private Integer orderStatus;

    private Date createTime;


}
