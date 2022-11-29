package primtives.injection.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
        //ApplicationContext container = new ClassPathXmlApplicationContext("primtives-strings-injection-annotations.xml");
		ApplicationContext container = new AnnotationConfigApplicationContext(PrimitivesInjectionConfig.class);
        System.out.println("Core Container is ready");
       
      /* DBConnection dbConnection1 = (DBConnection) container.getBean("dbConnectionBean");
       DBConnection dbConnection2 =  container.getBean("dbConnectionBean", DBConnection.class);
       DBConnection dbConnection3 =  container.getBean( DBConnection.class); 
       dbConnection1.getConnection();*/
     
	}

}
