package ijse.lk.dep11;

import ijse.lk.dep11.tm.Order;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.*;

public class CashierViewController {



    @FXML
    private Button btnOrder;

    @FXML
    private Spinner<Integer> spnBurger;

    @FXML
    private Spinner<Integer> spnChicken;

    @FXML
    private Spinner<Integer> spnFish;

    @FXML
    private Spinner<Integer> spnSubmarin;

    @FXML
    private TableView<Order> tblCashier;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtName;

    public void initialize(){
        tblCashier.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));

        tblCashier.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblCashier.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("itemlist"));
        tblCashier.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("status"));

        SpinnerValueFactory<Integer> valueFactory1=new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100,1);
        spnBurger.setValueFactory(valueFactory1);

        SpinnerValueFactory<Integer> valueFactory2=new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100,1);
        spnChicken.setValueFactory(valueFactory2);

        SpinnerValueFactory<Integer> valueFactory3=new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100,1);
        spnFish.setValueFactory(valueFactory3);

        SpinnerValueFactory<Integer> valueFactory4=new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100,1);
        spnSubmarin.setValueFactory(valueFactory4);


    }
    @FXML
    void btnOrder(ActionEvent event) {
    if (!txtName.getText().matches( "^[A-Za-z ]+" )){
        txtName.requestFocus();
        txtName.selectAll();
        return;
    } else if (!txtContact.getText().matches( "\\d{3}-\\d{7}" )) {
        new Alert(Alert.AlertType.ERROR,"Invalid Contact");
        txtContact.requestFocus();
        txtContact.selectAll();
        return;
    }

    }



}

enum Food {
    SUBMARINE,BERGER,CHICKEN,FISH;

}
class Item{
    Food food;
    int qty;

    public Item(Food food, int qty) {
        this.food = food;
        this.qty = qty;
    }
}