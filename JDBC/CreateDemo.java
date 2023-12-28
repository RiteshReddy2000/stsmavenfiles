package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url ="jdbc:mysql://localhost:3306/stdinfo";
		String username="root";
		String pass="Ritesh@2000";
		String query="create table student(id int,name varchar(20),stdroll int,marks int)";
        try {
        	Connection con =DriverManager.getConnection(url,username,pass);
        	Statement st=con.createStatement();
        	st.execute(query);
        	//System.out.println(st.execute(query));
        	
        	System.out.println("create table sucessfully");
        	
        	}
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
