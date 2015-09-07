package net.daum.webtoon.spring;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application.xml")
@Category(CacheableExample.class)
public class CacheableTest {
	@Autowired
	private CacheableExample cacheableExample;
	
	@Test
	public void cache() {
		System.out.println("**** cacheable : " + cacheableExample.getClass());
		cacheableExample.get(1);
		cacheableExample.get(1);
	}
}
