import java.sql.*;
public class LoginDao {
		
		
	
	 static boolean validate(String name, String password) throws SQLException, InstantiationException, IllegalAccessException
{
	boolean status= false;
	try {
		
		 Class.forName("org.apache.derby.jdbc.ClientDriver");
         //Get a connection
       Connection  conn = DriverManager.getConnection
         		("jdbc:derby://localhost:1527/D:/ProgramFile/DerbyDB","APP","admin"); 	
       PreparedStatement ps1=conn.prepareStatement("select * from USER_REG where NAME=? and PASSWORD=?");
		ps1.setString(1, name);
	ps1.setString(2,password);
		ResultSet rsResultSet = ps1.executeQuery();
		
		status=rsResultSet.next();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch blockPrep
		e.printStackTrace();
	}
	
	return status;
	
}
}
