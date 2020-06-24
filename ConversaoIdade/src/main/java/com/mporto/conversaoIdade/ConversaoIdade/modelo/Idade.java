package com.mporto.conversaoIdade.ConversaoIdade.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Idade {
    @Getter @Setter
    private int idade;

    public int ConverterIdadeDias(){
        return idade*365;
    }
    public int ConverterIdadeSemana(){
        return idade*52;
    }
    public int ConverterIdadeMeses(){
        return idade*12;
    }


}
