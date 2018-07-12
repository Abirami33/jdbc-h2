package comp;

import java.sql.*;

public class subfound
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
		String query="CREATE TABLE COM_FOUND"+
		              "(id INTEGER not NULL,"+
				      "name VARCHAR(255),"+
				      "Company_id INTEGER not NULL,"+
				      "website VARCHAR(512),"+
				      "Com_Linkedin_link VARCHAR(512),"+
				      "Fou_Linkedin_link VARCHAR(512),"+
				      "Com_Twitter_Link VARCHAR(512),"+
				      "Fou_Twitter_Link VARCHAR(512),"+
				      "Com_Fb_link VARCHAR(512),"+
				      "Fou_Fb_link VARCHAR(512),"+
				      "Com_email_id VARCHAR(512),"+
				      "Com_Blog_link VARCHAR(512),"+
				      "Ref_link VARCHAR(512),"+
				      "FOREIGN KEY(Company_id) REFERENCES COM_TAB(Company_id))";
		
		//Executing query
		stmt.executeUpdate(query);
		System.out.println("Table has been Created!");
		
		//Inserting records
		String sql0="INSERT INTO COM_FOUND VALUES(01,'Kaushik Roy','101','https://biryanibykilo.com/','https://www.linkedin.com/company/biryanibykilo/','https://www.linkedin.com/in/kaushik-roy-a283bb/',"+
				"'https://twitter.com/biryanibykilo','NIL','https://www.facebook.com/biryanibykilo/','https://www.facebook.com/kaushikroy9','mail@biryanibykilo.com','https://biryanibykilo.com/blog','https://www.crunchbase.com/organization/biryani-by-kilo')";
		stmt.executeUpdate(sql0);
		
		String sql1="INSERT INTO COM_FOUND VALUES(02,'Supam Maheshwari','102','http://www.firstcry.com/','https://www.linkedin.com/company/firstcry/','https://www.linkedin.com/in/supam-maheshwari-a735a5/?locale=de_DE',"
				+ "'https://twitter.com/firstcryindia','https://twitter.com/supammaheshwari?lang=en','https://www.facebook.com/FirstCryIndia','NIL','customercare@firstcry.com','https://blog.firstcry.com/','https://www.crunchbase.com/organization/firstcry-com#section-overview')";
		stmt.executeUpdate(sql1);
		
		String sql2="INSERT INTO COM_FOUND VALUES(03,'Atishe Chordia','103','https://www.doodleblue.com/','https://www.linkedin.com/company/doodleblue/','https://www.linkedin.com/in/atishe-chordia-567a8723/','https://twitter.com/Doodleblue7',"
				+ "'https://twitter.com/atishechordia','https://www.facebook.com/doodleblue.Innovations','NIL','genius@doodleblue.com','https://www.doodleblue.com/blog.php','https://www.crunchbase.com/organization/doodleblue#section-overview')";
		stmt.executeUpdate(sql2);
		
		String sql3="INSERT INTO COM_FOUND VALUES(04,'Vilva Natarajan','104','http://www.karomi.com/','https://www.linkedin.com/company/karomi-technology/','https://www.linkedin.com/in/vilva-natarajan-805917/','https://twitter.com/karomitec',"
				+ "'https://twitter.com/vilva_karomi','https://www.facebook.com/pg/Karomi-Technology-Private-Limited-511424635641418/about/?ref=page_internal','https://www.facebook.com/vilva.natarajan',"
				+ "'marketing@karomi.com','http://karomi.com/blog/hello-world/','https://www.crunchbase.com/organization/karomi#section-overview')";
		stmt.executeUpdate(sql3);
		
		String sql4="INSERT INTO COM_FOUND VALUES(05,'Sandhiya Raju','105','https://www.callhealth.com/','https://www.linkedin.com/company/call-health/?originalSubdomain=in','NIL','https://twitter.com/callhealthindia?lang=en',"
				+ "'https://twitter.com/sandhyaraju','https://www.facebook.com/callhealthofficial/','https://www.facebook.com/sandhya.raju.378?lst=100005051198783%3A679419971%3A1511591173','response@callhealth.com',"
				+ "'https://blog.callhealth.com/','https://www.crunchbase.com/organization/callhealth-services-pvt-ltd#section-overview')";
		stmt.executeUpdate(sql4);
		
			
		System.out.println("Records has been Inserted!");
		
		String sql = "SELECT id,name,Company_id,website,Com_Linkedin_link,Fou_Linkedin_link,Com_Twitter_link,Fou_Twitter_link,Com_Fb_link,Fou_Fb_link,Com_email_id,Com_Blog_link,Ref_link FROM COM_FOUND"; 
        ResultSet rs = stmt.executeQuery(sql); 
         
        while(rs.next()) 
        { 
           int id  = rs.getInt("id"); 
           String name = rs.getString("name"); 
           int Company_id=rs.getInt("Company_id");
           String website=rs.getString("website");
           String Com_Linkedin_link=rs.getString("Com_Linkedin_link");
           String Fou_Linkedin_link = rs.getString("Fou_Linkedin_link");  
           String Com_Twitter_link = rs.getString("Com_Twitter_link");
           String Fou_Twitter_link = rs.getString("Fou_Twitter_link");
           String Com_Fb_link = rs.getString("Com_Fb_link");
           String Fou_Fb_link = rs.getString("Fou_Fb_link");
           String Com_email_id = rs.getString("Com_email_id");
           String Com_Blog_link = rs.getString("Com_Blog_link");
           String Ref_link = rs.getString("Ref_link");
           
           
           
           
           System.out.print("ID: " + id); 
           System.out.print(", NAME: " + name);  
           System.out.println(", Company_id: " + Company_id); 
           System.out.println(",website " + website); 
           System.out.println(",Com_Linkedin_link " + Com_Linkedin_link); 
           System.out.println(", Fou_Linkedin_link " + Fou_Linkedin_link); 
           System.out.println(", Com_Twitter_link " +Com_Twitter_link ); 
           System.out.println(", Fou_Twitter_link " +Fou_Twitter_link); 
           System.out.println(",Com_Fb_link " + Com_Fb_link); 
           System.out.println(", Fou_Fb_link " +Fou_Fb_link ); 
           System.out.println(", Com_email_id " +Com_email_id ); 
           System.out.println(", Com_Blog_link " +Com_Blog_link ); 
           System.out.println(",Ref_link " + Ref_link); 
           
        } 
        rs.close();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
		
	}
		
}
