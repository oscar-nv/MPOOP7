/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que muestra los datos de un Empleado 
 * @author oscar nuñez
 */
public class Empleado {
   private String nombre;
    private int numEmpleado, sueldo;
/**
 * Metodo que muestra los datos de un Empleado
 * @param nombre Nombre de un Empleado
 * @param numEmpleado numeroEmpleado de un Empleado
 * @param sueldo Sueldo de un Empleado
 */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    public Empleado() {
    }
    
/**
 * Metodo que muestra los datos de un Empleado
 * @return nombre, numEmpleado, sueldo de un Empleado
 */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    public void aumentarSueldo(int porcentaje){
        sueldo += (int) (sueldo * porcentaje / 100);
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + 
                numEmpleado + ", sueldo=" + sueldo + '}';
    }
}
