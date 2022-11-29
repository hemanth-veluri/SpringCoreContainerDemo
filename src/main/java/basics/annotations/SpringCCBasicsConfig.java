package basics.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages="basics.annotations")
@ImportResource("spring-core-container-basics-annotation.xml")
public class SpringCCBasicsConfig {

}
