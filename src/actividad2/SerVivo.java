/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *Clase que muestra los datos de un SerVivo
 * @author oscar nuñez
 */
public class SerVivo {
   String nombre;
    private int edad;

    public SerVivo() {
        
    }
 
/**
 * Metodo que muestra los datos de un SerVivo
 * @param nombre Nombre del SerVivo
 * @param edad  Edad del SerVivo
 */
    public SerVivo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
/**
 * Metodo que muestra los datos de un SerVivo
 * @return nombre y edad de un SerVivo
 */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void respirar(String respirar){
        System.out.println("Estoy respirando");
    }
        
        
    @Override
    public String toString() {
        return "SerVivo{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
     
}
