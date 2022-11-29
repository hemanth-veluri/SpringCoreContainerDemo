package primtives.injection.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dbConnectionBean")
public class DBConnection {
	@Value("MySQLDB")
	String dbname;
	@Value("3333")
	int dbport;
	
	
    /*public DBConnection(@Value("SQLServerDB") String dbname, @Value("2222") int dbport) {
		this.dbname = dbname;
		this.dbport = dbport;
		System.out.println(dbname + " is injected");
		System.out.println(dbport + " is injected");
		System.out.println("************************");
	}*/

	/*@Value("OracleDB")
	public void setDbname(String dbname) {
		this.dbname = dbname;
		System.out.println(dbname+" is injected");
	}

	@Value("1111")
	public void setDbport(int dbport) {
		this.dbport = dbport;
		System.out.println(dbport+" is injected");
	}*/
	
	
	public void getConnection() {
		System.out.println("Connecting to "+dbname+ " on port : "+dbport);
	}

}


