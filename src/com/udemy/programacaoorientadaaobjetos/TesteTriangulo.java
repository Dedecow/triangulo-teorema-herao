package com.udemy.programacaoorientadaaobjetos;

import java.util.Scanner;

public class TesteTriangulo {
    public static void main(String[] args) {

        Triangulo[] triangulos = new Triangulo[3];
        Scanner scn = new Scanner(System.in);

        triangulos[0] = new Triangulo(3.0f, 4.0f, 5.0f);
        triangulos[1] = new Triangulo(2.0f, 2.0f, 2.0f);
        triangulos[2] = new Triangulo(1.0f, 2.0f, 3.0f);


        for(int i = 0; i<triangulos.length; i++) {
            if(triangulos[i] != null) {
                System.out.println("Triângulo " + i + ":");
                System.out.println("Lado 1: " + triangulos[i].getLado1());
                System.out.println("Lado 2: " + triangulos[i].getLado2());
                System.out.println("Lado 3: " + triangulos[i].getLado3());
                System.out.println("Perímetro: " + triangulos[i].perimetro());
                System.out.println("Área: " + triangulos[i].area());
                System.out.println("Válido: " + triangulos[i].valido());
                System.out.println();
            }
        }
        System.out.println("Quantidade de instâncias de Triangulo: " + Triangulo.getQuantidade());
    }
}
