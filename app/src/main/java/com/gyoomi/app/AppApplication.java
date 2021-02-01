package com.gyoomi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * AppApplication - 启动类
 *
 * @author Leon
 * @version 2021/2/1 21:54
 */
@SpringBootApplication
public class AppApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(AppApplication.class, args);
		System.out.println("Spring Boot 微服务启动【OK】");
	}

}
