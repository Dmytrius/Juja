package lab_0_10.lab02;

/**
 * Created by boykodm on 11.02.16.
 */
public class EggsBread {

    public static String printPurchases(boolean hasEggs, boolean hasBread) {
       /*BODY*/
        //String purchases = "eggs, bread";

        if(hasEggs == true && hasBread == true){
            return "eggs, bread";
        }else if(hasEggs == false && hasBread == true){
            return "bread";
        }else if(hasEggs == true && hasBread == false){
            return "eggs";
        }else return "";
    }
}
