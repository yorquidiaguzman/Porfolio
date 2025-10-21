public class Tarea {
    private String descripcion;
    private boolean completado;

    public Tarea (String descripcion){
        this.descripcion = descripcion;
        this.completada = false;
    }

    public void completar () {
        this.completada = true;
    }

    public boolean estaCompletada() {
        return completada;
    } 

    @Override
    public String toString () {
        return (Completada ? "[X]" : " [ ] ") + descripcion;
    }
}