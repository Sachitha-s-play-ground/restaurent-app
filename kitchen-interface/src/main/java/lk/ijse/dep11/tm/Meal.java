package lk.ijse.dep11.tm;

import lk.ijse.dep11.Food;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Meal implements Serializable {
    Food food;
    int qty;
}
