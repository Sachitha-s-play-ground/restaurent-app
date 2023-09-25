package ijse.lk.dep11;

import ijse.lk.dep11.tm.Order;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

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

    private ArrayList<Order> ordersList = new ArrayList<>();

    public void initialize() throws IOException {
//        Socket socket = new Socket("local host",5050);


        tblCashier.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));
        tblCashier.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblCashier.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("itemlist"));
        tblCashier.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("status"));
        SpinnerValueFactory<Integer> valueFactory1=new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,0);
        spnBurger.setValueFactory(valueFactory1);

        SpinnerValueFactory<Integer> valueFactory2=new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,0);
        spnChicken.setValueFactory(valueFactory2);

        SpinnerValueFactory<Integer> valueFactory3=new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,0);
        spnFish.setValueFactory(valueFactory3);

        SpinnerValueFactory<Integer> valueFactory4=new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,0);
        spnSubmarin.setValueFactory(valueFactory4);

        ObservableList<Order> observableOrderList = FXCollections.observableList(ordersList);
        tblCashier.setItems(observableOrderList);
    }
    @FXML
    void btnOrder(ActionEvent event) throws IOException {
        List<Order> orderList = tblCashier.getItems();
        Order order = new Order();
        if(orderList.isEmpty()){
            order.setId("1");
        } else {
            order.setId(String.format("%s",(Integer.parseInt(orderList.get(orderList.size()-1).getId()))+1));
        }
        order.setName(txtName.getText());
        order.setContact(txtContact.getText());
        ArrayList<Item> items = new ArrayList<>();

        if(spnSubmarin.getValue()!=null){
            items.add(new Item(Food.SUBMARINE,spnSubmarin.getValue()));
        }
        if(spnChicken.getValue()!=null){
            items.add(new Item(Food.CHICKEN,spnChicken.getValue()));
        }
        if(spnFish.getValue()!=null){
            items.add(new Item(Food.FISH,spnFish.getValue()));
        }
        if(spnBurger.getValue()!=null){
            items.add(new Item(Food.BERGER,spnBurger.getValue()));
        }
        order.setItemlist(items);

        order.setStatus("pending");

        orderList.add(order);

        Socket socket = new Socket("localhost",5050);
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(order);


    }

}

enum Food {
    SUBMARINE,BERGER,CHICKEN,FISH;

}
