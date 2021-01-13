package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Estructura.ItemsPedido;
import sample.Estructura.Pedido;

import java.util.LinkedList;
import java.util.Queue;

public class ControllerCobro {
    @FXML ComboBox comboBebidas, comboPlatillos;
    @FXML TableView tabla;
    @FXML TextField txtCantBebidas, txtCantPlatillos, txtNombre;
    @FXML Label nombrePedido;

    LinkedList<String> listaBebidas = new LinkedList<>();
    LinkedList<String> listaPlatillos = new LinkedList<>();

    TableColumn columnaBebida = new TableColumn("Bebida");
    TableColumn columnaCantBebida = new TableColumn("Cantidad");
    TableColumn columnaPlatillos = new TableColumn("Platillos");
    TableColumn columnaCantPlatillos = new TableColumn("Cantidad");
    ObservableList<Pedido> listaPedidos = FXCollections.observableArrayList();

    Queue<ItemsPedido> cola = new LinkedList<>();


    @FXML protected void initialize(){
        columnaBebida.setCellValueFactory(new PropertyValueFactory<Pedido, String>("bebida"));
        columnaCantBebida.setCellValueFactory(new PropertyValueFactory<Pedido, String>("cantidadBebida"));
        columnaPlatillos.setCellValueFactory(new PropertyValueFactory<Pedido, String>("platillo"));
        columnaCantPlatillos.setCellValueFactory(new PropertyValueFactory<Pedido, String>("CantidadPlatillo"));

        tabla.getColumns().addAll(columnaBebida,columnaCantBebida,columnaPlatillos,columnaCantPlatillos);
        tabla.setItems(listaPedidos);

        listaBebidas.add("CocaCola");
        listaBebidas.add("Agua");
        listaPlatillos.add("HotPot");
        listaPlatillos.add("Dumplings");
        for (int x=0; x<listaPlatillos.size();x++) comboPlatillos.getItems().add(listaPlatillos.get(x));
        for (int x=0; x<listaBebidas.size();x++) comboBebidas.getItems().add(listaBebidas.get(x));

    }
    public void insertarPedido(ActionEvent event){
        String b = comboBebidas.getSelectionModel().getSelectedItem().toString();
        String p = comboPlatillos.getSelectionModel().getSelectedItem().toString();
        String cb = txtCantBebidas.getText();
        String cp = txtCantPlatillos.getText();
        listaPedidos.add(new Pedido(b,cb,p,cp));
    }

    public void guardarPedido(ActionEvent event){
        String[][] items = new String[listaPedidos.size()][4];
        for (int x=0; x<items.length; x++){
            items[x][0] = listaPedidos.get(x).getBebida();
            items[x][1] = listaPedidos.get(x).getCantidadBebida();
            items[x][2] = listaPedidos.get(x).getPlatillo();
            items[x][3] = listaPedidos.get(x).getCantidadPlatillo();
        }
        ItemsPedido pedido = new ItemsPedido(items, txtNombre.getText());
        cola.add(pedido);
        listaPedidos.clear();
        txtNombre.setText("");
    }

    public void finalizar(){
        ItemsPedido pedido = cola.poll();
        nombrePedido.setText(pedido.getNombre());
        String [][] datos = pedido.getDatos();
        for (int x=0; x<datos.length; x++){
            System.out.print(datos[x][0] + " ");
            System.out.print(datos[x][1] + " ");
            System.out.print(datos[x][2] + " ");
            System.out.print(datos[x][3] + " ");
            System.out.println();
        }
    }
}
