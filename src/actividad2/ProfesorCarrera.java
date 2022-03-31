/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que muestra los datos de un ProfesorCarrera
 * @author oscar nuñez
 */
public class ProfesorCarrera extends Profesor{
    String asignatura;
    int grupo;

    public ProfesorCarrera() {
    }
/**
 * Metodo que muestra los datos de un ProfesorCarrera
 * @param asignatura Asignatura de un ProfesorCarrera
 * @param grupo Grupo de un ProfesorCarrera
 * @param numAlumnos Numero de alumnos de un ProfesorCarrera
 * @param salario Salario de un ProfesorCarrera
 * @param horaEntrada Hora de entrada de un ProfesorCarrera
 * @param horaSalida Hora de salida de un ProfesorCarrera
 * @param mascota Mascota de un ProfesorCarrera
 * @param nombre Nombre de un ProfesorCarrera
 * @param edad Edad de un ProfesorCarrera
 */
    public ProfesorCarrera(String asignatura, int grupo, int numAlumnos, 
            float salario, int horaEntrada, int horaSalida, Mascota mascota, 
            String nombre, int edad) {
        super(numAlumnos, salario, horaEntrada, horaSalida, mascota, nombre, 
                edad);
        this.asignatura = asignatura;
        this.grupo = grupo;
    }
 /**
  * Metodo que muestra los datos de un ProfesorCarrera
  * @param enseñar Metodo que realiza un ProfesorCarrera
  */  
    public void enseñar(String enseñar){
        System.out.println("Estoy enseñando");
    }
/**
 * Metodo que muestra los datos de un ProfesorCarrera
 * @return asignatura, grupo, numAlumnos, salario, hora de entrada, 
 * hora de salida, mascota, nombre, edad y metoos de un ProfesorCarrera
 */
    public String getAsignatura() {
        return asignatura;
    }
/**
 * 
 * @param asignatura 
 */
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
/**
 * 
 * @return 
 */
    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return super.toString() + "ProfesorCarrera{" + "asignatura=" + 
                asignatura + ", grupo=" + grupo + '}';
    }
}
