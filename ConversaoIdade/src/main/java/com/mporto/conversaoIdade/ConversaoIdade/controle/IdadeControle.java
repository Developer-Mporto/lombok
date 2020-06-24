package com.mporto.conversaoIdade.ConversaoIdade.controle;

import com.mporto.conversaoIdade.ConversaoIdade.modelo.Calculadora;
import com.mporto.conversaoIdade.ConversaoIdade.modelo.Cotacao;
import com.mporto.conversaoIdade.ConversaoIdade.modelo.Idade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdadeControle {

    @GetMapping("/")
    public String mensagem(){
        return "Bem Vindo";
    }
    @GetMapping("/idade")
    public String getIdade(){

        Idade i = new Idade();
        i.setIdade(19);

    return  "Dias:" +i.ConverterIdadeDias() +
            "  Semanas: " + i.ConverterIdadeSemana()+
            "     Meses: " +i.ConverterIdadeMeses();
    }
    @GetMapping("/cotacao")
    public String getDinheiro(){

        Cotacao d = new Cotacao();
        d.setDinheiro((double) 10);

        return "Reais: 10" +
                "Dolar: "+d.converterDolar()+
                "Euro: " +d.converterEuro();
    }

    @GetMapping("/calculadora")
    public String getCalculadora(){

        Calculadora c = new Calculadora();
        c.setValor1((double)25);

        return " Valor : 25 ( 5 )" +
                "Resultado:   Adicão = "+c.calcularMais()+
                "Subtração = "+c.calcularMenos() +
                "Divisão = "+ c.calcularMetade()+
                "Multiplicação = " +c.calcularMultiplicar();
    }

}
