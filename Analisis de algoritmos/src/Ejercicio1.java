public class Ejercicio1 {
    public static void main(String[] args) {
        //llamada inicial
        int posicion = 5;
        int resultado = fb(posicion);
        System.out.println(resultado);

    }
    public static int fb(int n) {
        if (n == 0) {
            return 0;
            //CASO BASE
        } else if (n == 1) {
            return 1;
        } else {

            return fb(n - 1) + fb(n - 2);
        }

    }
}
