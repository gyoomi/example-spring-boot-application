package com.gyoomi.app;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BEncoderStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * AppApplication - 启动类
 *
 * @author Leon
 * @version 2021/2/1 21:54
 */
@SpringBootApplication
@Import({Demo.class})
public class AppApplication
{

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(AppApplication.class, args);
		System.out.println("Spring Boot 微服务启动【OK】");
	}

}
