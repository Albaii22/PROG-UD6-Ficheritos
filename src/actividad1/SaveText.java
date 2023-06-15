package actividad1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveText {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un texto con un minimo de 30 caracteres");
        String texto = teclado.nextLine();

        if (texto.length() < 30) {
            while (texto.length() < 30) {
                int letrasRestantes = 30 - texto.length();
                System.out.println("El texto tiene " + texto.length() + " faltan " + letrasRestantes + " para que tenga " +
                        "el minimo de caracteres");
                texto = teclado.next();
            }
        } else {
            String cadenaNueva = texto.toUpperCase().replace(" ", "_");
            System.out.println(cadenaNueva);
            try {
                FileWriter pasarTexto = new FileWriter("src/ficheros/GuardadoDeTextoEnUnFichero");
                pasarTexto.write(cadenaNueva);
                pasarTexto.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}