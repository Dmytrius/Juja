package lab_0_10.lab03;

/**
 * Created by boykodm on 11.02.16.
 */
public class DayMonth {

    // start from 1
    public static String getMonthOfYear(int number) {
/*BODY*/
        if(number>12 || number<1){
            return "";
        } else if(number == 1){
            return "january";
        } else if(number == 2){
            return "february";
        } else if(number == 3){
            return "march";
        } else if(number == 4){
            return "april";
        } else if(number == 5){
            return "may";
        } else if(number == 6){
            return "june";
        } else if(number == 7){
            return "july";
        } else if(number == 8){
            return "august";
        } else if(number == 9){
            return "september";
        } else if(number == 10){
            return "october";
        } else if(number == 11){
            return "november";
        } else {
            return "december";
        }
    }
}
