import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Prueba2 {
    public static void main(String[] args) {
        String nombre = "Lsui";
        String num = "1234";
        String nombreCarpeta = nombre + num;
        String nombreArchivo = "miNota.txt";
        String contenidoArchivo = "Este es el contenido de mi nota.";

        // Crear la carpeta
        File carpeta = new File(nombreCarpeta);
        boolean carpetaCreada = carpeta.mkdir();

        if (carpetaCreada) {
            System.out.println("La carpeta se ha creado exitosamente.");

            // Crear el archivo dentro de la carpeta
            File archivo = new File(carpeta, nombreArchivo);
            try {
                FileWriter escritor = new FileWriter(archivo);
                escritor.write(contenidoArchivo);
                escritor.close();
                System.out.println("El archivo de nota se ha creado exitosamente.");
            } catch (IOException e) {
                System.out.println("No se pudo crear el archivo de nota: " + e.getMessage());
            }
        } else {
            System.out.println("No se pudo crear la carpeta.");
        }
    }
}
