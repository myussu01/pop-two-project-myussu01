package fraction;
/*
* This program calculates the amount of discount
* on a particular item/items depending on the season and the
* amount of a particular has been bought.
*
* Discounts in December are at 50% and any items of quantity more than
* 5 get 10% discount. In April the discount is at 20%.
*
* */

public class Discount extends FractionImpl {

    float price;

    public Discount(float x){
        super(1,2);
        this.price = x;
    }

    public void amount(Item itm){
        if(itm.amount > 5 ){
            this.price *= item.price;
        }
    }
    public String toString() {
        String x = Float.toString(this.price);
        return "£" + x ;
    }
}


