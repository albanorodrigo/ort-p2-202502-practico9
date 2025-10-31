package ejercicio8;
public class Pelicula {
    private String titulo;
    private int duracion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String unTitulo) {
        titulo = unTitulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int unaDuracion) {
        duracion = unaDuracion;
    }
    
    public Pelicula(String unTitulo, int unaDuracion){
        this.setTitulo(unTitulo);
        this.setDuracion(unaDuracion);
    }
    
    @Override
    public String toString(){
        return "Titulo: "+this.getTitulo()+", duración: "+this.getDuracion()+" minutos";
    }
}
