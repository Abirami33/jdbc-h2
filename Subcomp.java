package comp;

import java.sql.*;

public class Subcomp
{
	static String JDBC_DRIVER="org.h2.Driver"; //Driver connection
	static String DB_URL="jdbc:h2:~/RESEARCH"; //Path of FOUNDERS db
	
	static String USER_NAME="sa"; //User_name
	static String PASSWORD="";    //Password
	
	public static void main (String[] args)
	{
	  try
	  {
		//registering JDBC driver
		Class.forName(JDBC_DRIVER);
		
		//Connecting to JDBC
		Connection con=DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
		System.out.println("Database Created!");
		
		//Executing query
		Statement stmt=con.createStatement();
		
		//Creating COMPANY table
		String query="CREATE TABLE COM_TAB"+
		              "(id INTEGER not NULL,"+
				      "name VARCHAR(255),"+
				      "city VARCHAR(255),"+
				      "Company_id INTEGER not NULL,"+
		              "PRIMARY KEY(id))";
		
		//Executing query
		stmt.executeUpdate(query);
		System.out.println("Table has been Created!");
		
		//Inserting records
		String sql0="INSERT INTO COM_TAB VALUES(01,'Biriyani By Kilo','Noida',101)";
		stmt.executeUpdate(sql0);
		String sql1="INSERT INTO COM_TAB VALUES(02,'firstcry.com','Chennai',102)";
		stmt.executeUpdate(sql1);
		String sql2="INSERT INTO COM_TAB VALUES(03,'doodleblue Innovations','Chennai',103)";
		stmt.executeUpdate(sql2);
		String sql3="INSERT INTO COM_TAB VALUES(04,'Karomi Smart Solutions','Chennai',104)";
		stmt.executeUpdate(sql3);
		String sql4="INSERT INTO COM_TAB VALUES(05,'CallHealth Services','Hyderabad',105)";
		stmt.executeUpdate(sql4);
		
			
		System.out.println("Records has been Inserted!");
		
		String sql = "SELECT id,name,city,Company_id FROM COM_TAB"; 
        ResultSet rs = stmt.executeQuery(sql); 
         
        while(rs.next()) 
        { 
           int id  = rs.getInt("id"); 
           String name = rs.getString("name"); 
           String city = rs.getString("city");  
           int Company_id=rs.getInt("Company_id");
           
           System.out.print("ID: " + id); 
           System.out.print(", NAME: " + name);  
           System.out.println(", CITY: " + city); 
           System.out.println(",COMPANY_ID:"+Company_id);
        } 
        rs.close();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
		
	}
		
}