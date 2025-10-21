import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        GestorTareas gestor = new GestorTareas();
        Scanner sc = new Scanner (System.in);
        int opcion;

        do {
            System.out.println("\n==== GESTOR DE TAREAS =====");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Completar tarea");
            System.out.println("0. Salir");
            System.out.println("Elige una opción: ");
            opcion = sc.nextInt ();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print ("Descripción: ");
                    String desc = sc.nextLine();
                    gestor.agregarTarea(desc);
                    break;
                case 2:
                     gestor.listarTareas();
                     break;
                case 3:
                    gestor.listarTareas();
                    System.out.print ("Número de tarea a completar: ");
                    int num = sc.nextInt();
                    gestor.completarTarea(num-1);
                    break;
                case 0:
                    System.out.println("Adiós...");
                    break;
                default:
                    System.out.println("opción no válida.");        
  
            }
        }while (opcion !=0);

        sc.close();
    }  
}
