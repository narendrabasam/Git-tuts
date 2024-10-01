package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		
		// step 1 : Register the driver.
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// step 2 : give the database connection.
		
		Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/unisoft", "root", "narendra@154588");
		
		Statement st =con.createStatement();
		ResultSet rs=st.executeQuery("select * from student");
		
		while (rs.next()) {
			
		int Student =rs.getInt("StudentID");
		String name =rs.getString("StudentName");
		int Age =rs.getInt("StudentAge");
		String Department =rs.getString("StudentDept");
		System.out.println(Student+"  "+name+"  "+Age+"  "+Department);
		}
		
		st.close();
		con.close();
		
		
		
	

}
}

