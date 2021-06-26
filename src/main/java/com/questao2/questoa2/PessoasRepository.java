package com.questao2.questoa2;

import java.util.ArrayList;
import java.util.List;

public class PessoasRepository {
    private List<Pessoa> pessoas;
    public PessoasRepository(){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Paulo");
        pessoa1.setIdade("19");
        pessoa1.setProfissao("Pedreiro");

        pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
    }

    public List<Pessoa>findAll(){
        return pessoas;
    }
}
