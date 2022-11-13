package com.bt_akademi.product_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class MicroserviceProductBtAkademiApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(MicroserviceProductBtAkademiApplication.class, args);
	}
}
