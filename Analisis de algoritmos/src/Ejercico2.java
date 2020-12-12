public class Ejercico2 {
    public static void main(String[] args) {
        String palabra = "Hola";
        System.out.println(inv(palabra, palabra.length()-1));

    }
    public static String inv(String palabra, int longitud){

        if(longitud==0){
            return palabra.charAt(longitud)+"";
        }else{
            return palabra.charAt(longitud) + (inv(palabra, longitud-1));
        }

    }
}
