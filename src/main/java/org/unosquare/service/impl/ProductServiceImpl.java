package org.unosquare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.unosquare.repository.ProductRepository;
import org.unosquare.service.ProductService;
import org.unosquare.vo.Product;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product getBy(Long id) {
        return productRepository.findById(id).orElse(new Product());
    }
}
