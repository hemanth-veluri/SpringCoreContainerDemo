package basics.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		//ApplicationContext container = new ClassPathXmlApplicationContext("spring-core-container-basics.xml");
		
		//ApplicationContext container = new ClassPathXmlApplicationContext("spring-core-container-basics-annotation.xml");
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringCCBasicsConfig.class);
		System.out.println("Core Container is ready");
		
		//LoginIO loginIO = (LoginIO) container.getBean("loginIOBean");
		LoginIO loginIO = container.getBean(LoginIO.class);
		loginIO.processLogin();

	}

}
