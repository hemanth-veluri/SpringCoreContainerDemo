package map.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMainApp {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(TestSpringConfig.class);
		System.out.println("Core Container is ready");
	}

}
