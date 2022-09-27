package Libreria;

public class Libros {
    private int clave;
    
    private double precio;
    private String Modelo;
    private String Marca;
    

    public Libros(int clave, String tituloLibro, String nombreAutor,
                  double precio) {
        this.clave = clave;
        this.Modelo = tituloLibro;
        this.Marca = nombreAutor;
        
        this.precio = precio;
    }

    public int getClave() {
        return clave;
    }
    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getTituloLibro() {
        return Modelo;
    }
    public void setNombreLibro(String nombreLibro) {
        this.Modelo = nombreLibro;
    }
    public String getNombreAutor() {
        return Marca;
    }
    public void setNombreAutor(String nombreAutor) {
        this.Marca = nombreAutor;
    }
    
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String formatoArchivo() {
        return clave + "|" + Modelo + "|" + Marca + "|" + "|" + precio;
    }

    @Override
    public String toString() {
        return "Libreria.Libros{" +
                "clave=" + clave +
                ", Nombre del libro='" + Modelo + '\'' +
                ", Autor='" + Marca + '\'' +
                
                ", Precio=" + precio +
                '}';
    }

}