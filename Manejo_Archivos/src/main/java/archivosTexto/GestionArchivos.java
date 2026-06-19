package archivosTexto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class GestionArchivos {

    Scanner lee = new Scanner(System.in);

    public void crearArchivo() {
        Path path = Paths.get("C:\\Users\\user\\Desktop\\PrograII\\misContactos.txt");
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("====Archivo Creado :0 ====");
            } else {
                System.out.println("El Archivo ya existe :( ");
            }
        } catch (IOException e) {
        }
    }

    public void adicionarContacto() throws IOException {
        Path path = Paths.get("C:\\Users\\user\\Desktop\\PrograII\\misContactos.txt");
        String nombre, direccion, telefono, resp;
        if (Files.exists(path)) {
            do {
                System.out.println("Digite Nombre");
                nombre = lee.nextLine();
                System.out.println("Digite Direccion");
                direccion = lee.nextLine();
                System.out.println("Digite telefono");
                telefono = lee.nextLine();
                nombre = nombre + "-" + direccion + "-" + telefono + "\n";
                Files.write(path, nombre.getBytes(), StandardOpenOption.APPEND);
                System.out.println("====Contacto Registrado====");
                System.out.println("Desea seguir agragando contactos? S/N");
                resp = lee.nextLine();
            } while (resp.equalsIgnoreCase("S"));
        } else {
            System.out.println("El Archivo no existe :( ");
        }
    }
}
