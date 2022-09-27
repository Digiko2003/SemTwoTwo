package Libreria;
import java.io.IOException;
import java.io.PrintWriter;

public class Txt {
    public static void main(String[] args) throws IOException{

        //Abrir el archivo
        PrintWriter salidaArchivo = new PrintWriter("salida.txt");
        //Escribir sobrte el archivo
        salidaArchivo.println("hola mundo");
        //Cerrar el archivo
        salidaArchivo.close();

        System.out.println("Datos grabados en el archivo");

    }
}
