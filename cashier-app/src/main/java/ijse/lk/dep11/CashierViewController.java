package ijse.lk.dep11;

import ijse.lk.dep11.tm.Order;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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

    }



}
