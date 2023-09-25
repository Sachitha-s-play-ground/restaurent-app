package ijse.lk.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

    public void initialize(){
        SpinnerValueFactory<Integer> valueFactory1=new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100,1);
                spnBurger.setValueFactory(valueFactory1);

        SpinnerValueFactory<Integer> valueFactory2=new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100,1);
            spnChicken.setValueFactory(valueFactory2);

        SpinnerValueFactory<Integer> valueFactory3=new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100,1);
            spnFish.setValueFactory(valueFactory3);

        SpinnerValueFactory<Integer> valueFactory4=new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100,1);
            spnSubmarin.setValueFactory(valueFactory4);

    }

}
