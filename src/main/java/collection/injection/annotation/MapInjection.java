package collection.injection.annotation;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("mapInjectionBean")
public class MapInjection {
	Map<String,Object> courseNameMap;

	//@Autowired
	@Resource
	public void setCourseNameMap(Map<String,Object> courseNameMap) {
		this.courseNameMap = courseNameMap;
		System.out.println("Injected courseNameMap is :"+courseNameMap);
	}

	public MapInjection() {
		System.out.println("MapInjection is loaded and instantiated");
	}

	
	public void displayCourseDetails() {
		System.out.println(courseNameMap.get("course"));
	}
	

}
