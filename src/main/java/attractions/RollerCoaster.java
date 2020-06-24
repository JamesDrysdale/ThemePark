package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    // Rollercoaster has height and age restriction
    // Visitors must be over 145cm tall AND over 12 years old
    public boolean isAllowed(Visitor visitor){
        if(visitor.getAge() > 12 && visitor.getHeight() > 145 ){
            return true;
        }
        return false;
    }

}
