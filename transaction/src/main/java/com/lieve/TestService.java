package com.lieve;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sunlijiang
 * @date 2019/12/22
 */
@Service
public class TestService {

	@Transactional
	public void print() {
		System.out.println("test");
	}
}
