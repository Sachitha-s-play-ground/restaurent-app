package lk.ijse.dep11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order implements Serializable {
    String id ;
    String name;
    ArrayList<Item> itemlist;
    String status;
    String contact;

}
