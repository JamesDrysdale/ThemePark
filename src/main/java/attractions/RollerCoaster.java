package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed {

    private double price;

    public RollerCoaster(String name, int rating, double price) {
        super(name, rating);
        this.price  = price;
    }

    // Rollercoaster has height and age restriction
    // Visitors must be over 145cm tall AND over 12 years old
    public boolean isAllowed(Visitor visitor){
        if(visitor.getAge() > 12 && visitor.getHeight() > 145 ){
            return true;
        }
        return false;
    }

    //Get standard price of ticket
    public double getPrice(){
        return price;
    }



}
