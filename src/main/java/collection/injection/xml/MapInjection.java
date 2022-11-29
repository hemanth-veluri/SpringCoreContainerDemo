package collection.injection.xml;

import java.util.Map;

public class MapInjection {
	Map  map;

	public void setMap(Map map) {
		this.map = map;
		System.out.println(map+"  is injected");
		System.out.println("Injected map type is :: "+map.getClass().getName());
		System.out.println("*****************************");
	}
	
	
	
}
