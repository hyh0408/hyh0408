package net.daum.webtoon.configurable;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component
public class ConfigurableObject {

	final static private Logger logger = Logger.getLogger(ConfigurableObject.class.getName());
	
	public void test() {
		logger.info("************  configurable ************");
	}

}
