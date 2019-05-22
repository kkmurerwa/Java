package mysqlconnection;

import java.sql.*;
import javax.swing.JOptionPane;
import static sun.security.krb5.Confounder.intValue;

public class MySQLConnection {
    public static Connection conn;
    public static Statement state;
    public static void main(String [] args){
        try{
                      
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307","root","toor");
            state = conn.createStatement();
            String table;
            String sql = "SELECT * FROM javaminiproject.lec_details where name like ? ";
                PreparedStatement retreive = conn.prepareStatement(sql);
                table = "%kevin%";
                retreive.setString(1,table);
                ResultSet rs = retreive.executeQuery();
            
            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int id = rs.getInt("password");
                int age = rs.getInt("age");
                String first = rs.getString("admno");
                //Display values
                System.out.print("Password: " + id +"\n");
                System.out.print("Username: " + first +"\n");
                System.out.print("Age: " + age +"\n");
            }
            //Boolean bl = state.execute("update javaminiproject.stud_details set age = 15 where admno='BA/00256/016'");
            /*while(rs.next()){
                //Retrieve by column name
                int id = rs.getInt("password");
                String first = rs.getString("admno");
                //Display values
                System.out.print("Password: " + id +"\n");
                System.out.print("Username: " + first +"\n");
            }*/
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e+"error connecting to database");
        }
        
    }
}