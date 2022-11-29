import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//Programmatic Approach
		Properties props = new Properties();
		props.setProperty("pname", "macbook");
		props.setProperty("pcode", "amac");
		props.setProperty("pmake", "apple");
		
		System.out.println("Programmtic :: "+props);
		
		// Load external .properties file
		Properties props1 = new Properties();
		props1.load(new BufferedReader(new FileReader("dbconfig.properties")));
		
		System.out.println("External :: "+props1);

	}

}
