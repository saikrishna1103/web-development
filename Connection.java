package mp.samples;

import java.sql.*;  
class MysqlCon extends detailsProcess
{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tutor","root","");    
String sql="INSERT INTO details(Name, Address, Phone) VALUES (?, ?, ?)"; 
PreparedStatement statement = con.prepareStatement(sql);
statement.setString(1, "name");
statement.setString(2, "add");
statement.setString(3, "phone"); 
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
} 
