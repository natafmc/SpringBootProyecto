package com.posgrado.ecommerce.exception;

public class RoleNameExists extends  RuntimeException{
  private static final String ERROR_MESSAGE = "Role with name %s already exists";
  public RoleNameExists(String name) {
    super(String.format(ERROR_MESSAGE, name));
  }
}