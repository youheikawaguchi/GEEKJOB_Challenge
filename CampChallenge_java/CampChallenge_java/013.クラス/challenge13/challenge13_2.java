package challenge13;


import challenge13.challenge13_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g015c1153
 */
public class challenge13_2 extends challenge13_1 {
    
    void clear(){
        a = 0;
        b = 0;
    }
}

class ch13_2{
    
    public static void main(String args[]){
        challenge13_2 ch13_2 = new challenge13_2();
        ch13_2.insert(5,6);
        ch13_2.view();
        ch13_2.clear();
        ch13_2.view();
    }
}
