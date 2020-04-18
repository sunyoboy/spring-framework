package com.lieve;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunlijiang
 * @date 2020/1/5
 */
public class AppConfigTest {
	AbstractBeanFactory abstractBeanFactory;
	DefaultListableBeanFactory beanFactory;
	ClassPathXmlApplicationContext applicationContext;


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		AppConfig config = ac.getBean(AppConfig.class);
		AppConfig appConfig = new AppConfig();
		X result = appConfig.getX();
		Assert.assertEquals(new X(), result);
	}

	/*@Test
	public void testGetY() throws Exception {
		Y result = appConfig.getY();
		Assert.assertEquals(new Y(), result);
	}*/
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme