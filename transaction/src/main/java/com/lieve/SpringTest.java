package com.lieve;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author sunlijiang
 * @date 2019/12/22
 */
public class SpringTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		TestService testService = (TestService) ac.getBean("testService");
		testService.print();

		AppConfig config = ac.getBean(AppConfig.class);
		AppConfig appConfig = new AppConfig();
	}
}
