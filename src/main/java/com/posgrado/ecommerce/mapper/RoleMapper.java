package com.posgrado.ecommerce.mapper;

import com.posgrado.ecommerce.dto.ProductDto;
import com.posgrado.ecommerce.dto.RoleDto;
import com.posgrado.ecommerce.entity.Product;
import com.posgrado.ecommerce.entity.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {

  public Role fromDto(RoleDto dto) {
    Role row = new Role();
    row.setName(dto.getName().toUpperCase());
    row.setDescription(dto.getDescription().trim());
    return row;
  }

}