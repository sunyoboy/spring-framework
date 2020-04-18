package com.lieve;

import org.springframework.context.annotation.ComponentScan;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author sunlijiang
 * @date 2019/12/22
 */

@ComponentScan("com.lieve.service")
public class Config {

	public static void main(String[] args) {
		ThreadPoolExecutor threadPoolExecutor;
		ExecutorService executors = Executors.newSingleThreadExecutor();
		executors.shutdown();
	}
}
