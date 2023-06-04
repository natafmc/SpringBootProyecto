package com.posgrado.ecommerce.service;

import com.posgrado.ecommerce.dto.OrderDto;
import com.posgrado.ecommerce.entity.Order;
import com.posgrado.ecommerce.entity.OrderItem;
import com.posgrado.ecommerce.repository.OrderRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

  private ProductService productService;
  private OrderRepository orderRepository;

  @Override
  public String create(OrderDto dto) {

    Order order = new Order();
    order.setComment(dto.getComment());

    List<OrderItem> items = dto.getItems().stream().map((itemDto) -> {
      OrderItem item = new OrderItem();
      item.setQuantity(itemDto.getQuantity());
      item.setProduct(productService.getById(itemDto.getProductId()));
      item.setOrder(order);
      return item;
    }).toList();

    order.setItems(items);
    //TODO: Set user

    Order orderSaved = orderRepository.save(order);

    return "Order saved successfully";
  }
}
