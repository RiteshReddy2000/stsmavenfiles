package com.spring;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


public class App {
  public static void main(String[] args) throws Exception {
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdinfo","root","Ritesh@2000");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select * from student");
     String userdata="";
     while(rs.next()) {
    	 userdata=rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4);
    	 System.out.println(userdata);
     }
     con.close();
  }
}
