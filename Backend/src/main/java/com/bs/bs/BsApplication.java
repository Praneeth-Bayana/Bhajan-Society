package com.bs.bs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bs.bs")
public class BsApplication {
	public static void main(String[] args) {
		SpringApplication.run(BsApplication.class, args);
	}

	//Setting own port rather than default 8080 port!
//	@Bean
//	public TomcatServletWebServerFactory tomcatServletWebServerFactory() {
//		TomcatServletWebServerFactory tomcatServletWebServerFactory = new
//				TomcatServletWebServerFactory();
//		tomcatServletWebServerFactory.setPort(999);
//		return tomcatServletWebServerFactory;
//	}
}

