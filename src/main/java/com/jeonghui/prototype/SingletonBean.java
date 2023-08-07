package com.jeonghui.prototype;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;

public class SingletonBean {
	
	//== ObjectProvider은 요청할 때마다 새로운 객체를 생성해준다
	//== 그러면 싱글톤 내부의 스코프 타입 빈이 두개인가??????
	@Autowired
	private ObjectProvider<PrototypeBean> prototypeProvider;
	
	public int logic() {
		PrototypeBean prototypeBean = prototypeProvider.getObject();
		prototypeBean.addCount();
		return prototypeBean.getCount();
	}
	
	//== singletonBean이 싱글톤으로 관리되기 때문에 context에서 getBean() 메소드로
	//== Bean을 가지고 와도 프로토타입 빈에 대한 참조가 같기 때문에 숫자가 1 -> 2 으로 증가한다.
//	@Autowired
//	private PrototypeBean prototypeBean;
//	
//	public int logic() {
//		prototypeBean.addCount();
//		return prototypeBean.getCount();
//	}
	
	@PostConstruct
	public void init() {
		System.out.println("Singleton bean init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Singleton bean destroy");
	}
	
	// ObjectProvider을 통해서 prototype 객체 반환
	public PrototypeBean getPrototypeBeanOfObjectProvider() {
        return prototypeProvider.getObject();
        
        // getObeject() -> ObejctFactory
        // getIfAvailable() -> ObjectProvider 
    }

//    public void setPrototypeBean(PrototypeBean prototypeBean) {
//        this.prototypeBean = prototypeBean;
//    }
    
    
}
