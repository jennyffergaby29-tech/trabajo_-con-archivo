/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mis_notas.txt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Master
 */
public class Mis_notasTxt {

    public static void main(String[]args) 
    {
      String nombreArchivo = "mis_notas.txt";

        escribirNotas(nombreArchivo);

        leerNotas(nombreArchivo);
    }

    public static void escribirNotas(String archivo) {
        try (
            FileWriter fw = new FileWriter(archivo);
            PrintWriter pw = new PrintWriter(fw)
        ) {
            pw.println("Esta semana aprendí sobre manejo de archivos en Java.");
            pw.println("También practiqué estructuras de control y ciclos.");
            pw.println("Me siento más cómodo programando con clases y métodos.");

            System.out.println("Notas escritas correctamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static void leerNotas(String archivo) {
        try (
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr)
        ) {
            String linea;

            System.out.println("\nContenido del archivo:");

            while ((linea = br.readLine()) != null) {
                System.out.println("Nota: " + linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
    
    

