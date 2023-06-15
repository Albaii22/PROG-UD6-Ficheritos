package actividad2;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class RecoverText {
    public static void main(String[] args) {
        File archivo = new File ("src/ficheros/RecuperacionDeTextoEnUnfichero");
        NuevoTexto(archivo);
    }

    public static void NuevoTexto(File fichero) {
        try {
            FileReader lector = new FileReader(fichero);
            int caracter;
            while ((caracter = lector.read()) != -1) {
                System.out.print((char) caracter + "_" + caracter + ",");
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("ANDAI MAL WEON");
            e.printStackTrace();
        }
    }
}

