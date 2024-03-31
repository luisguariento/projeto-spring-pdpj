package br.cnj.primeiroexemplo.entity;

import java.util.List;

public class Usuario {
    private Integer id;
    private String nome;
    private Boolean bloqueio;
    private Boolean provisorio;
    private List<Processo> papelReu;
    private List<Processo> papelAutor;
    private List<Endereco> listaEnderecos;
    private List<Telefone> listaTelefones;

    public Usuario() {
    }



    public Usuario(Integer id, String nome, Boolean bloqueio, Boolean provisorio, List<Processo> papelReu, List<Processo> papelAutor, List<Endereco> listaEnderecos, List<Telefone> listaTelefones) {
        this.id = id;
        this.nome = nome;
        this.bloqueio = bloqueio;
        this.provisorio = provisorio;
        this.papelReu = papelReu;
        this.papelAutor = papelAutor;
        this.listaEnderecos = listaEnderecos;
        this.listaTelefones = listaTelefones;
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


    public List<Processo> getPapelReu() {
        return this.papelReu;
    }

    public void setPapelReu(List<Processo> papelReu) {
        this.papelReu = papelReu;
    }

    public List<Processo> getPapelAutor() {
        return this.papelAutor;
    }

    public void setPapelAutor(List<Processo> papelAutor) {
        this.papelAutor = papelAutor;
    }

    public List<Endereco> getListaEnderecos() {
        return this.listaEnderecos;
    }

    public void setListaEnderecos(List<Endereco> listaEnderecos) {
        this.listaEnderecos = listaEnderecos;
    }

    public List<Telefone> getListaTelefones() {
        return this.listaTelefones;
    }

    public void setListaTelefones(List<Telefone> listaTelefones) {
        this.listaTelefones = listaTelefones;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", bloqueio='" + isBloqueio() + "'" +
            ", provisorio='" + isProvisorio() + "'" +
            ", papelReu='" + getPapelReu() + "'" +
            ", papelAutor='" + getPapelAutor() + "'" +
            ", listaEnderecos='" + getListaEnderecos() + "'" +
            ", listaTelefones='" + getListaTelefones() + "'" +
            "}";
    }


}
