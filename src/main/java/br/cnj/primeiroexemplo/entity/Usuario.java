package br.cnj.primeiroexemplo.entity;

public class Usuario {
    private Integer id;
    private String nome;
    private Boolean bloqueio;
    private Boolean provisorio;


    public Usuario() {
    }


    public Usuario(Integer id, String nome, Boolean bloqueio, Boolean provisorio) {
        this.id = id;
        this.nome = nome;
        this.bloqueio = bloqueio;
        this.provisorio = provisorio;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean isBloqueio() {
        return this.bloqueio;
    }

    public Boolean getBloqueio() {
        return this.bloqueio;
    }

    public void setBloqueio(Boolean bloqueio) {
        this.bloqueio = bloqueio;
    }

    public Boolean isProvisorio() {
        return this.provisorio;
    }

    public Boolean getProvisorio() {
        return this.provisorio;
    }

    public void setProvisorio(Boolean provisorio) {
        this.provisorio = provisorio;
    }

    

}
