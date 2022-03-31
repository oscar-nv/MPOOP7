/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *Clase que muestra los datos de un Gato
 * @author oscar nuñez
 */
public class Gato extends Mascota{

    public Gato() {
    }
/**
 * Metodo que muestra los datos de un Gato
 * @param color Color de un Gato
 * @param raza Raza de un Gato
 * @param colorOjos ColorOjos de un Gato
 * @param nombre Nombre de un Gato
 * @param edad Edad de un Gato
 */
    public Gato(String color, String raza, String colorOjos, String nombre, 
            int edad) {
        super(color, raza, colorOjos, nombre, edad);
    }
 /**
  * Metodo que muestra los datos de un Gato
  * @param rasguñar Muestra el metodo rasguñar de un Gato
  */   
    public void rasguñar(String rasguñar){
        System.out.println("Te voy a rasguñar");
    }
 /**
  * Metodo que muestra los datos de un Gato
  * @param trepar Muestra el metodo trepar de un Gato
  */
    public void trepar(String trepar){
        System.out.println("Estoy trepando");
    }
/**
 * Metodo que muestra los datos de un Gato
 * @return color, raza, colorOjos, nombre, edad y metodos de un Gato
 */
    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" + '}';
    }    
}
