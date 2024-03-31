package br.cnj.primeiroexemplo.entity;

import java.time.LocalDate;
import java.util.List;

public class Fluxo {
    private Integer id;
    private String descFluxo;
    private Boolean ativo;
    private Integer quantPrazo;
    private Boolean publicacao;
    private LocalDate dtInicioPublicacao;
    private LocalDate dtFimPublicacao;
    private String descXml;
    private LocalDate dtUltimaPublicacao;
    private List<Processo> listaProcessos;
    private List<Tarefa> listaTarefas;


    public Fluxo() {
    }


    public Fluxo(Integer id, String descFluxo, Boolean ativo, Integer quantPrazo, Boolean publicacao, LocalDate dtInicioPublicacao, LocalDate dtFimPublicacao, String descXml, LocalDate dtUltimaPublicacao, List<Processo> listaProcessos, List<Tarefa> listaTarefas) {
        this.id = id;
        this.descFluxo = descFluxo;
        this.ativo = ativo;
        this.quantPrazo = quantPrazo;
        this.publicacao = publicacao;
        this.dtInicioPublicacao = dtInicioPublicacao;
        this.dtFimPublicacao = dtFimPublicacao;
        this.descXml = descXml;
        this.dtUltimaPublicacao = dtUltimaPublicacao;
        this.listaProcessos = listaProcessos;
        this.listaTarefas = listaTarefas;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescFluxo() {
        return this.descFluxo;
    }

    public void setDescFluxo(String descFluxo) {
        this.descFluxo = descFluxo;
    }

    public Boolean isAtivo() {
        return this.ativo;
    }

    public Boolean getAtivo() {
        return this.ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Integer getQuantPrazo() {
        return this.quantPrazo;
    }

    public void setQuantPrazo(Integer quantPrazo) {
        this.quantPrazo = quantPrazo;
    }

    public Boolean isPublicacao() {
        return this.publicacao;
    }

    public Boolean getPublicacao() {
        return this.publicacao;
    }

    public void setPublicacao(Boolean publicacao) {
        this.publicacao = publicacao;
    }

    public LocalDate getDtInicioPublicacao() {
        return this.dtInicioPublicacao;
    }

    public void setDtInicioPublicacao(LocalDate dtInicioPublicacao) {
        this.dtInicioPublicacao = dtInicioPublicacao;
    }

    public LocalDate getDtFimPublicacao() {
        return this.dtFimPublicacao;
    }

    public void setDtFimPublicacao(LocalDate dtFimPublicacao) {
        this.dtFimPublicacao = dtFimPublicacao;
    }

    public String getDescXml() {
        return this.descXml;
    }

    public void setDescXml(String descXml) {
        this.descXml = descXml;
    }

    public LocalDate getDtUltimaPublicacao() {
        return this.dtUltimaPublicacao;
    }

    public void setDtUltimaPublicacao(LocalDate dtUltimaPublicacao) {
        this.dtUltimaPublicacao = dtUltimaPublicacao;
    }

    public List<Processo> getListaProcessos() {
        return this.listaProcessos;
    }

    public void setListaProcessos(List<Processo> listaProcessos) {
        this.listaProcessos = listaProcessos;
    }

    public List<Tarefa> getListaTarefas() {
        return this.listaTarefas;
    }

    public void setListaTarefas(List<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", descFluxo='" + getDescFluxo() + "'" +
            ", ativo='" + isAtivo() + "'" +
            ", quantPrazo='" + getQuantPrazo() + "'" +
            ", publicacao='" + isPublicacao() + "'" +
            ", dtInicioPublicacao='" + getDtInicioPublicacao() + "'" +
            ", dtFimPublicacao='" + getDtFimPublicacao() + "'" +
            ", descXml='" + getDescXml() + "'" +
            ", dtUltimaPublicacao='" + getDtUltimaPublicacao() + "'" +
            ", listaProcessos='" + getListaProcessos() + "'" +
            ", listaTarefas='" + getListaTarefas() + "'" +
            "}";
    }



}
