package fraction;
import java.util.Scanner;

public class Main {

    public static void main(String []args){

        /*
         * This program below calculates the division of a pizza based on the amount of people and
         * calculates the number of sliced each person gets.
         * A 10 inch pizza has 6 slices, a 12 inch has 8 slices and a 14 inch pizza has 10 slices.
         * */
        Fraction c = new FractionImpl(1,0);
        Scanner x = new Scanner(System.in);
        System.out.println("How many pizza's would you like to order");
        String z = "102030";
        System.out.println(z.substring(2));
        try{
            int amnt = Integer.parseInt(x.nextLine());
            System.out.println("Would you like a 10, 12 or 14 inch pizza? (If they are all the same sizes enter the size once" +
                    "; otherwise state the sizes for all your pizza's with a space in between");
            try {
                String inch = x.nextLine();
                if (inch.length() == 2) {
                    switch (Integer.parseInt(inch)) {
                        case 10: {
                            Fraction pizza = new FractionImpl(6 * amnt, 6);
                            System.out.println(pizza);
                        }
                        break;
                        case 12: {
                            Fraction pizza = new FractionImpl(8 * amnt, 8);
                            System.out.println(pizza);
                        }
                        break;
                        case 14: {
                            Fraction pizza = new FractionImpl(10 * amnt, 10);
                            System.out.println(pizza);
                        }
                        break;
                    }
                } else {
                    String l = inch;
                    if (inch.substring(0, l.indexOf(" ")).equals("10")) {
                        Fraction pizza = new FractionImpl(8, 8);
                        l = l.substring(2);
                    } else if (inch.substring(0, l.indexOf(" ")).equals("12")) {
                        Fraction pizza = new FractionImpl(10, 10);
                        l = l.substring(2);
                    } else if (inch.substring(0, l.indexOf(" ")).equals("14")) {
                        Fraction pizza = new FractionImpl(12, 12);
                        l = l.substring(2);
                        for (int i = 0; i >= l.length(); i += 2) {
                            if (inch.substring(0, inch.indexOf(" ")).equals("10")) {
                                pizza.add(pizza);
                            } else if (inch.substring(0, inch.indexOf(" ")).equals("12")) {
                                pizza.add(pizza);
                            } else if (inch.substring(0, inch.indexOf(" ")).equals("14")) {
                                pizza.add(pizza);
                            }
                        }
                    }
                }
            } catch (Exception e){System.out.println("Please use a valid number");}
        }catch(Exception e){
            System.out.println("Please use a valid number ");
        }

    }

        }

