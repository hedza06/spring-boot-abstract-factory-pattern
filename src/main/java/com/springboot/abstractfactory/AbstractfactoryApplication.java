package com.springboot.abstractfactory;

import com.springboot.abstractfactory.builders.ProductBuilder;
import com.springboot.abstractfactory.factory.AbstractProductFactory;
import com.springboot.abstractfactory.factory.impls.FirstProductFactoryImpl;
import com.springboot.abstractfactory.factory.impls.SecondProductFactoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractfactoryApplication {

	private static String productType = "FIRST_PRODUCT";

	public static void main(String[] args)
	{
		// run application...
		SpringApplication.run(AbstractfactoryApplication.class, args);

		// product builder instance
		ProductBuilder productBuilder = new ProductBuilder();

		// deciding which product implementation to use...
		AbstractProductFactory abstractProductFactory;
		if (productType.contentEquals("FIRST_PRODUCT")) {
			abstractProductFactory = new FirstProductFactoryImpl();
		}
		else {
			abstractProductFactory = new SecondProductFactoryImpl();
		}

		// build product...
		productBuilder.buildProduct(abstractProductFactory);
	}
}
