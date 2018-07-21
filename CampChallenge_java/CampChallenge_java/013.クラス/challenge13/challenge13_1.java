package challenge13;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g015c1153
 */
public class challenge13_1 {
    
    int a = 0;
    int b = 0;
        
    void insert(int x, int y){
        a = x;
        b = y;
    }
    
    void view(){
        System.out.println(a);
        System.out.println(b);
    }
    
    
}

class ch13_1{
    public static void main(String args[]){
        challenge13_1 a = new challenge13_1();
        a.insert(5,6);
        a.view();
    }
}
