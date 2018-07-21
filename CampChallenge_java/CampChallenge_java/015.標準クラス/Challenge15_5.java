
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Challenge15_5 {
    
    static String strDate = "";
    
    public static void main(String[] args){
        try{
            File fp = new File("C:/Users/g015c1153/Documents/NetBeansProjects/ChallengeServlet/src/java/kadai.txt");
            File log = new File("C:/Users/g015c1153/Documents/NetBeansProjects/ChallengeServlet/src/java/log.txt");

            //fpに書き込み
            FileWriter fw = new FileWriter(fp);
            Random rand = new Random();
            fw.write("aa");
            fw.close();

            //Logの作成
            FileWriter fwLog = new FileWriter(log,true);
            fwLog.write(strDate);
            fwLog.close();


        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void logTime(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
        strDate = sdf.format(date);
    }
}
