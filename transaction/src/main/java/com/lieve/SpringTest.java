package com.lieve;

import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author sunlijiang
 * @date 2019/12/22
 */
public class SpringTest {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext;
		// 初始化Spring 容器, 完成依赖注入（初始化Bean, bean的初始化过程-Spring bean 的生命周期）
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		TestService testService = (TestService) ac.getBean("testService");
		testService.print();
		System.out.println(ac.getBeanDefinitionCount());
		TestService service = ac.getBean(TestService.class);
		System.out.println(service + "\t" + testService);
		AppConfig config = ac.getBean(AppConfig.class);
		AppConfig appConfig = new AppConfig();

		/**
		 * scan
		 * parse
		 * 调用扩展
		 * 遍历map validate prototype
		 * new
		 */
		/*
		for () {
			GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
			beanDefinition.setBeanClass();
			beanDefinition.setBeanClassName();
			beanDefinition.setScope("prototype");
			// put in map, add to list
		}ss
		*/

	}

	private void closeCircularReference() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		AbstractAutowireCapableBeanFactory beanFactory = (AbstractAutowireCapableBeanFactory) ac.getBeanFactory();
		beanFactory.setAllowCircularReferences(false);
		ac.register(AppConfig.class);
		ac.refresh();
	}
}
