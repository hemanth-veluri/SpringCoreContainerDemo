package basics.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("loginValidator1")
public class LoginValidator implements Validator {
	
		
	public LoginValidator() {
    	System.out.println("LoginValidator is loaded and instantiated");
	}
	
	
	public boolean validateLoginInput(String username, String password) {
		System.out.println("LoginValidator : validateLogin");
		if(username == null || password == null) {
			return false;
		}
		
		if(username.length() < 5 || password.length() <8) {
			return false;
		}
		
		
		return true;
	}

}
