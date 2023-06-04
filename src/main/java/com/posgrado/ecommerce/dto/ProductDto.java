package com.posgrado.ecommerce.dto;

import java.util.UUID;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Data
public class ProductDto {

  private String name;
  private String description;
  private String imageUrl;
  private double price;
  private int stock;
  private boolean active;
  private UUID categoryId;

  public String getName(){
    return this.name;
  }

}