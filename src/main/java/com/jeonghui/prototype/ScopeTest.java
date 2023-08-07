package com.jeonghui.prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = { AppConfig.class })
public class ScopeTest {
	
	//@Autowired
	AnnotationConfigApplicationContext context;
	
	@BeforeEach
	public void init() {
		System.out.println("============================================");
		System.out.println("ApplicationContext 초기화");
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println();
	}
	
	@AfterEach
	public void deinit() {
		context.close();
	}
	
	@Test
	public void objectFactory() {
		SingletonBean singleton1 = context.getBean("singletonBean", SingletonBean.class);
		SingletonBean singleton2 = context.getBean("singletonBean", SingletonBean.class);
		
		int count1 = singleton1.logic();
		int count2 = singleton2.logic();
		
		System.out.println();
		System.out.println("count1 = " + count1);
		System.out.println("count2 = " + count2);
		
		System.out.println();
		System.out.println("objectFactory는 빈을 매번 새로 생성함");
		PrototypeBean proto1 = singleton1.getPrototypeBeanOfObjectProvider();
		PrototypeBean proto2 = singleton2.getPrototypeBeanOfObjectProvider();
	}
	

	@Test
	public void makePrototypeBean() {		
		SingletonBean singleton = context.getBean("singletonBean", SingletonBean.class);
		PrototypeBean prototype1 = context.getBean("prototypeBean", PrototypeBean.class);
	}
	
	
	@Test
	public void destroyBean() {
		SingletonBean singleton = context.getBean("singletonBean", SingletonBean.class);
		int count = context.getBeanDefinitionCount();
		System.out.println("싱글톤 빈을 생성하고 난 뒤 빈 개수: " + count);
		
		String[] beanNames1 = context.getBeanDefinitionNames();
		for (String beanName : beanNames1) {
			System.out.println(beanName);
		}
		System.out.println("********************************************");
		System.out.println();

		
		PrototypeBean prototype = context.getBean("prototypeBean", PrototypeBean.class);
		count = context.getBeanDefinitionCount();
		System.out.println("프로토타입 빈을 생성하고 난 뒤 빈 개수: " + count);
		
		String[] beanNames2 = context.getBeanDefinitionNames();
		for (String beanName : beanNames2) {
			System.out.println(beanName);
		}
		System.out.println("********************************************");
		System.out.println();
		
		context.getBeanFactory().destroyBean(prototype);
		int afterCount = context.getBeanDefinitionCount();
		System.out.println("프로토타입 빈을 삭제 후 빈 개수: " + afterCount);
		String[] beanNames3 = context.getBeanDefinitionNames();
		for (String beanName : beanNames3) {
			System.out.println(beanName);
		}
		System.out.println("********************************************");
	}
}
