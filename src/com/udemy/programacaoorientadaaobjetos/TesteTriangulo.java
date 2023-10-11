package com.udemy.programacaoorientadaaobjetos;

public class TesteTriangulo {
    public static void main(String[] args) {
        // Criando instâncias de Triangulo
        Triangulo triangulo1 = new Triangulo(3.0f, 4.0f, 5.0f);
        Triangulo triangulo2 = new Triangulo(2.0f, 2.0f, 2.0f);
        Triangulo trianguloInvalido = new Triangulo(1.0f, 2.0f, 3.0f);


        System.out.println("Triângulo 1:");
        System.out.println("Lado 1: " + triangulo1.getLado1());
        System.out.println("Lado 2: " + triangulo1.getLado2());
        System.out.println("Lado 3: " + triangulo1.getLado3());
        System.out.println("Perímetro: " + triangulo1.perimetro());
        System.out.println("Área: " + triangulo1.area());
        System.out.println("Válido: " + triangulo1.valido());
        System.out.println();

        System.out.println("Triângulo 2:");
        System.out.println("Lado 1: " + triangulo2.getLado1());
        System.out.println("Lado 2: " + triangulo2.getLado2());
        System.out.println("Lado 3: " + triangulo2.getLado3());
        System.out.println("Perímetro: " + triangulo2.perimetro());
        System.out.println("Área: " + triangulo2.area());
        System.out.println("Válido: " + triangulo2.valido());
        System.out.println();

        System.out.println("Triângulo Inválido:");
        System.out.println("Lado 1: " + trianguloInvalido.getLado1());
        System.out.println("Lado 2: " + trianguloInvalido.getLado2());
        System.out.println("Lado 3: " + trianguloInvalido.getLado3());
        System.out.println("Perímetro: " + trianguloInvalido.perimetro());
        System.out.println("Área: " + trianguloInvalido.area());
        System.out.println("Válido: " + trianguloInvalido.valido());
        System.out.println();

        System.out.println("Quantidade de instâncias de Triangulo: " + Triangulo.getQuantidade());
    }
}
