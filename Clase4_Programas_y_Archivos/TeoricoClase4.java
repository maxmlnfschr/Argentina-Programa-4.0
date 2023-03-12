package Clase4_Programas_y_Archivos;

public class TeoricoClase4 {
    public static void main(String[] args) throws Exception {
        System.out.println(contarLetra("", 'a'));
    }

    public static int contarLetra(String unaPalabra, char letra){

        int cuenta = 0;

        for (int i = 0; i<unaPalabra.length(); i++){
            if( unaPalabra.charAt(i)  == letra){
                cuenta = cuenta + 1;
            }
        }
        return cuenta;
    }
}