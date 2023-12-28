package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import com.mysql.cj.jdbc.JdbcConnection;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/bank";
		String username="root";
		String pass="Ritesh@2000";
		String query="select * from branch";
		try {
			Connection con=DriverManager.getConnection(url,username,pass);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			String str="";
			while(rs.next()) {
				str=rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3);
				System.out.println(str);
			}  
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
