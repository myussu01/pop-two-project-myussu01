package fraction;

public class Main {

    public static void main(String []args){

        Fraction M = new FractionImpl(1,4);
        FractionImpl K = new FractionImpl(2,2);
        System.out.println(K.compareTo(M));

        Discount x = new Discount(5);
        System.out.println(x);
        Item z = new Item("Shoes", 13);
        x.amount(z);

    }

        }

