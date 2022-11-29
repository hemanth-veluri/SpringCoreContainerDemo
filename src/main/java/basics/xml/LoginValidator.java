package basics.xml;

public class LoginValidator implements Validator {
	
	
	public LoginValidator(String validationType) {
		System.out.println("LoginValidator is loaded and instantiated using parameterized constructor");
	}
	
	
   /* public LoginValidator() {
    	System.out.println("LoginValidator is loaded and instantiated");
	}*/
	
	
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
