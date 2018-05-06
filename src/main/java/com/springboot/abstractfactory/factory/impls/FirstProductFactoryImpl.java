package com.springboot.abstractfactory.factory.impls;

import com.springboot.abstractfactory.factory.AbstractProductFactory;
import com.springboot.abstractfactory.services.ProductService;
import com.springboot.abstractfactory.services.impls.FirstProductServiceImpl;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

@Description(value = "Concrete implementation of product factory.")
@Service
public class FirstProductFactoryImpl implements AbstractProductFactory {

    @Override
    public ProductService createProduct() {
        return new FirstProductServiceImpl();
    }
}
