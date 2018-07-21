/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;

/**
 *
 * @author g015c1153
 */
public abstract class Human {
    ArrayList<Integer> myCards = new ArrayList<>();
    
    abstract int open();
    
    abstract void setCard(ArrayList<Integer> pullCard);
    
    abstract boolean checkSum();
}
