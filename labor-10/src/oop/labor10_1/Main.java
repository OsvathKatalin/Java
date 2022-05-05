package oop.labor10_1;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyDate> dates= new ArrayList<>();
        int i=0,year,month,day;
        while(i<10)
        {
            MyDate date;
            year=(int)(Math.random()*2500);
            month=(int)(1+Math.random()*11);
            day=(int)(1+Math.random()*30);
            date=new MyDate(year,month,day);
            if(date.helyesDatum(year,month,day))
            {
                dates.add(date);
                i++;
            }
        }
        System.out.println(dates);
        Collections.sort(dates);
        System.out.println(dates);
    }
}
