import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada listaEnlazada = new ListaEnlazada();
        listaEnlazada.insertar(new Cancion("Navidad", "/navidad.mp3", 65));
        listaEnlazada.insertar(new Cancion("Navidad", "/navidad.mp3", 65));
        listaEnlazada.insertar(new Cancion("Navidad", "/navidad.mp3", 65));
        listaEnlazada.mostrarElementos();
        LinkedList<Cancion> listaJava = new LinkedList<>();

        listaJava.add(new Cancion("Why", "Is it", 12));
        listaJava.add(new Cancion("Why2", "Is it", 12));
        listaJava.add(new Cancion("Why3", "Is it", 12));
        for (int x = 0; x < listaJava.size(); x++){
            Cancion c = listaJava.get(2);
            System.out.println(c.getNombre());
        }

    }

}
