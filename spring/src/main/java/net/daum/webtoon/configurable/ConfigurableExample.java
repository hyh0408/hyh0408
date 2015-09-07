package net.daum.webtoon.configurable;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

@Configurable
public class ConfigurableExample {
	final static private Logger logger = Logger.getLogger(ConfigurableExample.class.getName());

	private static ConfigurableExample configurableExample;
	
	@Autowired
	private ConfigurableObject configurableObject;

	public void test() {
		logger.info("** configurableObject **  : " + configurableObject);
		configurableObject.test();
	}
	
	public static ConfigurableExample getInstance() {
		return new ConfigurableExample();
	}


}
