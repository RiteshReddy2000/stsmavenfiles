package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/stdinfo";
		String username="root";
		String pass="Ritesh@2000";
		String query="select * from student";
		try {
			Connection con=DriverManager.getConnection(url,username,pass);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			String str="";
			while(rs.next()) {
				str=rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4);
				System.out.println(str);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
