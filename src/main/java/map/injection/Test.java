package map.injection;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("testBean")
public class Test {
	Map nameCityMap;

	@Autowired
	public void setNameCityMap(Map nameCityMap) {
		this.nameCityMap = nameCityMap;
        System.out.println("Injected map is :"+nameCityMap);
	}

}
