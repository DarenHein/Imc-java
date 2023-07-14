import java.io.File;

public class Prueba {
    public static void main(String[] args) {
        String nombre = "Luis";
        String nombreCarpeta = nombre;
        File carpeta = new File(nombreCarpeta);

        if (!carpeta.exists()) {
            if (carpeta.mkdir()) {
                System.out.println("La carpeta se ha creado exitosamente.");
            } else {
                System.out.println("No se pudo crear la carpeta.");
            }
        } else {
            System.out.println("La carpeta ya existe.");
        }
    }
}
