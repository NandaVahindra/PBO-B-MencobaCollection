/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Collection.List;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ASUS ROG STRIX
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ArrayList<String> studentNames = new ArrayList();
        
        addStudents(studentNames);
        displayStudents(studentNames);
        addStudentsIndex(studentNames, 2);
        displayStudents(studentNames);
        Collections.sort(studentNames);
        displayStudents(studentNames);
    }
    
    static void addStudents(ArrayList<String> studentNames)
    {
        studentNames.add("Johan");
        studentNames.add("Alex");
        studentNames.add("Lame");
    }
    static void addStudentsIndex(ArrayList<String> studentNames, int index)
    {
        studentNames.add(index,"Jonathin");
    }
    
    static void displayStudents(ArrayList<String> studentNames)
    {
        for(String student: studentNames)
        {
            System.out.println("Student Name:" + student);
        }
    }
    
    
}
