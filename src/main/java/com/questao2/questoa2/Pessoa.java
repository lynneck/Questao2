package com.questao2.questoa2;

public class Pessoa {
        private String nome;
        private String idade;
        private String profissao;

        public String getNome() {
                return nome;
        }

        public String getProfissao() {
                return profissao;
        }

        public void setProfissao(String profissao) {
                this.profissao = profissao;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getIdade() {
                return idade;
        }

        public void setIdade(String idade) {
                this.idade = idade;
        }
}

