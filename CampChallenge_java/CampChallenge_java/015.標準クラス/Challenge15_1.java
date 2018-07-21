/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author g015c1153
 */
public class Challenge15_1 {
    public static void main(String[] args) throws ParseException{
        //Calendar calender = Calendar.getInstance();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //1
        Date day = sdf.parse("2016/1/1 00:00:00");
        System.out.println(day.getTime());
        
        //2
        Date day2 = new Date();
        String strDay2 = sdf.format(day2);
        System.out.println(strDay2);
        
        //3
        Date day3 = sdf2.parse("2016-11-4 10:0:0");
        System.out.println(day3.getTime());
        String strDay3 = sdf2.format(day3);
        System.out.println(strDay3);
        
        Date day4 = sdf.parse("2015/1/1 00:00:00");
        long longDay4 = day4.getTime();
        Date day5 = sdf.parse("2015/12/31 23:59:59");
        long longDay5 = day5.getTime();
        System.out.print(longDay5 + "-" + longDay4+"＝");
        System.out.println(longDay5 - longDay4);
        
        Date day6 = sdf.parse("1980/01/01 00:00:00");
        long longDay6 = day6.getTime();
        System.out.println(longDay6);
        long longDay7 = 10*365*24*60*60*1000L;
        System.out.println(longDay7);
        
        //１９８０年から１９７０年の差
        System.out.println(longDay6 + "-" + longDay7 +"="+ (longDay6-longDay7));
        //謎
        //９時間のタイムスタンプ
        System.out.println(32400000);
        
        Date day8 = sdf.parse("1970/01/01 09:00:00");
        long longDay8 = day8.getTime();
        System.out.println(longDay8);
    }
}