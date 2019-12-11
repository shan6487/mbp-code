package com.springcloud.service.order.mapper;

import com.springcloud.api.order.DTO.OrderDTO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: xieyongshan
 * @Date: 2019/8/22 14:50
 * @Description: todo
 */
@Component
public interface OrderMapper {

    List<OrderDTO> getOrderByUserId(OrderDTO userDTO);

}
