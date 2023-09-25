package ijse.lk.dep11;

import ijse.lk.dep11.tm.Order;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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
        tblCashier.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblCashier.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("itemlist"));
        tblCashier.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("status"));
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
