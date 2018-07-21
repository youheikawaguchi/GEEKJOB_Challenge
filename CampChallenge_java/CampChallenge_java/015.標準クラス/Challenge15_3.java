
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Challenge15_3 {
    public static void main(String[] args){
        try{
            File fp = new File("C:/Users/g015c1153/Documents/NetBeansProjects/ChallengeServlet/src/java/profile.txt");
            FileWriter fw = new FileWriter(fp);
            fw.write("テスト");
            fw.close();
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
