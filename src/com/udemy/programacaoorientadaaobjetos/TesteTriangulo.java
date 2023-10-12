package com.udemy.programacaoorientadaaobjetos;

import java.util.Scanner;

public class TesteTriangulo {
    public static void main(String[] args) {

        Triangulo[] triangulos = new Triangulo[3];
        Scanner scn = new Scanner(System.in);
        int i = 0;

        do {
            System.out.println(" Digite o valor do primeiro lado");
            float lado1 = Float.parseFloat(scn.nextLine());
            System.out.println(" Digite o valor do segundo lado");
            float lado2 = Float.parseFloat(scn.nextLine());
            System.out.println(" Digite o valor do terceiro lado");
            float lado3 = Float.parseFloat(scn.nextLine());
            triangulos[i] = new Triangulo(lado1, lado2, lado3);
            i++;
        } while (i < 3);
        i=0;
        do {
            if(triangulos[i] != null) {
                System.out.println("Triângulo " + i + ":");
                System.out.println("Lado 1: " + triangulos[i].getLado1());
                System.out.println("Lado 2: " + triangulos[i].getLado2());
                System.out.println("Lado 3: " + triangulos[i].getLado3());
                System.out.println("Perímetro: " + triangulos[i].perimetro());
                System.out.println("Área: " + triangulos[i].area());
                System.out.println("Válido: " + triangulos[i].valido());
                System.out.println();
                i++;
            }
        }while (i<triangulos.length);

        System.out.println("Quantidade de instâncias de Triangulo: " + Triangulo.getQuantidade());
    }
}
