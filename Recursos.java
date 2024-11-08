package com.mycompany.recursos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recursos {
    
    public String obtenerMensaje() {
        return "Programacion Orientada a Objetos 2021";
    }
  
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }
    
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    public List<Integer> obtenerNumerosHastaX(int x) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            numeros.add(i);
        }
        return numeros;
    }

    public static void main(String[] args) {
      
        Recursos recursos = new Recursos();
        try (Scanner scanner = new Scanner(System.in)) {
            String mensaje = recursos.obtenerMensaje();
            System.out.println(mensaje);
            
            System.out.print("Ingrese la edad del estudiante: ");
            int edadEstudiante = scanner.nextInt();
            String resultadoEdad = recursos.verificarEdad(edadEstudiante);
            System.out.println("Edad: " + edadEstudiante + " - " + resultadoEdad);
            
            System.out.print("Ingrese dos numeros para multiplicar y separelos con un espacio: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int resultadoMultiplicacion = recursos.multiplicar(a, b);
            System.out.println("Resultado de la multiplicacion: " + resultadoMultiplicacion);
            
            System.out.print("Ingrese un numero hasta el cual generar la lista: ");
            int x = scanner.nextInt();
            List<Integer> numeros = recursos.obtenerNumerosHastaX(x);
            System.out.println("Numeros del 1 al " + x + ": " + numeros);
        }
    }
}
