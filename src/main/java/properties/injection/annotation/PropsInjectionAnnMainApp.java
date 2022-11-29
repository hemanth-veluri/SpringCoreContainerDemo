package properties.injection.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropsInjectionAnnMainApp {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(PropsInjectionAnnotationConfig.class);
		System.out.println("Core Container is Ready");

	}

}
