package net.daum.webtoon.spring;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CacheableExample {
	final static private Logger logger = Logger.getLogger(Cacheable.class.getName());

	@Cacheable(value="cache")
	public String get(int i) {
		String message = "hi";
		logger.info("*****");
		return message;
	}
	
	public String localGet(int i) {
		return get(i);
	}

}
