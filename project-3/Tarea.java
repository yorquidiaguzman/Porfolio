public class Tarea {
    private String descripcion;
    private boolean completado;

    public Tarea (String descripcion){
        this.descripcion = descripcion;
        this.completada = false;
    }

    public void completar () {
        this.completada = true
    }

    public boolean estaCompletada() {
        return Completada;
    } 

    @Override
    public String to String () {
        return (Completada? "[X]" : "[]") + descripcion;
    }
}