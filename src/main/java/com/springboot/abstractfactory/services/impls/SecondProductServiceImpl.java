package com.springboot.abstractfactory.services.impls;

import com.springboot.abstractfactory.services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

@Description(value = "SecondProduct service implementation.")
@Service
public class SecondProductServiceImpl implements ProductService {

    private final Logger logger = LoggerFactory.getLogger(SecondProductServiceImpl.class);

    @Override
    public void setTitle(String title) {
        logger.info("Setting title of second product...");
    }

    @Override
    public void calculateSomething() {
        logger.info("Calculating something for second product...");
    }
}
