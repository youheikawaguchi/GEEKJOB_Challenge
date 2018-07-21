/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author g015c1153
 */
public class Dealer extends Human {
    
    ArrayList<Integer> cards = new ArrayList<>(); //山札
    ArrayList<Integer> shuffleCard = new ArrayList<>(); //ユーザーに渡す札
    int sum = 0;
    
    public Dealer(){    //ディーラーは山札を用意する
        for(int i = 1; i <= 13; i++){
            for(int j = 0; j < 4; j++){
                cards.add(i);
            }
        }
    }
    
    public ArrayList<Integer> deal(){   //最初のカードを配る
        Collections.shuffle(cards);
        shuffleCard.add(cards.get(0));
        shuffleCard.add(cards.get(1));
        
        cards.remove(0);
        cards.remove(0);
        
        return shuffleCard;
    }
    
    public ArrayList<Integer> hit(){    //必要であれば一枚カードを配る
        System.out.println(cards.get(0));
        shuffleCard.add(cards.get(0));
        cards.remove(0);
        return shuffleCard;
    }

    @Override
    int open() {    //持ち札を開示する
        sum = 0;
        for(int i = 0; i < myCards.size(); i++){
            sum += myCards.get(i);
        }
        return sum;
    }

    @Override
    void setCard(ArrayList<Integer> pullCard) {     //配られたカードを手札にセットする
        if(pullCard.size() <= 2){
            for(int i = 0; i < pullCard.size(); i++){
                myCards.add(pullCard.get(i));
            }
        }else{
            myCards.add(pullCard.get(pullCard.size()-1));
        }
    }

    @Override
    boolean checkSum() {    //カードを追加するかどうか判断する
        sum = 0;
        for(int i = 0; i < myCards.size(); i++){
            sum += myCards.get(i);
        }
        return sum <= 16;
    }   
}
