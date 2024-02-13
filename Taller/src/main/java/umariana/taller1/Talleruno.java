

package umariana.taller1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

import mundo.Tarea;

/**
 *
 * @author Andres Muñoz
 */
public class Talleruno {

   

    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        ArrayList<Tarea> misTareas = new ArrayList<>();

        boolean activo = true;
        do{
            
            System.out.println("menu de opciones");
            System.out.println("1: Agregar tarea");
            System.out.println("2:Mostrar tares");
            System.out.println("3: Ordenar tareas");
            System.out.println("4:Terminar programa");
          
            
            int opcion = lector.nextInt();
            switch(opcion){
                //case 1 agregrar tareas 
                case 1:
                    System.out.println("id de la tarea");
                    int id= lector.nextInt();
                    lector.nextLine();
                    
                    System.out.println("descripcion de la tarea");
                    String descripcion = lector.nextLine();
                    
                    System.out.println("la prioridad de 1 a5");
                    int prioridad = lector.nextInt();
                    
                   //Creacion del objeto  
                   Tarea nuevaTarea = new Tarea(id,descripcion,prioridad); 
                   //objeto para almacenar
                   misTareas.add(nuevaTarea);
                   System.out.println("Tarea agregada ");
                   
                    break;
                    // case 2 para ver tareas registradas
                case 2:
                    
                    System.out.println("TAREAS REGISTRADAS");
                  
                    for (Tarea t: misTareas) {
                        System.out.println("id: " + "" + t.getIdTarea() );
                        System.out.println("descripcion: " + "" + t.getDescripcion());
                        System.out.println("prioridad: " + "" + t.getPrioridad());
                    }
                    break;
                    
                    // case 3 ordernar de manera descendente 
                case 3:
                    // ordenar las tareas por prioridad de forma descendente
                      Collections.sort(misTareas, (tarea1, tarea2) -> tarea2.getPrioridad() + tarea1.getPrioridad());
                    // mostrar las tareas ordenadas por prioridad de forma descendente
                     System.out.println("las tareas ordenadas descendete es:");
                     for (Tarea tarea : misTareas) {
                      System.out.println("id: " + tarea.getIdTarea()+"descripcion: " + tarea.getDescripcion()+"prioridad: " + tarea.getPrioridad());
                     }
             break;

                case 4:
                    
                    activo = false; 
                    System.out.println("cerrando programa");
                    break;
                default:
                    System.out.println("la opcion no se encuentra en el menu");
                    
            }
            
        }while(activo);
    }

    
}
