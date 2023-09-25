package ijse.lk.dep11;

import ijse.lk.dep11.tm.Order;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class CashierViewController {

    @FXML
    private Button btnOrder;

    @FXML
    private Spinner<?> spnBurger;

    @FXML
    private Spinner<?> spnChicken;

    @FXML
    private Spinner<?> spnFish;

    @FXML
    private Spinner<?> spnSubmarin;

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
    }
    @FXML
    void btnOrder(ActionEvent event) {

    }

}
