package fraction;
import java.util.Scanner;

public class Main {

    public static void main(String []args){

        /*
         * This program below calculates the division of a pizza based on the amount of people and
         * ensures the pizza is sliced into exact even parts for all
         * */

        Scanner x = new Scanner(System.in);
        System.out.println("How many pizza's would you like to order");
        try{
            int amnt = Integer.parseInt(x.nextLine()); Fraction pizza = new FractionImpl(amnt,1);
            System.out.println("Would you like a 10, 12, 14 or 16 inch pizza");
            try{
                int inch = Integer.parseInt(x.nextLine());

        }
        catch (NumberFormatException e){System.out.println("Please use a valid number");}
        System.out.println("Will you share your pizza ");
        }catch(NumberFormatException e){
            System.out.println("Please use a valid number ");
        }

//
//        Fraction M = new FractionImpl(1,4);
//        FractionImpl K = new FractionImpl("1/5");
//        System.out.println(M.subtract(K));


    }

        }

