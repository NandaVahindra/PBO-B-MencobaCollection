/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Collection.set;

import java.util.HashSet;

/**
 *
 * @author ASUS ROG STRIX
 */
public class coinTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        HashSet<coin> bagOfCoins = new HashSet<coin>();
        coin coin1 = new coin(1);
        coin coin2 = new coin(2);
        coin coin5 = new coin(5);
        coin coin10 = new coin(10);
        coin coin20 = new coin(20);
        coin coin50 = new coin(50);
        coin coin100 = new coin(100);
        
        bagOfCoins.add(coin1);
        bagOfCoins.add(coin2);
        bagOfCoins.add(coin5);
        bagOfCoins.add(coin10);
        bagOfCoins.add(coin20);
        bagOfCoins.add(coin50);
        bagOfCoins.add(coin10);
        
        findCoin(bagOfCoins, coin10);
        findCoin(bagOfCoins, coin100);
        displayBagContents(bagOfCoins);
        displayBagDetails(bagOfCoins);
        bagOfCoins.clear();
        displayBagDetails(bagOfCoins);
    }
    
    
    static void findCoin(HashSet<coin> bagOfCoins, coin coin)
    {
        if(bagOfCoins.contains(coin))
            System.out.println("There is a coin " + coin.getDenomination() + " in the bag");
        else
            System.out.println("There is no coin " + coin.getDenomination() + " in the bag");
    }
    
    static void displayBagDetails(HashSet<coin> bagOfCoins)
    {
        if(bagOfCoins.isEmpty())
            System.out.println("There are no coins in the bag");
        else
            System.out.println("There are " + bagOfCoins.size() + " coins in the bag");
    }
    
    static void displayBagContents(HashSet<coin> bagOfCoins)
    {
        for(coin coin : bagOfCoins)
            System.out.println(coin.getDenomination());
    }
    
}
