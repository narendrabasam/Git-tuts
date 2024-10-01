package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample2 {
public static void main(String args[]) throws ClassNotFoundException, SQLException{
		
		// step 1 : Register the driver.
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// step 2 : give the database connection.
		
		Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/unisoft", "root", "narendra@154588");
		
		Statement st =con.createStatement();
		
		//String s ="insert into employees values(1,'Narendra',25,'IT')";
		
		String s1 ="insert into employees values(2,'john',27,'Finance')";
		
		
		st.execute(s1);
		
		st.close();
		
		System.out.println("table created.....");
		
}
		
		

}
