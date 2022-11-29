package collection.injection.annotation;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("setInjectionBean")
public class SetInjection {
	@Autowired
	Set<String> namesSet;
	
	 public SetInjection() {
	    	System.out.println("SetInjection is loaded and instantiated");
	    }

	@Autowired
	public void setNamesSet(Set<String> namesSet) {
		this.namesSet = namesSet;
		System.out.println(namesSet+"  is injected");
		System.out.println("Injected set type is :: "+namesSet.getClass().getName());
		System.out.println("Size of set is "+namesSet.size());
		System.out.println("*****************************");
	}
	 
	 
	public SetInjection(Set<String> namesSet) {
		this.namesSet = namesSet;
		System.out.println(namesSet + "  is injected");
		System.out.println("Injected set type is :: " + namesSet.getClass().getName());
		System.out.println("Size of set is " + namesSet.size());
		System.out.println("*****************************");
	}

}
