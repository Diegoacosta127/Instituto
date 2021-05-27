package instituto;
/*
 * @author @diegoacosta127
 */
public class Libro {
    
    public String isbn;
    public String titulo;
    public String autor;
    public String materia;
    public int cantidadPaginas;
    
    Libro(){
        
    }
    
    Libro(String titulo, String materia){
        this.titulo=titulo;
        this.materia=materia;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    @Override
    public String toString() {
        return "El libro con ISBN " + isbn + " creado por el autor " + autor + " tiene " + cantidadPaginas + "páginas";
    }
    
    
    
}