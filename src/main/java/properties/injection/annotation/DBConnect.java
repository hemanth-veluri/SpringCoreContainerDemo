package properties.injection.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dbConnectBean")
public class DBConnect {
	String drvierClass;
	String url;
	String username;
	String password;
	
	@Autowired
	public DBConnect( @Value("${dbUrl}") String url,
			@Value("${driverClassName}") String username, @Value("${dbPassword}") String password) {
		this.url = url;
		this.username = username;
		this.password = password;
		System.out.println(drvierClass + " is injected");
		System.out.println(url + " is injected");
		System.out.println(username + " is injected");
		System.out.println(password + " is injected");
	}
	
	public DBConnect(@Value("${driverClassName}") String drvierClass, @Value("${dbUrl}") String url,
			@Value("${driverClassName}") String username, @Value("${dbPassword}") String password) {
		this.drvierClass = drvierClass;
		this.url = url;
		this.username = username;
		this.password = password;
		System.out.println(drvierClass + " is injected");
		System.out.println(url + " is injected");
		System.out.println(username + " is injected");
		System.out.println(password + " is injected");
	}

	/*@Value("${driverClassName}")
	public void setDrvierClass(String drvierClass) {
		this.drvierClass = drvierClass;
		System.out.println(drvierClass + " is injected");
	}

	@Value("${dbUrl}")
	public void setUrl(String url) {
		this.url = url;
		System.out.println(url + " is injected");
	}

	@Value("${driverClassName}")
	public void setUsername(String username) {
		this.username = username;
		System.out.println(username + " is injected");
	}

	@Value("${dbPassword}")
	public void setPassword(String password) {
		this.password = password;
		System.out.println(password + " is injected");
	}*/

}
