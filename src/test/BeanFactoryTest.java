package test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import model.Araba;

public class BeanFactoryTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
		rdr.loadBeanDefinitions(new ClassPathResource("test/app-context.xml"));

		Araba car = (Araba) factory.getBean("arabaId");

		System.out.println(car.getMarka());
	}
}