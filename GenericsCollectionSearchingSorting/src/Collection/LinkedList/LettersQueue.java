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
public class LettersQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LinkedList<String> lettersQ = new LinkedList<String>();
        
        lettersQ.add("A");
        lettersQ.add("B");
        lettersQ.add("C");
        lettersQ.add("D");
        System.out.println("Linked list: " + lettersQ);
        System.out.println("Queue Size: " + lettersQ.size());
        
        while(!lettersQ.isEmpty())
        {
            System.out.println(lettersQ.removeFirst());
        }
        System.out.println("Linked list : " + lettersQ);
    }
}
