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
            try{
                if(denominator == 0){
                    throw new ArithmeticException();}
            }catch (ArithmeticException e){System.out.println("Denominator cannot be zero"); throw e;}
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
            try{
                j = Integer.parseInt(fraction.substring(0, fraction.indexOf("/")).trim());
                k = Integer.parseInt(fraction.substring(fraction.indexOf("/") + 1).trim());
                s = j/k;
            }catch (ArithmeticException e){System.out.println("Denominator cannot be zero"); throw e;}
            catch (NumberFormatException d){System.out.println("Please use valid number"); throw d;}
            a = j; b = k;
            if(a < 0){ g=true;
                a*=-1; j*=-1;
            }if (b < 0){
                x = true; b*=-1; k*=-1;}
            a = gcd(k,j);
             k/=a; j/=a; if(x){j*=-1; k*=-1;} if(g){j*=-1;}
            this.numerator = j; this.denominator = k;}else{
            try{
            this.numerator = Integer.parseInt(fraction);
            this.denominator = 1;}catch (NumberFormatException d){System.out.println("Please use valid number"); throw d;}}
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
        o.denominator *= this.denominator;
        if(o.numerator <0){o.numerator *=-1; c=false;}
        if(o.numerator == 0){o.denominator = 1;}else{
        int a = gcd(o.numerator, o.denominator);
            o.numerator /= a; o.denominator/= a;}
        if(!c){o.numerator *=-1;}
    return o;}

    /**Method
     * Euclid's algorithm
     * @return
     */
    private static int gcd( int a, int b){
        while(a != b){
            if(a == 0 | b == 0){}
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
        o.denominator *= this.denominator;
        if(o.numerator <0){o.numerator *=-1; c=false;}
        if(o.numerator == 0){o.denominator = 1;}else{
            int a = gcd(o.numerator, o.denominator);
        o.numerator /= a; o.denominator/= a;}
        if(!c){o.numerator *=-1;}
        return o;}

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        FractionImpl o = (FractionImpl)f;
        boolean c = true;
        if(o.denominator < 0){o.denominator *=-1; o.numerator *=-1;}
        if(this.denominator < 0) {this.denominator *=-1; this.numerator *=-1;}
        o.numerator *= this.numerator;
        o.denominator *= this.denominator;
        if(o.numerator <0){o.numerator *=-1; c=false;}
        if(o.numerator == 0){o.denominator = 1;}else{
            int a = gcd(o.numerator, o.denominator);
            o.numerator /= a; o.denominator/= a;}
        if(!c){o.numerator *=-1;}
        return o;}

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f)  {
        FractionImpl o = (FractionImpl)f;
        int x = o.numerator;
        boolean c = true;
        if(o.denominator < 0){o.denominator *=-1; o.numerator *=-1;}
        if(this.denominator < 0) {this.denominator *=-1; this.numerator *=-1;}
        o.numerator = o.denominator * this.numerator;
        o.denominator = x * this.denominator;
        if(o.numerator <0){o.numerator *=-1; c=false;}
        if(o.numerator == 0){o.denominator = 1;}else {
            int a = gcd(o.numerator, o.denominator);
        o.numerator /= a; o.denominator/= a;}
        if(!c){o.numerator *=-1;}
        return o;}

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        Fraction x = new FractionImpl(Math.abs(this.numerator), Math.abs(this.denominator) );
        return x;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        Fraction x = new FractionImpl(this.numerator*-1, this.denominator);
        return x;
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
       if(obj instanceof Fraction){
        FractionImpl x = (FractionImpl) obj;
        return (numerator == x.numerator) && (denominator == x.denominator);}else{
           return false;
       }
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
        Fraction x = new FractionImpl(this.denominator, this.numerator);
        return x;
    }

    /**
     * @inheritDoc
     * The least common multiple (lcm), which is needed to compare the two fractions is
     * the product of the denominators divided by their gcd. lcm(a,b) = ab/gcd(a,b).
     */
    @Override
    public int compareTo(Fraction o) {
        FractionImpl f = (FractionImpl)o;
        int a = (this.denominator * ((FractionImpl) o).denominator) / gcd(this.denominator, ((FractionImpl) o).denominator);
        if ((a/this.denominator) * this.numerator < (a/((FractionImpl) o).denominator)* ((FractionImpl) o).numerator){
            return -1;
        } else if ((a/this.denominator) * this.numerator == (a/((FractionImpl) o).denominator)* ((FractionImpl) o).numerator){
            return 0;
        } else{
            return 1;
        }
    }

    /**
     * @inheritDoc
     *
     * Returns a string of the form numerator / denominator. A Zero is represented as a 0/1
     * If the denominator equals to a one only the numerator is returned.
     */
    @Override
    public String toString() {
        String n = Integer.toString(this.numerator);
        String d = Integer.toString(this.denominator);
        if(d.equals("1") && !n.equals("0")){
            return n;
        }else if(n.equals(d)){
            return "1";
        }else{
        return n + "/" + d;}
    }
}