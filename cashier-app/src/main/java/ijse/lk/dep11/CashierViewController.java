package ijse.lk.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
    private TableView<?> tblCashier;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtName;

    @FXML
    void btnOrder(ActionEvent event) {

    }

}
