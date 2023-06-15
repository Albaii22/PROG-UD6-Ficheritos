package actividad3;

import java.io.*;

public class FusionarFicheros {


    public static void main(String[] args) {
        File ficheroFinal = new File("src/ficheros/FusionDeFicheros");
        fusionarFichero(ficheroFinal);
        String mensajeFirma = "Mensajito de Firma rey";
        anadirMensajeFirma(ficheroFinal, mensajeFirma);
    }

    public static void fusionarFichero(File fichero) {
        try {
            FileReader lector1 = new FileReader("src/ficheros/RecuperacionDeTextoEnUnfichero");
            BufferedReader buffer1 = new BufferedReader(lector1);
            String contenidoFichero1 = buffer1.readLine();

            FileReader lector2 = new FileReader("src/ficheros/GuardadoDeTextoEnUnFichero");
            BufferedReader buffer2 = new BufferedReader(lector2);
            String contenidoFichero2 = buffer2.readLine();

            FileWriter escritor = new FileWriter("src/ficheros/FusionDeFicheros");
            escritor.write(contenidoFichero1 + "       ");
            escritor.write(contenidoFichero2 + "        ");
            escritor.close();

            buffer1.close();
            buffer2.close();
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }

    public static void anadirMensajeFirma(File fichero, String mensaje) {
        try {
            FileWriter escritor = new FileWriter(fichero, true);
            escritor.write(mensaje);
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }
}