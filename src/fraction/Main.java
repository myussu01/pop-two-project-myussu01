package fraction;
import java.util.Scanner;

public class Main {

    public static void main(String []args){

        /*
         * This program below calculates the division of a pizza based on the amount of people and
         * ensures the pizza is sliced into exact even parts for all
         * */

//        Scanner x = new Scanner(System.in);
//        System.out.println("How many pizza's would you like to buy");
//        try{int amnt = Integer.parseInt(x.nextLine());}catch(NumberFormatException e){
//            System.out.println("Please use a valid number ");
//        }

        Fraction M = new FractionImpl(1,4);
        FractionImpl K = new FractionImpl("12/30");
        System.out.println(K);


    }

        }

