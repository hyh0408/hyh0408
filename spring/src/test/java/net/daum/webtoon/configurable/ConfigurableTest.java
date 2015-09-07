package net.daum.webtoon.configurable;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = Config.class)
//@ContextConfiguration("/net/daum/webtoon/configurable/application.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ConfigurableTest {
	final static private Logger logger = Logger.getLogger(ConfigurableTest.class.getName());

	@Test
	public void test() {
		ConfigurableExample configurableExample = ConfigurableExample.getInstance();
		logger.info("*********   configurable class ****   " + configurableExample.getClass() + "    **   " + configurableExample);
		configurableExample.test();
		
	}
}
