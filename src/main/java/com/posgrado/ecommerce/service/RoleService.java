package com.posgrado.ecommerce.service;

import com.posgrado.ecommerce.dto.RoleDto;
import com.posgrado.ecommerce.entity.Role;
import java.util.List;

public interface RoleService {

  Role create(RoleDto role);

  Role getByName(String name);

  Boolean findName(String name);

  List<Role> getAll();
}