package primtives.injection.xml;

public class DBConnection {
	String dbname;
	int dbport;
	
	/*public void setDbname(String dbname) {
		this.dbname = dbname;
		System.out.println(dbname+" is injected");
	}
	public void setDbport(int dbport) {
		this.dbport = dbport;
		System.out.println(dbport+" is injected");
	}*/
	
	
	public DBConnection(String dbname, int dbport) {
		this.dbname = dbname;
		this.dbport = dbport;
		System.out.println(dbname+" is injected");
		System.out.println(dbport+" is injected");
		System.out.println("************************");
	}

	
	public void getConnection() {
		System.out.println("Connecting to "+dbname+ " on port : "+dbport);
	}

	
}
