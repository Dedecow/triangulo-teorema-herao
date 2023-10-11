package com.udemy.programacaoorientadaaobjetos;

/**
 * <br>Document : Triangulo.java
 * <br>Created on: 11/10/2023
 * Author : André Silveira
 */

public class Triangulo {
    //===================================================================================
    //                              A T R I B U T O S
    //
    private float lado1;
    private float lado2;
    private float lado3;
    private static int quantidade = 0;
    //====================================================================================

    public Triangulo (){
        this.lado1 =3.0f;
        this.lado2=4.0f;
        this.lado3=5.0f;
        quantidade++;
    };

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        quantidade++;
    }
    /*
    protected void finalize(){
        quantidade--;
    }
    */
    //========================= GETTERS AND SETTERS========================================

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    public static int getQuantidade() {
        return quantidade;
    }
    //==================================================================================
    public float perimetro() {
        return lado1 + lado2 + lado3;
    }
    public float area(){
        if(!valido()){
            return 0;
        }
        float sp = perimetro() / 2;
        return (float) Math.sqrt(sp * ((sp - lado1) * (sp - lado2) * (sp - lado3))); //Teorema de Herão
    }
    public boolean valido(){
        return (lado1<(lado2+lado3) && lado2<(lado1+lado3) && lado3 < (lado1 + lado2));
    }
}
