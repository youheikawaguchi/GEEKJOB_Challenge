/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g015c1153
 */
public class Challenge15_2 {
    public static void main(String[]args){
        String name = "かわぐちようへい";
        
        System.out.println("名前の長さ=" + name.length());
        
        System.out.println("名前のバイト数=" + name.length() * 8);
        
        String mail = "aaa@gmail.com";
        String[] domain = new String[2];
        domain = mail.split("@");
        System.out.println("＠後の長さは=" + domain[1].length());
        
        String str = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます" ;
        System.out.println(str.replace("I","い").replace("U","う"));
    }
}
