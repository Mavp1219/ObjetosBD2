/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author mvarela6
 */
public class Fraccionarios {
    private int numerador;
    private int denominador;
    
    
    public Fraccionarios(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
        if(denominador == 0){
 
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

public Fraccionarios suma(Fraccionarios f2){
    int num, den;
    Fraccionarios f;
    num = this.numerador * f2.denominador + this.denominador *f2.numerador;
    den = this.denominador * f2.denominador;
    f = new Fraccionarios(num, den);
    return f;
}
    

public Fraccionarios resta(Fraccionarios f2){
    int num, den;
    Fraccionarios f;
    num = this.numerador * f2.denominador - this.denominador *f2.numerador;
    den = this.denominador * f2.denominador;
    f = new Fraccionarios(num, den);
    return f;
}



public Fraccionarios multiplicacion(Fraccionarios f2){
    int num, den;
    Fraccionarios f;
    num = this.numerador * f2.numerador * this.denominador *f2.denominador;
    den = this.denominador * f2.denominador;
    f = new Fraccionarios(num, den);
    return f;
}


}
