package basics.annotations;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("loginIOBean")
public class LoginIO {
	@Autowired
	@Qualifier("loginDBValidatorBean")
	Validator loginValidator;         
	
	
	/*@Autowired
	public  LoginIO(@Qualifier("loginDBValidatorBean")Validator loginValidator) {
		this.loginValidator = loginValidator;
		System.out.println("LoginIO is loaded and instantiated");
		System.out.println(loginValidator+ " : is injected");
	}*/
	
	
	/*@Autowired
	@Qualifier("loginDBValidatorBean")
	public void setLoginValidator(Validator loginValidator) {
		this.loginValidator = loginValidator;
		System.out.println(loginValidator+ " : is injected");
	}*/

	/*public LoginIO() {
    	System.out.println("LoginIO is loaded and instantiated");
	}*/
	
	public void processLogin() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Eneter username");
		String username = scanner.next();
		System.out.println("Enter password");
		String password = scanner.next();
		boolean isLoginSuccess = loginValidator.validateLoginInput(username, password);
		if(isLoginSuccess) {
			System.out.println("Login attempt is successful");
		}else {
			System.out.println("Login attempt is failed, please re-login");
		}
	}
	

}
