package ijse.lk.dep11;

import java.io.Serializable;

public class Item implements Serializable {
    Food food;
    int qty;

    public Item(Food food, int qty) {
        this.food = food;
        this.qty = qty;
    }
}
