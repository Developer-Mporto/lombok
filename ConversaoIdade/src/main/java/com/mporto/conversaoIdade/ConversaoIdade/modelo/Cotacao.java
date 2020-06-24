package com.mporto.conversaoIdade.ConversaoIdade.modelo;

import lombok.Getter;
import lombok.Setter;

public class Cotacao {
    @Getter @Setter
    private Double dinheiro;

    public Double converterDolar(){
        return dinheiro*5.3;
    }
    public Double converterEuro(){
        return dinheiro*5.97;
    }
}
