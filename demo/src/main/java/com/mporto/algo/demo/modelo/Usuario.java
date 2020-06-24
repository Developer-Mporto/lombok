package com.mporto.algo.demo.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Usuario {
    @Getter @Setter
    private String nome;
    @Getter @Setter
    private int idade;
    @Getter @Setter
    private String email;
}