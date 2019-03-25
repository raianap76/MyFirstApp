package com.example.teste;

/**
 * Classe Pessoa baseada nos contatos do Android
 */
public class Pessoa {

    private String nomPes;
    private String tel;
    private String email;

    /**
     * Construtor da classe
     */
    public Pessoa() {
        this.nomPes = "";
        this.tel = "";
        this.email = "";
    }

    /**
     * Seta o nome
     * @param nome
     */
    public void setNome (String nome) {
        this.nomPes = nome;
    }

    /**
     * seta o telefone
     * @param tel
     */
    public void setTel (String tel) {
        this.tel = tel;
    }

    /**
     * seta o email
     * @param email
     */
    public void setEmail (String email) {
        this.email = email;
    }

    /**
     * Retorna o nome
     * @return
     */
    public String getNome () {
        return this.nomPes;
    }

    /**
     * Retorna o telefone
     * @return
     */
    public String getTel () {
        return this.tel;
    }

    /**
     * retorna o email
     * @return
     */
    public String getEmail () {
        return this.email;
    }
}