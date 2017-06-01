/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrsbk;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author student
 */
public class Adrsbk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         try{
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@172.16.0.70:1521:cas","fdp30","fdp30");  
Statement stmt=con.createStatement();    
ResultSet rs=stmt.executeQuery("select * from adr");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
}
