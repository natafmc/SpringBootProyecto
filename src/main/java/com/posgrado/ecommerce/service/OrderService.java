package com.posgrado.ecommerce.service;


import com.posgrado.ecommerce.dto.OrderDto;

public interface OrderService {

  String create(OrderDto order);
}
