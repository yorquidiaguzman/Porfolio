
import java.io.*;
import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<Tarea> tareas = new ArrayList<>();
    private final String FILE_PATH = "tareas.txt";

    public GestorTareas() {
        cargarTareas();
    }

    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(descripcion));
        guardarTareas();
    } 

    public void listarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println ((i+1) + "." + tareas.get(i));
        }
    }
    public void completarTarea (int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.get(indice).completar();
            System.out.println("✅ Tarea Completada: " + tareas.get(indice).getDescripcion());
            guardarTareas();
        }else{
            System.out.println("❌ Indice inválido.");
        }
    }

    private void guardarTareas(){
        try (PrintWriter pw = new PrintWriter (new FileWriter(FILE_PATH))){
            for (Tarea t : tareas) {
                pw.println(t.getDescripcion() + ";" + t.estaCompletada());
            }
        }catch (IOException e) {
            System.out.println ("Error al guardar las tareas: " + e.getMessage());
        }
    }

    private void cargarTareas() {
        File f = new File(FILE_PATH);
        if (!f.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linea;
            while ((linea = br.readLine()) !=null) {
                String [] partes = linea.split (";");
                Tarea t =new Tarea(partes[0]);
                if (partes.length > 1 && partes [1].equals("true")) {
                    t.completar();
                }
                tareas.add(t);
            }
        }catch (IOException e) {
            System.out.println("Error al guardar las tareas: " + e.getMessage());
        }

    }
    
}
