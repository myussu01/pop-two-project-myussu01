package fraction;

public class FractionImpl implements Fraction {
    /**
     * Parameters are the <em>numerator</em> and the <em>denominator</em>.
     * Normalize the fraction as you create it.
     * For instance, if the parameters are <pre>(8, -12)</pre>, create a <pre>Fraction</pre> with numerator
     * <pre>-2</pre> and denominator <pre>3</pre>.
     *
     * The constructor should throw an <pre>ArithmeticException</pre> if the denominator is zero.
     */
     private int numerator;
     private int denominator;

    public FractionImpl(int numerator, int denominator) {
        /** Used the Euclidean Algorithm to find the GCD and then divided
         * both the numerator and denominator with the formula */
            boolean j = false; boolean x = false;
            if(numerator < 0){ x = true;
                numerator*=-1;
            }if (denominator < 0){
                j = true; denominator*=-1;}
            int a = gcd(numerator,denominator);
            numerator/=a; denominator/=a; if(j){
                numerator*=-1;} if(x){ numerator*=-1;}
            this.numerator = numerator; this.denominator = denominator;}

    /**
     * The parameter is the numerator and <pre>1</pre> is the implicit denominator.
     *
     * @param wholeNumber representing the numerator
     */
    public FractionImpl(int wholeNumber) {
        // TODO
        this.numerator = wholeNumber;
        this.denominator = 1;
    }

    /**
     * The parameter is a <pre>String</pre> containing either a whole number, such as `5` or `-3`, or a fraction,
     * such as "8/-12".
     * Allow blanks around (but not within) integers.
     * The constructor should throw an <pre>ArithmeticException</pre>
     * if given a string representing a fraction whose denominator is zero.
     * <p>
     * You may find it helpful to look at the available String API methods in the Java API.
     *
     * @param fraction the string representation of the fraction
     */
    public FractionImpl(String fraction) {
        // TODO
        int j, k, a, b, s = 0;
        boolean x = false; boolean g = false;
        if(fraction.contains("/")){
            try{  j = Integer.parseInt(fraction.substring(0, fraction.indexOf("/")).trim());
                try{k = Integer.parseInt(fraction.substring(fraction.indexOf("/") + 1).trim());;}
            catch(ArithmeticException e){System.out.println("Denominator cannot be zero"); throw e;}
            }   catch(NumberFormatException e){System.out.println("Invalid number; please try again"); throw e;}
            a = j; b = k;
            if(a < 0){ g=true;
                a*=-1; j*=-1;
            }if (b < 0){
                x = true; b*=-1; k*=-1;}
            a = gcd(k,j);
             k/=a; j/=a; if(x){j*=-1; k*=-1;} if(g){j*=-1;}
            this.numerator = j; this.denominator = k;} else{
            this.numerator = Integer.parseInt(fraction);
            this.denominator = Integer.parseInt("1");}
        if(this.denominator < 0){this.numerator *= -1;}
        }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {
        FractionImpl o = (FractionImpl)f;
        boolean c = true;
        if(o.denominator < 0){o.denominator *=-1; o.numerator *=-1;}
        if(this.denominator < 0) {this.denominator *=-1; this.numerator *=-1;}
        o.numerator = ((this.numerator * o.denominator) + (this.denominator * o.numerator));
        o.denominator = this.denominator * o.denominator;
        if(o.numerator <0){o.numerator *=-1; c=false;}
        int a = gcd(o.numerator, o.denominator);
            o.numerator /= a; o.denominator/= a;
        if(!c){o.numerator *=-1;}
    return o;}

    /**Method
     * Euclid's algorithm
     * @return
     */
    private static int gcd( int a, int b){
        while(a != b){
         if(a>b){a = a-b;}
         else{b = b-a;}}
        return a;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {
        FractionImpl o = (FractionImpl)f;
        boolean c = true;
        if(o.denominator < 0){o.denominator *=-1; o.numerator *=-1;}
        if(this.denominator < 0) {this.denominator *=-1; this.numerator *=-1;}
        o.numerator = ((this.numerator * o.denominator) - (this.denominator * o.numerator));
        o.denominator = this.denominator * o.denominator;
        if(o.numerator <0){o.numerator *=-1; c=false;}
        int a = gcd(o.numerator, o.denominator);
        o.numerator /= a; o.denominator/= a;
        if(!c){o.numerator *=-1;}
        return o;}

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * @inheritDoc
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction inverse() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(Fraction o) {
        return 0;
    }

    /**
     * @inheritDoc
     */
    @Override
    public String toString() {
        String n = Integer.toString(this.numerator);
        String d = Integer.toString(this.denominator);
        if(d.equals("1")){
            return n;
        }else if(n.equals(d)){
            return "1";
        }else{
        return n + "/" + d;}
    }
}