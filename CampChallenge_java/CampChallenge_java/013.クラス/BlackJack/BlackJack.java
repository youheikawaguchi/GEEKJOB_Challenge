/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

/**
 *
 * @author g015c1153
 */
public class BlackJack {
    public static void main(String[] args){
        
        Dealer dealer = new Dealer();
        User user1 = new User();
        
        dealer.setCard(dealer.deal());  //ディーラーに最初のカードを渡す
        System.out.println(dealer.myCards);
        user1.setCard(dealer.deal());   //ユーザーに最初のカードを渡す
        System.out.println(user1.myCards);
        
        while(dealer.checkSum()){   //まだ引ければ一枚引く
            dealer.setCard(dealer.hit());
            System.out.println(dealer.myCards);
        }
        
        while(user1.checkSum()){    //まだ引ければ一枚引く
            user1.setCard(dealer.hit());
            System.out.println(user1.myCards);
        }
        
        dealer.open();  //ディーラーの札を開示
        System.out.println("ディーラーのカードは：" + dealer.myCards + "=" + dealer.sum);
        user1.open();   //ユーザーの札を開示
        System.out.println("ユーザーのカードは：" + user1.myCards + "=" + user1.sum);
        
        
        if(user1.sum > 21 && dealer.sum > 21 || user1.sum == dealer.sum ){
            System.out.println("引き分け");
        }else if(dealer.sum > 21 || user1.sum > dealer.sum && user1.sum <= 21){
            System.out.println("ユーザーの勝ち");
        }else if(user1.sum > 21 || user1.sum < dealer.sum && user1.sum <= 21){
            System.out.println("ディーラーの勝ち");
        }
    }
}
