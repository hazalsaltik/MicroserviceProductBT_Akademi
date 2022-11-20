package com.bt_akademi.product_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class MicroserviceProductBtAkademiApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(MicroserviceProductBtAkademiApplication.class, args);
	}
}
