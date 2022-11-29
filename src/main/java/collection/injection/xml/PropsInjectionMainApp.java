package collection.injection.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropsInjectionMainApp {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("properties-injection-xml.xml");
		System.out.println("Core Container is ready");
		
		/*SprinBeanConfigPropsInjection sprinBeanConfigPropsInjection = container.getBean(SprinBeanConfigPropsInjection.class);
		sprinBeanConfigPropsInjection.displayDetails();*/
	}	

}
