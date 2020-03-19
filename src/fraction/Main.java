package fraction;

public class Main {

    public static void main(String []args){

        FractionImpl M = new FractionImpl(135, 445);
        System.out.println(M.getDenom());
    }



    public static int M(String numerator){

            int j, s = 0;
            int k = 0;
            j = Integer.parseInt(numerator.substring(0, numerator.indexOf("/")).trim());
            k = Integer.parseInt(numerator.substring(numerator.indexOf("/") + 1).trim());
            try{s = j/k;}
            catch(ArithmeticException e){System.out.print("Number is incorrect"); throw e;}
            boolean x = false;
            boolean g = false;
            int a = j;
            int b = k;

            if(a < 0){ g=true;
                a*=-1; j*=-1;
            }if (b < 0){
                x = true; b*=-1; k*=-1;} if(a<0){g = true; a*=-1;}
            while(a != b){
                if(a>b){a = a-b;}else{
                    b = b-a;}
            } k/=a; j/=a; if(x){j*=-1;} if(g){j*=-1;}

        return j; }
        }

