package collection.injection.xml;

import java.util.Set;

public class SetInjection {
	Set namesSet;

	public void setNamesSet(Set namesSet) {
		this.namesSet = namesSet;
		System.out.println(namesSet+"  is injected");
		System.out.println("Injected set type is :: "+namesSet.getClass().getName());
		System.out.println("Size of set is "+namesSet.size());
		System.out.println("*****************************");
	}

}
