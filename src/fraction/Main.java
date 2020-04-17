package fraction;
import java.util.Scanner;

public class Main {

    public static void main(String []args){

        /*
         * This program below calculates the division of a pizza based on the amount of people and
         * calculates the number of sliced each person gets.
         * A 10 inch pizza has 6 slices, a 12 inch has 8 slices and a 14 inch pizza has 10 slices.
         * */

        Scanner x = new Scanner(System.in);
        System.out.println("How many pizza's would you like to order");
        try{
            int amnt = Integer.parseInt(x.nextLine());
            System.out.println("Would you like a 10, 12 or 14 inch pizza? (If they are all the same sizes enter the size once" +
                    "; otherwise state the sizes for all your pizza's with a space in between");
            try{
                String inch = x.nextLine();
                if(inch.length() == 2 ){
                    for(int i = 0; i > amnt; i++){
                        if(Integer.parseInt(inch) == 10){
                            Fraction pizza = new FractionImpl(6,6);
                        }
                        else if((Integer.parseInt(inch) == 12)){
                            Fraction pizza = new FractionImpl(8,8);
                        }
                        else if((Integer.parseInt(inch) == 14)){
                            Fraction pizza = new FractionImpl(10,10);
                        }
                        else{
                            System.out.println("We do not sell such a size");
                            break;
                        }
                        System.out.println("Thank you for your order");
                    }
                }
                System.out.println(Integer.parseInt(inch) == 12);

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

