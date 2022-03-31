/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop7;

import actividad1.Empleado;
import actividad1.Gerente;
import actividad2.Alumno;
import actividad2.Gato;
import actividad2.Mesero;
import actividad2.Perro;
import actividad2.ProfesorAsignatura;
import actividad2.ProfesorCarrera;
/**
 *
 * @author oscar nuñez
 */
public class MPOOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado();
        empleado.setNombre("Joaquin");
        empleado.setNumEmpleado(998877);
        empleado.setSueldo(10_000);
        System.out.println(empleado);
        System.out.println(empleado.toString());
        empleado.aumentarSueldo(30);
        System.out.println(empleado);
        
        
        Gerente gerente = new Gerente();
        gerente.setNombre("Paulina");
        gerente.setNumEmpleado(887766);
        gerente.setSueldo(30_000);
        gerente.setPresupuesto(100_000);
        System.out.println(gerente);
        gerente.aumentarSueldo(50);
        System.out.println(gerente);
        
        Gerente gerente2 = new Gerente(1_000_000, "Saul", 113365, 50_000);
        System.out.println(gerente2); 
        
        System.out.println("\n###################");
        Perro perro = new Perro();
        perro.setNombre("Scooby");
        perro.setColor("Café claro");
        perro.setEdad(10);
        perro.setRaza("Mestizo");
        perro.setColorOjos("Verdes");
        perro.setColaCortada(true);
        System.out.println(perro);
        perro.dormir("Estoy domido ZZZZzzzzzzZZZZzzz");
        perro.correr("Mirame estoy corriendo");
        perro.jugar("Hora de jugar");
        perro.saltar("Me gusta saltar");
        perro.corretear("Estoy correteando un gato");
        perro.respirar("Estoy respirando");
        
        
        System.out.println("\n###################");
        Gato gato = new Gato();
        gato.setNombre("Rufino");
        gato.setColor("Naranja");
        gato.setEdad(2);
        gato.setColorOjos("Azul y verde");
        gato.setRaza("Siamés");
        System.out.println(gato);
        gato.dormir("Zzzzzz ZzzzZZZZ ZZZZzzz");
        gato.saltar("Mira lo alto que estoy saltando");
        gato.jugar("Estoy jugando");
        gato.trepar("Estoy trepando");
        gato.respirar("EStoy respirando");
        gato.rasguñar("Te voy a rasguñar");
        
        System.out.println("\n###################");
        Alumno alumno = new Alumno();
        alumno.setNombre("Sofía");
        alumno.setEdad(20);
        alumno.setMascota(perro);
        alumno.setCarrera("Ing. Eléctrica Eléctronica");
        alumno.setSemestre(6);
        System.out.println(alumno);
        alumno.respirar("Estoy respirando aire fresco");
        alumno.aprender("Estoy aprendiendo MPOO");
        alumno.estudiar("Estoy estudiando para la práctica");
        alumno.darseDeBaja("Me voy a dar de baja");
        
        System.out.println("\n###################");
        Mesero mesero = new Mesero();
        mesero.setNombre("Nicolás");
        mesero.setEdad(25);
        mesero.setMascota(gato);
        mesero.setSalario(15_000);
        mesero.setHoraEntrada(17);
        mesero.setHoraSalida(1);
        mesero.setRestaurante("La churrería");
        mesero.setNumMesas(5);
        mesero.setColorDelUniforme("Negro");
        System.out.println(mesero);
        mesero.respirar("Estoy respirando");
        mesero.aclararDudas("¿Cuál es su dudada?");
        mesero.recibirPeddido("Digame su pedido");
        mesero.darPedido("Le entrego su pedido");
        mesero.recibirPropina("Recibí el 10% de propina");
        mesero.tomarUnDescanso("Es hora de mi descanso");
        
        System.out.println("\n###################");
        ProfesorAsignatura profesorA = new ProfesorAsignatura();
        profesorA.setNombre("Daniel");
        profesorA.setEdad(38);
        profesorA.setMascota(gato);
        profesorA.setSalario(9_000);
        profesorA.setHoraEntrada(15);
        profesorA.setHoraSalida(17);
        profesorA.setNumAlumnos(30);
        profesorA.setNombreAsignatura("Cálculo Vectorial");
        System.out.println(profesorA);
        profesorA.respirar("Estoy respirando");
        profesorA.aclararDudas("¿Cuál es su duda?");
        profesorA.aprobarAlumnos("Aprobé a todos mis alumnos");
        profesorA.explicar("¿Cuál es su duda sobre este tema?");
        profesorA.reprobarAlumnos("Reprobe al 15% de mis alumnos");
        profesorA.darClase("Estoy dando clase");
        profesorA.calificar("Estoy calificando");
        
        System.out.println("\n###################");
        ProfesorCarrera profesorB = new ProfesorCarrera();
        profesorB.setNombre("Rodrigo");
        profesorB.setEdad(53);
        profesorB.setMascota(gato);
        profesorB.setSalario(19_000);
        profesorB.setHoraEntrada(7);
        profesorB.setHoraSalida(15);
        profesorB.setNumAlumnos(60);
        profesorB.setAsignatura("Cálculo Integral, Mecánica, Álgebra Lineal");
        profesorB.setGrupo(1);
        System.out.println(profesorB);
        profesorB.respirar("Estoy respirando");
        profesorB.aclararDudas("¿Cuál es su duda?");
        profesorB.aprobarAlumnos("Aprobé a todos mis alumnos");
        profesorB.explicar("¿Cuál es su duda sobre este tema?");
        profesorB.reprobarAlumnos("Reprobe al 25% de mis alumnos");
        profesorB.enseñar("Estoy enseñando");
    }
}
