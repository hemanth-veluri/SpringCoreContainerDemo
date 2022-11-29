package collection.injection.annotation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("collection.injection.annotation")
public class CollectionInjectionAnnotationConfig {
	
	@Bean(name="courseNameMap")
	public Map<String,Object> courseNameMap(){
		HashMap<String,Object> courseNameMap = new HashMap<String,Object>();
		courseNameMap.put("course", 111);
		System.out.println("CollectionInjectionAnnotationConfig :: map is created");
        System.out.println("*****************************************************");
		return courseNameMap;
	}
	
	@Bean
	public Set<String> namesSet(){
		Set<String> namesSet = new LinkedHashSet<String>();
		namesSet.add("Hemanth");
		namesSet.add("Shafi");
		namesSet.add("Rajkumar");
		System.out.println("CollectionInjectionAnnotationConfig :: namesSet is created");
        System.out.println("*****************************************************");
		return namesSet;
	}
	
	
	@Bean(name="configFileList")
	public List<String> configFileList(){
		List<String> namesList = new ArrayList<String>();
		namesList.add("one.xml");
		namesList.add("two.xml");
		namesList.add("three.xml");
		System.out.println("CollectionInjectionAnnotationConfig :: configFileList is created");
		return namesList;
	}
	
	
	@Bean(name="configFileList1")
	//@Primary - This annotation is an alternative to @Qualifier annotation in the process of resolving multiple types ambiguity
	public List<String> configFileList1(){
		List<String> namesList = new ArrayList<String>();
		namesList.add("four.xml");
		namesList.add("five.xml");
		namesList.add("six.xml");
		System.out.println("CollectionInjectionAnnotationConfig :: abc is created");
        System.out.println("*****************************************************");
		return namesList;
	}

}
