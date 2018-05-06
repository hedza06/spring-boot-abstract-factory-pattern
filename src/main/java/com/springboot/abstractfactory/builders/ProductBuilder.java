package com.springboot.abstractfactory.builders;

import com.springboot.abstractfactory.factory.AbstractProductFactory;
import com.springboot.abstractfactory.services.ProductService;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Component;

@Description(value = "Product builder component.")
@Component
public class ProductBuilder {

    public void buildProduct(AbstractProductFactory productFactory)
    {
        ProductService productService = productFactory.createProduct();
        productService.setTitle("Some title");
        productService.calculateSomething();
    }

}
