package com.jeonghui.prototype;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PrototypeBean {
	
	private int count = 0;
	
	public void addCount() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Prototype bean init");
	}
	
	@PreDestroy
	public void destroy() {
	    System.out.println("Prototype bean destroy! : " + this.hashCode());
	}
}
