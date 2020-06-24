package com.mporto.conversaoIdade.ConversaoIdade.modelo;

import lombok.Getter;
import lombok.Setter;

public class Calculadora {
    @Getter @Setter
    public Double valor1;

    public Double calcularMais(){
        return valor1 + 5 ;
    }
    public Double calcularMenos(){
        return valor1 - 5 ;
    }
    public Double calcularMetade(){
        return valor1 / 5;
    }

    public Double calcularMultiplicar(){
        return valor1 * 5;
    }
}
