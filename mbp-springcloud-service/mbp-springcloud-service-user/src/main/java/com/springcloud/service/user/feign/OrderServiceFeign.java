package com.springcloud.service.user.feign;

import com.springcloud.api.order.service.OrderService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: xieyongshan
 * @Date: 2019/8/23 10:44
 * @Description: todo
 */
@FeignClient("mbp-springcloud-service-order")
public interface OrderServiceFeign extends OrderService {
}
