package archivosTexto;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SALAZAR LAURA SEBASTIAN MANUEL
 */
public class Manejo_Archivos {

    public static void main(String[] args) throws IOException {
        /**
         * Punto de entrada de la aplicacion. Presenta un menu en consola y
         * delega las operaciones en `GestionArchivos`.
         *
         */
        GestionArchivos obj = new GestionArchivos();
        int opc;
        boolean continuar = true;
        Scanner lee = new Scanner(System.in);
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Crear Archivo");
            System.out.println("2. Agregar Contacto");
            System.out.println("3. Salir");
            System.out.println("Digite una opcion");
            opc = lee.nextInt();

            switch (opc) {
                case 1 ->
                    obj.crearArchivo();
                case 2 ->
                    obj.adicionarContacto();
                default ->
                    continuar = false;
            }
        } while (continuar);
    }
}
