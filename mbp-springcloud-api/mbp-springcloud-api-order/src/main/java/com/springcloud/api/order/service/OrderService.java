package com.springcloud.api.order.service;

import com.springcloud.api.order.DTO.OrderDTO;
import com.springcloud.common.resopnse.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


/**
 * @Author: xieyongshan
 * @Date: 2019/8/22 11:29
 * @Description: todo
 */
@Api(tags="订单服务接口")
public interface OrderService {

    /**
     * 根据id查询用户信息
     * @param orderDTO
     * @return
     */
    @PostMapping("getOrderByUserId")
    @ApiOperation("根据用户id查询用户订单信息")
   Response<List<OrderDTO>> getOrderByUserId(@RequestBody OrderDTO orderDTO);

}
