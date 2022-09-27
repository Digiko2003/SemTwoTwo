package Libreria;

import java.util.Scanner;
public class Main {
    static Catalogo catalogoTienda = new Catalogo();
    static  Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){
        //Para enzazar el archivo de texto
        Archivo archivox = new Archivo("Tienda.txt");
        //Para crear si no existe el archivo
        archivox.crearArchivo();
        catalogoTienda.verCatalogo();


        int opcion, indice;
        int clave;

        do{
            menu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    pedirDatosLibro();
                    archivox.escribirEnArchivo(catalogoTienda.getListaLibros());
                    break;
                case 2:
                    catalogoTienda.verCatalogo();
                    break;

                case 3:
                    System.out.print("Dame la clave del libro a borrar: ");
                    clave = entrada.nextInt();
                    indice = catalogoTienda.buscarLibroPorClaveSecuencial(clave);
                    if (indice == -1){
                        System.out.println("La clave no existe. Repite la operación");

                    } else {
                        catalogoTienda.borrarCancion(clave);
                        System.out.println("se ha eliminado");
                        catalogoTienda.verCatalogo();
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No válido");
                    break;
            } // fin de switch
        } while (opcion != 4);
    }

    private static void menu() {
        imprimirLinea();
        System.out.println("Operaciones sobre la Tienda");
        System.out.println("1.- Añadir una computadora");
        System.out.println("2.- Mostrar Lista");

        System.out.println("3.- Borrar una computadora");
        ;
        System.out.println("4.- Salir");
        System.out.println("Elige tu opción: ");
    } //fin de menu

    public static void pedirDatosLibro(){
        int clave;
        String nombreLibro, nombreAutor;
        double precio;

        System.out.print("Dame la clave: ");
        clave = entrada.nextInt();

        entrada.nextLine();
        System.out.print("Dame el modelo: ");
        nombreLibro = entrada.nextLine();

        System.out.println("Dame el marca: ");
        nombreAutor = entrada.nextLine();


        System.out.print("Dame el precio: ");
        precio = entrada.nextDouble();

        Libros LibroX = new Libros(clave,nombreLibro, nombreAutor,precio);
        catalogoTienda.insertarLibro(LibroX);
    }
    public static void imprimirLinea(){
        System.out.println("------------------------------------------------------------------" +
                "-------------------");

    }
}