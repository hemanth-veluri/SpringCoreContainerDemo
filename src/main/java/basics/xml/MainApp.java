package basics.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		/*
		 * LoginIO loginIO = new LoginIO(); loginIO.processLogin();
		 */

		ApplicationContext container = new ClassPathXmlApplicationContext("spring-core-container-basics.xml");
		System.out.println("Core Container is ready");

		LoginIO loginIO = (LoginIO) container.getBean("loginIOBean");
		loginIO.processLogin();

	}

}
