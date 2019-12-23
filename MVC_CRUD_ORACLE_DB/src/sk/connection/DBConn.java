package sk.connection;

import java.sql.Connection;
import java.sql.DriverManager;


/**
*
* @author Sreekandan K
*/
public class DBConn {
       public static Connection getConnection()
   {
       Connection con=null;
       try
       {
          Class.forName("oracle.jdbc.driver.OracleDriver");
          con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sktestdb","sktestdb");      
       }
       catch(Exception e)
       {
           System.out.println("CONNECTION ERRROR at DBConn.getConnetion()"+e.getMessage());
           e.printStackTrace();
       }
       return con;
   } 
}
