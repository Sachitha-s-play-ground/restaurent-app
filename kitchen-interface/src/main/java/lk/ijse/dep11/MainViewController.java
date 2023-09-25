package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import lk.ijse.dep11.tm.Meal;

public class MainViewController {
    public AnchorPane root;
    public TableView<Order> tbvOrderDetails;
    public TextField txtID;
    public TableView<Meal> tbvItemDetails;
    public Button btnComplete;

    public void initialize(){

    }




    public void btnCompleteOnAction(ActionEvent actionEvent) {
    }
}
