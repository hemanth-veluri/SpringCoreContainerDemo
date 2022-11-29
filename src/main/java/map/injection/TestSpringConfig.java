package map.injection;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("map.injection")
public class TestSpringConfig {
	
	@Bean
	public Map nameCityMap(){
		Map nameCityMap = new LinkedHashMap();
		nameCityMap.put("Venkat", "Hyderabad");
		return nameCityMap;
	}

}
