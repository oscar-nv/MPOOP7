/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que muestra los datos de un Profesor
 * @author oscar nuñez
 */
public class Profesor extends Trabajador{
    int numAlumnos;

    public Profesor() {
    }
/**
 * Metodo que muestra los datos de un Profesor
 * @param numAlumnos Numero de alumnos de un Profesor
 * @param salario Salario de un Profesor
 * @param horaEntrada Hora de entrada de un Profesor
 * @param horaSalida Hora de salida de un Profesor
 * @param mascota Mascota de un Profesor
 * @param nombre Nombre de un Profesor
 * @param edad Edad de un Profesor
 */
    public Profesor(int numAlumnos, float salario, int horaEntrada, 
            int horaSalida, Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.numAlumnos = numAlumnos;
    }
 /**
  * Metodo que muestra los datos de un Profesor
  * @param aprobarAlumnos Metodo que realiza un Profesor
  */  
    public void aprobarAlumnos (String aprobarAlumnos){
        System.out.println("Aprobe a todos mis alumnos");
    }
 /**
  * Metodo que muestra los datos de un Profesor
  * @param explicar Metodo que realiza un Profesor
  */
    public void explicar (String explicar){
        System.out.println("Les estoy explicando a mis alumnos");   
    }
/**
 * Metodo que muestra los datos de un Profesor
 * @param reprobarAlumnos Metodo que realiza un Profesor
 */    
    public void reprobarAlumnos(String reprobarAlumnos){
        System.out.println("Reprobe al 15% de mis alumnos");
    }
/**
 * Metodo que muestra los datos de un Profesor
 * @return numero de alumnos, salario, hora de entrada, hora de salida, 
 * mascota nombre, edad y metodos que realiza un Profesor.
 */
    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "numAlumnos=" + numAlumnos + 
                '}';
    }
}
