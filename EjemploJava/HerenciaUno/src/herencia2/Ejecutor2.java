/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author mateovalarezoojeda
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        EstudianteDistancia e1 = new EstudianteDistancia();
        System.out.println("Ingrese los nombres del estudiante:");
        e1.establecerNombresEstudiante(sc.nextLine());
        System.out.println("Ingrese los apellidos del estudiante:");
        e1.establecerApellidoEstudiante(sc.nextLine());
        System.out.println("Ingrese identificacion estudiante:");
        e1.establecerIdentificacionEstudiante(sc.nextLine());
        System.out.println("Ingrese edad estudiante");
        e1.establecerEdadEstudiante(sc.nextInt());
        System.out.println("Ingrese número de asignaturas:");
        e1.establecerNumeroAsginaturas(sc.nextInt());
        System.out.println("Ingrese costo de asignatura:");
        e1.establecerCostoAsignatura(sc.nextDouble());
        e1.calcularMatriculaDistancia();
        System.out.printf("%s",e1);
    }
}
