/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Sewwa
 */
import java.sql.SQLException;
import java.sql.Statement;
public class AddRecord {
    Statement stmt;
 
public void Home(String name, String address, String gender, String age) {
 try {
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate("INSERT INTO student VALUES('"+name+"', '"+address+"', '"+gender+"', '"+age+"')");
 } catch (SQLException e) {
     e.printStackTrace();
 }
}

public void Home(String courseid, String coursename) {
 try {
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate("INSERT INTO course VALUES('"+courseid+"', '"+coursename+"')");
 } catch (SQLException e) {
     
     e.printStackTrace();
     
 }
}

   
}