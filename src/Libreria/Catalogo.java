package Libreria;

import java.util.ArrayList;
import java.util.Iterator;
public class Catalogo {
    private ArrayList<Libros> listaLibros;

    public Catalogo () {
        listaLibros = new ArrayList <>();
    }
    public void setListaLibros (ArrayList <Libros> lista){
        this.listaLibros = lista;
    }
    public ArrayList<Libros> getListaLibros(){
        return listaLibros;
    }
    public void insertarLibro (Libros Librox) {
        listaLibros.add(Librox);
    }
    public void mostrarLibro (int indice){
        Libros aux = listaLibros.get(indice);


        System.out.printf("%-8s|%-30s|%-10s|%-18s\n", "Clave", "Modelo", "Marca","Precio");
        System.out.println("--------|--------------------|" + "------------------------------|-------");
        System.out.printf("%-8s|%-30s|%-10s|%-18s\n",
                aux.getClave(), aux.getTituloLibro(),
                aux.getNombreAutor(), aux.getPrecio());
    }
    public int buscarLibroPorClaveSecuencial (int claveABuscar){ // Búsqueda secuencial
        for (int i = 0; i < listaLibros.size(); i++){
            if (listaLibros.get(i).getClave() == claveABuscar){
                return i;
            }
        }
        return -1;
    }
    public void borrarCancion (int clave){ //fin de borrar libro
        Iterator<Libros> LibroIterator = listaLibros.iterator();
        while (LibroIterator.hasNext()){
            Libros cancionx = LibroIterator.next();
            if (clave == cancionx.getClave()){
                LibroIterator.remove();
            }
        }

    }

    public void verCatalogo(){ //metodo ver catalogo
        System.out.printf("%-8s|%-30s|%-10s|%-18s\n", "Clave", "Modelo", "Marca","Precio");
        System.out.println("--------------------------------------------------------------------------------------");

        for (Libros aux : listaLibros){
            //aqui si lleva el % según el tipo
            System.out.printf("%-8s|%-30s|%-10s|%-18s\n",
                    aux.getClave(), aux.getTituloLibro(),
                    aux.getNombreAutor(), aux.getPrecio());
        }
    }
}