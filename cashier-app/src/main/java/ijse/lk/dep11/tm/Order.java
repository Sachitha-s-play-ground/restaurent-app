package ijse.lk.dep11.tm;

import ijse.lk.dep11.Item;
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
