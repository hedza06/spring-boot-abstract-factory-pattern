package com.springboot.abstractfactory.factory;

import com.springboot.abstractfactory.services.ProductService;
import org.springframework.context.annotation.Description;

@Description(value = "Product Factory - Creational Factory.")
public interface AbstractProductFactory {

    ProductService createProduct();

}
