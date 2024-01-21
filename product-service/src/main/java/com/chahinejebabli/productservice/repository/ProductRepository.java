package com.chahinejebabli.productservice.repository;

import com.chahinejebabli.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
