package org.springframework.beans.mytest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class BeanFactoryTest {
	@Test
	public void testSimpleLoad(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("org/springframework/beans/factory/BeanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean)bf.getBean("myTestBean");
		System.out.println(bean.getTestStr());
	}
}
