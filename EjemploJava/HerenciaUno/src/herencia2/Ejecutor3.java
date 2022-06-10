/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mateovalarezoojeda
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Que tipo de estudiante desea ingresar ??\n"
                + "Estudiante Distancia  [1]:\n"
                + "Estudiante Presencial [2]:");
        int op = sc.nextInt();
        sc.nextLine();
        if (op == 1 || op == 2) {
            System.out.println("Ingrese los nombres del estudiante:");
            String nombre = sc.nextLine();
            System.out.println("Ingrese los apellidos del estudiante:");
            String apellidos = sc.nextLine();
            System.out.println("Ingrese identificacion estudiante:");
            String id = sc.nextLine();
            System.out.println("Ingrese edad estudiante");
            int edad = sc.nextInt();
            if (op == 1) {
                EstudianteDistancia e1 = new EstudianteDistancia();
                e1.establecerNombresEstudiante(nombre);
                e1.establecerApellidoEstudiante(apellidos);
                e1.establecerIdentificacionEstudiante(id);
                e1.establecerEdadEstudiante(edad);
                System.out.println("Ingrese número de asignaturas:");
                e1.establecerNumeroAsginaturas(sc.nextInt());
                System.out.println("Ingrese costo de asignatura:");
                e1.establecerCostoAsignatura(sc.nextDouble());
                e1.calcularMatriculaDistancia();
                System.out.printf("%s", e1);
            } else if (op == 2) {
                EstudiantePresencial e1 = new EstudiantePresencial();
                e1.establecerNombresEstudiante(nombre);
                e1.establecerApellidoEstudiante(apellidos);
                e1.establecerIdentificacionEstudiante(id);
                e1.establecerEdadEstudiante(edad);
                System.out.println("Ingrese numero de creditos:");
                e1.establecerNumeroCreditos(sc.nextInt());
                System.out.println("Ingrese valor del credito");
                e1.establecerCostoCredito(sc.nextDouble());
                e1.calcularMatriculaPresencial();
                System.out.printf("%s", e1);
            }
        } else {
            System.out.println("OPCIÓN INCORRECTA");
        }
    }
}
