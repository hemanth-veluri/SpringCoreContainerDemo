package basics.xml;

public class LoginDBValidator implements Validator{
	
	
	public LoginDBValidator() {
		System.out.println("LoginDBValidator is loaded and instantiated ");
	}

	public boolean validateLoginInput(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * This method performs login validation
	 * 
	 * @author ADMIN 
	 * @param username
	 * @param password
	 * @return boolean
	 * @throws none
	 * 
	 * 
	 *//*
	
	
	public boolean validateLoginInput(String username, String password) {
		System.out.println("LoginDBValidator : validateLogin");
		if(username == null || password == null) {
			return false;
		}
		
		if(username.length() < 5 || password.length() <8) {
			return false;
		}
		
		
		return true;
	}
*/
}
