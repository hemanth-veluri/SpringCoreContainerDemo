package collection.injection.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("listInjectionBean")
public class ListInjection {
	@Autowired
	@Qualifier("configFileList")
    List<String> configFileList;
    
    public ListInjection() {
    	System.out.println("ListInjection is loaded and instantiated");
    }

    /*@Autowired
    @Qualifier("abc")
	public void setConfigFileList(List<String> configFileList) {
		this.configFileList = configFileList;
		System.out.println(configFileList+"  is injected");
		System.out.println("Injected list type is :: "+configFileList.getClass().getName());
	}*/
    
    /*@Autowired
    public ListInjection(@Qualifier("abc") List<String> configFileList) {
		this.configFileList = configFileList;
		System.out.println("ListInjection is loaded and instantiated");
		System.out.println(configFileList+"  is injected");
		System.out.println("Injected list type is :: "+configFileList.getClass().getName());
	}*/
    
    
    public void processConfigFiles() {
    	System.out.println("Processing ....."+configFileList.get(0));
    }

	
    
}
