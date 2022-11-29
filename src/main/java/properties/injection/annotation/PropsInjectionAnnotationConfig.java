package properties.injection.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("properties.injection.annotation")
//@PropertySource("classpath:dbconfig.properties")
@PropertySource("file:///E://MySQL_DB_Conn-${ENV}.properties")
public class PropsInjectionAnnotationConfig {

}
