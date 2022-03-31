/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que muestra los datos de un Mesero
 * @author oscar nuñez
 */
public class Mesero extends Trabajador{
    String restaurante;
    int numMesas;
    String colorDelUniforme;

    public Mesero() {
    }
/**
 * Metodo que muestra los datos de un Mesero
 * @param restaurante Restaurante en que trabaja un Mesero
 * @param numMesas Numero de mesas que atiende un Mesero
 * @param colorDelUniforme ColorDelUniforme de un Mesero
 * @param salario Salario de un Mesero
 * @param horaEntrada Hora de entrada de un Mesero
 * @param horaSalida Hora de salida de un Mesero
 * @param mascota Mascota de un Mesero
 * @param nombre Nombre de un Mesero
 * @param edad Edad de un Mesero
 */
    public Mesero(String restaurante, int numMesas, String colorDelUniforme, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.restaurante = restaurante;
        this.numMesas = numMesas;
        this.colorDelUniforme = colorDelUniforme;
    }
 /**
  * Metodo que muestra los datos de un Mesero
  * @param recibirPedido Metodo que realiza un Mesero
  */   
    public void recibirPeddido(String recibirPedido){
        System.out.println("¿Cuál es su pedido?");
    }
 /**
  * Metodo que muestra los datos de un Mesero
  * @param darPedido Metodo que realiza un Mesero
  */   
    public void darPedido(String darPedido){
        System.out.println("Aquí le entrego su pedido");
    }
 /**
  * Metodo que muestra los datos de un Mesero
  * @param recibirPropina Metodo que realiza un Mesero
  */   
    public void recibirPropina(String recibirPropina){
        System.out.println("Me dejaron 10% de propina");   
    }
 /**
  * Metodo que muestra los datos de un Mesero
  * @param tomarUnDescanso Metodo que realiza un Mesero
  */  
    public void tomarUnDescanso(String tomarUnDescanso){
        System.out.println("Es hora de mi descanso");
    }
/**
 * Metodo que muestra los datos de un Mesero
 * @return resturant, numero de mesas, colorDelUniforme, salario, 
 * hora de entrada, hora de salida, mascota, nombre, edad y metodos de un Mesero 
 */
    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    public String getColorDelUniforme() {
        return colorDelUniforme;
    }

    public void setColorDelUniforme(String colorDelUniforme) {
        this.colorDelUniforme = colorDelUniforme;
    }


    @Override
    public String toString() {
        return super.toString() + "Mesero{" + "restaurante=" + restaurante + 
                ", numMesas=" + numMesas + ", colorDelUniforme=" + 
                colorDelUniforme + '}';
    }
}

  
    

