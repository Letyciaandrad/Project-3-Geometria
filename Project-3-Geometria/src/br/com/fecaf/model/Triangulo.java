package br.com.fecaf.model;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.reflect.Array.*;

public class Triangulo {
    // Atributos para calcular o Triângulo
    public double base, altura, lado2, lado3, area, perimetro;

    /* Instancia o Objeto Scanner */
    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo () {
        System.out.println("/**********************************************/");
        System.out.println("/*             Cadastro Triângulo             */");
        System.out.println("/**********************************************/");
        System.out.println(" Informe a base");
        base = scanner.nextDouble();
        System.out.println(" Informe o lado2: ");
        lado2 = scanner.nextDouble();
        System.out.println(" Informe o lado3: ");
        lado3 = scanner.nextDouble();
        System.out.println(" Informe a altura: ");
        altura = scanner.nextDouble();

        return true;
    }
// /      public void exibirTriangulo() {
//        System.out.println("/******************************/");
//        System.out.println("/*    Resultado do Triângulo  */");
//        System.out.println("/******************************/");
//        System.out.println("A Área do triângulo é igual a: " + area);
//        System.out.println("O Perímetro do triângulo é igual a: " + perimetro);
//        System.out.println("/******************************/");
//    }


    public void calcularArea() {
        System.out.println("/**********************************************/");
        System.out.println("/*                Calculando Área             */");
        System.out.println("/**********************************************/");

        area = (base * altura) / 2;
        System.out.println("/* A Área do triângulo é igual a: " + area);
    }

    public void calcularPerimetro() {
        System.out.println("/**********************************************/");
        System.out.println("/*             Calculando Perimetro           */");
        System.out.println("/**********************************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("/* O Perímetro do triângulo é igual a: " + perimetro);
    }


    public void classificando345 () {
        System.out.println("/**********************************************/");
        System.out.println("/*         Classificando Tipo - Ângulo        */");
        System.out.println("/**********************************************/");


        double[] lados = {base, lado2, lado3}; // defino a ordem dos lados
        Arrays.sort(lados); // defino que seja de forma crescente

        if (lados[0] % 3 == 0 && lados[1] % 4 == 0 && lados[2] % 5 == 0) {
            System.out.println("É um triângulo 3 4 5!!!");
        } else {

            if (Math.pow(base, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2) ||
                    Math.pow(base, 2) + Math.pow(lado3, 2) == Math.pow(lado2, 2) ||
                    Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(base, 2)) {

                System.out.println("Esse triângulo é um retângulo!!!");
            } else {
                System.out.println("NÃO é um triângulo retângulo...");
            }

        }

    }

    /* Definir tipos de triângulo */
    /* Equilatero - Escaleno - Isosceles */

    public void classificandoTipo () {
        System.out.println("/*****************************************/");
        System.out.println("/*         Definindo Tipo - Lado         */");
        System.out.println("/*****************************************/");


        if (base == lado2 && base == lado3) {
            System.out.println("Esse triângulo é um Equilátero...");
        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Esse triângulo é um Escaleno...");
        } else {
            System.out.println("Esse triângulo é um Isosceles...");
        }

    }



}