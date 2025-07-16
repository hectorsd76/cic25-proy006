package es.cic.curso25.proy005.model;

public class MateriaAprendizaje {
    private long id;
    private String nombre;
    private boolean finalizado;


    
    public MateriaAprendizaje(long id, String nombre, boolean finalizado) {
        this.id = id;
        this.nombre = nombre;
        this.finalizado = finalizado;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isFinalizado() {
        return finalizado;
    }
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

}
