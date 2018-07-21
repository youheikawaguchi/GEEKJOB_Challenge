
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g015c1153
 */
public class Challenge15_4 {
    public static void main(String[] args){
        try{
            File fp = new File("C:/Users/g015c1153/Documents/NetBeansProjects/ChallengeServlet/src/java/profile.txt");
            FileReader fr = new FileReader(fp); 
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();
            System.out.println(str);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
