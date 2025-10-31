package ejercicio8;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Pelicula> listaPeliculas;

    public Sistema(){
        listaPeliculas = new ArrayList<>();
    }
    
    public void agregarPelicula(Pelicula unaPelicula){
        listaPeliculas.add(unaPelicula);
    }
    
    public ArrayList<Pelicula> getListaPeliculas(){
        return listaPeliculas;
    }
}
