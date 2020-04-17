package fraction;
import java.util.Scanner;

public class Main {

    public static void main(String []args){

        /*
         * This program below calculates the division of a pizza based on the amount of people and
         * calculates the amount each person gets of the whole of the pizza.
         * A 10 inch pizza has 6 slices, a 12 inch has 8 slices and a 14 inch pizza has 10 slices.
         * */
        Fraction pizza = null;
        System.out.println("How may pizzas would you like");
        Scanner x = new Scanner(System.in);
        int y = Integer.parseInt(x.nextLine());
        System.out.println("How many inches will the pizza's be (either 10, 12 or 14)");
        int r = Integer.parseInt(x.nextLine());
        if(r == 10){
            pizza = new FractionImpl(6*y,6);
        } else if (r== 12){
            pizza = new FractionImpl(8*y,8);
        } else if (r== 14){
            pizza = new FractionImpl(10*y,10);
        }
        System.out.println("How many people will be sharing the pizza");
        int n = Integer.parseInt(x.nextLine());
        Fraction prs = new FractionImpl(n,1);
        Fraction div = pizza.divide(prs);
        System.out.println(div.toString());

    }

        }

