package ijse.lk.dep11.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    String id ;
String name;
ArrayList<Item> itemlist;
String status;

}
