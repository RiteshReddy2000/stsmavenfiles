package jdbcConnection;
import java.sql.*;
public class InsertDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdinfo","root","Ritesh@2000");
			Statement st=con.createStatement();
			String str1="insert into student values(01,'Ritesh',101,85)";
			String str2="insert into student values(02,'Akhil',102,90)";
			String str3="insert into student values(03,'Vivek',103,95)";
			String str4="insert into student values(04,'Tharun',104,92)";
			st.addBatch(str1);
			st.addBatch(str2);
			st.addBatch(str3);
			st.addBatch(str4);
			st.executeBatch();
			System.out.println("4 rows effected succesfully");
			
		
		/*catch(Exception e) {
			System.out.println(e);
		}*/

	}

}
