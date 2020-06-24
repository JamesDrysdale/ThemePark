package attractions;

import behaviours.ISecurity;

public class RollerCoaster  extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    // Rollercoaster has height and age restriction
    // Visitors must be over 145cm tall AND over 12 years old


}
