package actividad4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetodosMesa {
    private static final String NOMBRE_ARCHIVO = "src/ficheros/PersistenciaYRecuperacionDeObjetos.txt";

    public static void guardarMesa(Mesa mesa) {
        try (FileWriter writer = new FileWriter(NOMBRE_ARCHIVO, true);
             BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write(mesa.toString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error ");
        }

    }

    public static List<Mesa> obtenerMesas() {
        List<Mesa> mesas = new ArrayList<>();

        try (FileReader reader = new FileReader(NOMBRE_ARCHIVO);
             BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length == 2) {
                    String color = parts[0].substring(6);
                    int numeroPatas = Integer.parseInt(parts[1].substring(13));
                    Mesa mesa = new Mesa(color, numeroPatas);
                    mesas.add(mesa);
                }
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

        return mesas;
    }
}




