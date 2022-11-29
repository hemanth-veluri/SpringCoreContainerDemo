package basics.xml;

import java.util.Scanner;

public class LoginIO {
	//LoginValidator loginValidator = new LoginValidator(); // tightly coupled
	// LoginValidator loginValidator; // class-first approach
	
	Validator loginValidator;         // interface-first approach

	/*public LoginIO() {
		System.out.println("LoginIO is loaded and instantiated");
	}
	*/
	/*public  LoginIO(LoginValidator loginValidator) {
		this.loginValidator = loginValidator;
		System.out.println("LoginIO is loaded and instantiated through param-constructor");
		System.out.println(loginValidator+ " is injected into LoginIO");
	}*/
	
	/*public void setLoginValidator(LoginValidator loginValidator) {
		this.loginValidator = loginValidator;
		System.out.println(loginValidator+ " is injected into LoginIO");
	}*/

	
	/*public void setLoginValidator(Validator loginValidator) {
		this.loginValidator = loginValidator;
		System.out.println(loginValidator+ " is injected into LoginIO");
	}*/
	
	public LoginIO(Validator loginValidator) {
		this.loginValidator = loginValidator;
		System.out.println("LoginIO is loaded and instantiated through param-constructor");
		System.out.println(loginValidator + " is injected into LoginIO");
	}

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
