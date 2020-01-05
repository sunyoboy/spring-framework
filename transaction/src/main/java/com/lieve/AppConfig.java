package com.lieve;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author sunlijiang
 * @date 2020/1/5
 */
@Configuration
public class AppConfig {

	@Bean
	@Scope("prototype")
	public X getX() {
		return new X() ;
	}

	@Bean Y getY() {
		return new Y();
	}
}
