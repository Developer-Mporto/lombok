package com.mporto.algo.demo.controle;

import com.mporto.algo.demo.modelo.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioControle {

    @GetMapping("/")
    public String mensagem(){
        return "Bem vindo parça, salve:";
    }
    @GetMapping("/usuario")
    public Usuario getUsuario(){

        Usuario us = new Usuario();

        us.setNome("Jorgin da 12");
        us.setIdade(25);
        us.setEmail("jorin.penaa12@gmail.com");

        return us;
    }
}