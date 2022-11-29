package collection.injection.annotation;

import java.util.Properties;

public class SprinBeanConfigPropsInjection {
	Properties properties;

	public void setProperties(Properties properties) {
		this.properties = properties;
		System.out.println(properties +" is injected");		
	}

	public void displayDetails() {
		System.out.println("Name :: "+properties.getProperty("name"));
		System.out.println("Age :: "+properties.getProperty("age"));
		System.out.println("City :: "+properties.getProperty("city"));
	}
	
	
	
}
