package org.joonzis.DI_3_component;

import org.springframework.stereotype.Component;

/*
 * 	java => @Component
 * 	xml => <bean class="org.joonzis.DI_3_component.LgTV">
 * 
 * 	java => @Component("TV")
 * 	xml => <bean id="tv" class="org.joonzis.DI_3_component.LgTV">
 * 
 * 	@Component와 @Configuration/@Bean은 기능이 비슷
 * 	@Component는 클래스 단위
 * 	@Bean은 메소드 단위
 */

@Component("TV")
public class LgTV implements TV{
	
	public LgTV() {
		System.out.println("==> LgTV 객체 생성");
	}
	@Override
	public void PowerOff() {
		System.out.println("LgTV -- 전원 on");
	}
	@Override
	public void PowerOn() {
		System.out.println("LgTV -- 전원 off");		
	}
	@Override
	public void VolumeOff() {
		System.out.println("LgTV -- 소리 up");
	}
	@Override
	public void VolumeOn() {
		System.out.println("LgTV -- 소리 down");		
	}
}