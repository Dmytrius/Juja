package lab_0_10.lab04;

/**
 * Created by boykodm on 11.02.16.
 */
public class DayWeek {

    public static String getDayOfTheWeek(int dayNum){
       /*BODY*/
        if(dayNum>7 || dayNum<1){
            return "";
        }else if(dayNum == 1){
            return "Monday";
        }else if(dayNum == 2){
            return "Tuesday";
        }else if(dayNum == 3){
            return "Wednesday";
        }else if(dayNum == 4){
            return "Thursday";
        }else if(dayNum == 5){
            return "Friday";
        }else if(dayNum == 6){
            return "Saturday";
        }else {
            return "Sunday";
        }
    }
}
