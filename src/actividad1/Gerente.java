/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que muestra los datos de un Gerente
 * @author oscar nuñez
 */
public class Gerente extends Empleado{
    private int presupuesto;
    
    public Gerente() {
        
    }
/**
 * Metodo que muestra los datos de un Gerente
 * @param presupuesto Presumpuesto de un Gerente
 * @param nombre Nombre de un Gerente
 * @param numEmpleado Número de empleado de un Gerente
 * @param sueldo Sueldo de un Gerente
 */
    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo){
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
  /**
   * Metodo que muestra los datos de un Gerente
   * @param presupuesto Metodo que realiza un Gerente
   */  
    public void asignarPresupuesto(int presupuesto){
        this.presupuesto = presupuesto;
        
    }
/**
 * Metodo que muestra los datos de un Gerente
 * @return presupuesto, nombre, numEmpleado, sueldo y metoo de un Gerente
 */
    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
    }

   
}
