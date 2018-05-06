package com.springboot.abstractfactory.services;

import org.springframework.context.annotation.Description;

@Description(value = "Definition of product methods.")
public interface ProductService {

    void setTitle(String title);

    void calculateSomething();

}
