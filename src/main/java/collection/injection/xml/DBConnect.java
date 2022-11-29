package collection.injection.xml;

public class DBConnect {
	 String drvierClass;
	 String url;
	 String username;
	 String password;
	 
	public void setDrvierClass(String drvierClass) {
		this.drvierClass = drvierClass;
		System.out.println(drvierClass+" is injected");
	}
	public void setUrl(String url) {
		this.url = url;
		System.out.println(url+" is injected");
	}
	public void setUsername(String username) {
		this.username = username;
		System.out.println(username+" is injected");
	}
	public void setPassword(String password) {
		this.password = password;
		System.out.println(password+" is injected");
	}
	
}
