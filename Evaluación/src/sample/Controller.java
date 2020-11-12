package sample;

import Peces.Pez;
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
    int []arreglo_nacimientos = new int[2];
    int cont = 0;
    Pez pez = new Pez();

    Pez pescados = new Pez();
    String[] peces = new String[3];

    @FXML protected void initialize(){
        comboBox.getItems().addAll("Trucha", "Salmon");
    }
    public void insertar (ActionEvent event){
        if (cont<4){
            int nacimiento = Integer.parseInt(txtarreglo.getText());
            //ObservableList combo = comboBox.getItems();
            arreglo_nacimientos[cont]= nacimiento;
            cont++;
            imprimirArreglo(arreglo_nacimientos);

            double x = Double.parseDouble(txtarreglo.getText());
            String res = pescados.Por_nacimiento(x);
            peces[1] = res;
            txtarreglo.setText("");
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Arreglo lleno");
            alert.show();
        }

    }
    public void procesar (ActionEvent event){
        double y = Double.parseDouble(txtarreglo.getText());
        lista.getItems().add("Pescado"+comboBox.getValue().toString()+ "  nacen" + y +  "  por cria"  + peces[1] +  "  al año, perdida de peces"  );
        txtarreglo.setText(String.valueOf(""));

    }

    public void imprimirArreglo(int[] arr){
        for (int x=0; x<arr.length; x++){
            System.out.print(arr[x] + ",");
        }
        System.out.println("");
    }
}
