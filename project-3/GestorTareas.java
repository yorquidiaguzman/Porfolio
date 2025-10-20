

import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<Tarea> tareas = new ArrayList<>();

    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(descripcion));
    } 

    public void listarTareas() {
        if (tareas.isEmpty ()){
            System.out.println("No hay tareas registradas.");
            return;
        }
        for (int i = 0; i<tareas.size(); i++) {
            System.out.println ((i+1) + "." + tareas.get(i));
        }
    }
    public void completarTarea (int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.get (indice).completar();
            System.out.println("✅ Tarea Completada: " + tareas.get(indice).getDescripcion());
        }else{
            System.out.println("❌ Indice inválido.");
        }
    }
    
}
