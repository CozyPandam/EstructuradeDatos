package sample.Estructura;

import javafx.beans.property.SimpleStringProperty;

public class Pedido {

    SimpleStringProperty bebida;
    SimpleStringProperty cantidadBebida;
    SimpleStringProperty platillo;
    SimpleStringProperty CantidadPlatillo;

    public Pedido(String bebida, String cantidadBebida, String platillo, String cantidadPlatillo) {
        this.bebida = new SimpleStringProperty(bebida);
        this.cantidadBebida = new SimpleStringProperty(cantidadBebida);
        this.platillo = new SimpleStringProperty(platillo);
        CantidadPlatillo = new SimpleStringProperty(cantidadPlatillo);
    }

    public String getBebida() {
        return bebida.get();
    }

    public SimpleStringProperty bebidaProperty() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida.set(bebida);
    }

    public String getCantidadBebida() {
        return cantidadBebida.get();
    }

    public SimpleStringProperty cantidadBebidaProperty() {
        return cantidadBebida;
    }

    public void setCantidadBebida(String cantidadBebida) {
        this.cantidadBebida.set(cantidadBebida);
    }

    public String getPlatillo() {
        return platillo.get();
    }

    public SimpleStringProperty platilloProperty() {
        return platillo;
    }

    public void setPlatillo(String platillo) {
        this.platillo.set(platillo);
    }

    public String getCantidadPlatillo() {
        return CantidadPlatillo.get();
    }

    public SimpleStringProperty cantidadPlatilloProperty() {
        return CantidadPlatillo;
    }

    public void setCantidadPlatillo(String cantidadPlatillo) {
        this.CantidadPlatillo.set(cantidadPlatillo);
    }
}
