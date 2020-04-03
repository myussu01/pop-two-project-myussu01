package fraction;

public class Main {

    public static void main(String []args){

        Fraction M = new FractionImpl(1,8);
        Fraction K = new FractionImpl("1/4");
        Fraction S = M.subtract(K);
        System.out.println(S.toString());
    }

        }

