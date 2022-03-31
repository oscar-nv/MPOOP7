/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *Clase que muestra los datos de una Mascota
 * @author oscar nuñez
 */
public class Mascota extends SerVivo{
    private String color;
    private String raza;
    String colorOjos;

    public Mascota() {
    }
    /**
     * Metodo que muestra los datos de una Mascota
     * @param color Color de una Mascota
     * @param raza Raza de una Mascota
     * @param colorOjos Color de ojos de una Mascota
     * @param nombre Nombre de una Mascota
     * @param edad Edad de una Mascota
     */
    public Mascota(String color, String raza, String colorOjos, String nombre, 
            int edad) {
        super(nombre, edad);
        this.color = color;
        this.raza = raza;
        this.colorOjos = colorOjos;
    }
/**
 * Metodo que muestra los datos de una Mascota
 * @param dormir Muestra el metodo dormir de una Mascota
 */
      
public void dormir(String dormir){  
    System.out.println("Estoy durmiendo");   
}
/**
 * Metodo que muestra los datos de una Mascota
 * @param jugar Muestra el metodo jugar de una Mascota
 */
public void jugar(String jugar){   
    System.out.println("Estoy jugando");
}
/**
 * Metodo que muestra los datos de una Mascota
 * @param saltar Muestra el metodo saltar de una Mascota
 */
public void saltar(String saltar){ 
    System.out.println("Estoy saltando");    
}
/**
 * Metodo que muestra los datos de una Mascota
 * @return color, raza, colorDeOjos, nombre, edad y métodos de una Mascota
 */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    @Override
    public String toString() {
        return super.toString() + "Mascota{" + "color=" + color + ", raza=" + 
                raza + ", colorOjos=" + colorOjos + '}';
    }
}
