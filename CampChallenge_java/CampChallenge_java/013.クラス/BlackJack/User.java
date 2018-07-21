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
public class User extends Human {
    
    int sum  = 0;

    @Override
    int open() {
        sum = 0;
        for(int i = 0; i < myCards.size(); i++){
            sum += myCards.get(i);
        }
        return sum;
    }

    @Override
    void setCard(ArrayList<Integer> pullCard) {
        if(pullCard.size() <= 2){
            for(int i = 0; i < pullCard.size(); i++){
                myCards.add(pullCard.get(i));
            }
        }else{
            myCards.add(pullCard.get(pullCard.size()-1));
        }
    }

    @Override
    boolean checkSum() {
        sum = 0;
        for(int i = 0; i < myCards.size(); i++){
            sum += myCards.get(i);
        }
        return sum <= 14;
    }
    
}
