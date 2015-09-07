package net.daum.webtoon.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = Config.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AopTest {
	@Autowired
	private AopExample aopExample;
	@Test
	public void aop() {
		System.out.println(aopExample.getClass());
		aopExample.testAop();
	}
}
