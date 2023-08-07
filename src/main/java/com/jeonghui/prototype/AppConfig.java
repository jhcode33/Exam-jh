package com.jeonghui.prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean
	public SingletonBean singletonBean() {
		SingletonBean singleton = new SingletonBean();
		//singleton.setPrototypeBean(prototypeBean());
		return singleton;
	}
	
	@Bean
	@Scope("prototype")
	public PrototypeBean prototypeBean() {
		return new PrototypeBean();
	}
}
