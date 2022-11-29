package collection.injection.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("collection-injection-xml.xml");
		System.out.println("Core Container is ready");
		
		/*ListInjection listInjection =container.getBean("listInjectionBean",ListInjection.class);
		listInjection.processConfigFiles();*/
	}

}
