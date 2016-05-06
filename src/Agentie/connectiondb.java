package Agentie;
import java.sql.*;
import javax.swing.*;
public class connectiondb {
Connection conn=null;
    public static Connection ConnectDB(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agentie","root","root");
            // JOptionPane.showMessageDialog(null, "Ënabled");
             return conn;
       
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
              return null;
        }
      
    }
}
    