/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Collection.LinkedList;

import java.util.LinkedList;

/**
 *
 * @author ASUS ROG STRIX
 */
public class LettersStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LinkedList<String> letterS = new LinkedList<String>();
        letterS.push("A");
        letterS.push("B");
        letterS.push("C");
        letterS.push("D");
        
        System.out.println("Linked list : " + letterS);
        System.out.println("Stack Size : " + letterS.size());
        
        while(!letterS.isEmpty())
        {
            System.out.println(letterS.pop());
        }
        System.out.println("Linked list :" + letterS);
    }
}
