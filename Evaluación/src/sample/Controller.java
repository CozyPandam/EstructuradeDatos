package sample;

import Peces.Pez;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    @FXML TextField txtarreglo;
    @FXML ListView lista;
    @FXML ComboBox comboBox;
    int []arreglo_nacimientos = new int[4];
    String[][] arreglo_combo ={
            {"Trucha", "Pez Globo", "Sardina", "Carpa"}
    };
    int cont = 0;

    @FXML protected void initialize(){
        comboBox.getItems().addAll("Trucha", "Salmon","Pez Globo","Carpa");
    }
    public void insertar (ActionEvent event){
        if (cont<4){
            int nacimiento = Integer.parseInt(txtarreglo.getText());
            ObservableList combo = comboBox.getItems();
            arreglo_nacimientos[cont]= nacimiento;
            cont++;
            txtarreglo.setText("");
            imprimirArreglo(arreglo_nacimientos);
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Arreglo lleno");
            alert.show();
        }

    }
    public void procesar (ActionEvent event){
        Pez peces  = new Pez(arreglo_nacimientos);
        int [] res=

    }

    public void imprimirArreglo(int[] arr){
        for (int x=0; x<arr.length; x++){
            System.out.print(arr[x] + ",");
        }
        System.out.println("");
    }
}
