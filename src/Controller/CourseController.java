/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class CourseController {
    public static void Course(String courseid, String coursename) {
        new Model.AddRecord().Home(courseid, coursename);
        JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    
}
}
