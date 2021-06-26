package com.questao2.questoa2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private PessoasRepository pessoasRepository = new PessoasRepository();
    @GetMapping("/")
    public List<Pessoa> pessoaList(){
        return pessoasRepository.findAll();


    }

}
