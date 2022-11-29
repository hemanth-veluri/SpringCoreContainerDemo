package collection.injection.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(CollectionInjectionAnnotationConfig.class);
		
		
		
		System.out.println("Core Container is ready");
		
		/*ListInjection listInjection = container.getBean("listInjectionBean", ListInjection.class);
		listInjection.processConfigFiles();*/
		
		MapInjection mapInjection = container.getBean("mapInjectionBean", MapInjection.class);
		mapInjection.displayCourseDetails();
		
	}

}
