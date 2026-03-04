/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ieselrincon;
import java.util.ArrayList;
public class GestorTareas {
      private ArrayList<Tarea> tareas = new ArrayList<>();

    public void añadirTarea(String descripcion) {
        tareas.add(new Tarea(descripcion));
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }}
