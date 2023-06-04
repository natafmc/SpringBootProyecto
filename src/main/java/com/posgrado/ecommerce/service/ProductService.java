package com.posgrado.ecommerce.service;

import com.posgrado.ecommerce.dto.PageDto;
import com.posgrado.ecommerce.dto.ProductDto;
import com.posgrado.ecommerce.entity.Product;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {

  Product create(ProductDto dto);

  Product update(UUID id, ProductDto dto);

  Product getById(UUID id);

  Page<Product> getProducts(Pageable pageable);

  PageDto<Product> getFilteredProducts(Double minPrice, Double maxPrice, Pageable pageable);

  Set<Product> getProductByCategoryId(UUID id);

}