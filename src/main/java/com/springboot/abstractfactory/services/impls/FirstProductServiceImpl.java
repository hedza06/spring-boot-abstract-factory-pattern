package com.springboot.abstractfactory.services.impls;

import com.springboot.abstractfactory.services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

@Description(value = "FirstProduct implementation.")
@Service
public class FirstProductServiceImpl implements ProductService {

    private final Logger logger = LoggerFactory.getLogger(FirstProductServiceImpl.class);

    @Override
    public void setTitle(String title) {
        logger.info("Setting first product title...");
    }

    @Override
    public void calculateSomething() {
        logger.info("Calculating something for first product...");
    }
}
