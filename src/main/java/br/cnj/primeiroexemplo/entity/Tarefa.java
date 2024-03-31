package br.cnj.primeiroexemplo.entity;

import java.util.List;

public class Tarefa {
    private Integer id;
    private String descricao;
    private List<Tarefa_Jbpm> listaTarefasJbpm;
    private List<Evento> eventosRelacinados;
    private Fluxo fluxo;
    private List<Processo> listaProcessos;


    public Tarefa() {
    }


    public Tarefa(Integer id, String descricao, List<Tarefa_Jbpm> listaTarefasJbpm, List<Evento> eventosRelacinados, Fluxo fluxo, List<Processo> listaProcessos) {
        this.id = id;
        this.descricao = descricao;
        this.listaTarefasJbpm = listaTarefasJbpm;
        this.eventosRelacinados = eventosRelacinados;
        this.fluxo = fluxo;
        this.listaProcessos = listaProcessos;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Tarefa_Jbpm> getListaTarefasJbpm() {
        return this.listaTarefasJbpm;
    }

    public void setListaTarefasJbpm(List<Tarefa_Jbpm> listaTarefasJbpm) {
        this.listaTarefasJbpm = listaTarefasJbpm;
    }

    public List<Evento> getEventosRelacinados() {
        return this.eventosRelacinados;
    }

    public void setEventosRelacinados(List<Evento> eventosRelacinados) {
        this.eventosRelacinados = eventosRelacinados;
    }

    public Fluxo getFluxo() {
        return this.fluxo;
    }

    public void setFluxo(Fluxo fluxo) {
        this.fluxo = fluxo;
    }

    public List<Processo> getListaProcessos() {
        return this.listaProcessos;
    }

    public void setListaProcessos(List<Processo> listaProcessos) {
        this.listaProcessos = listaProcessos;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", descricao='" + getDescricao() + "'" +
            ", listaTarefasJbpm='" + getListaTarefasJbpm() + "'" +
            ", eventosRelacinados='" + getEventosRelacinados() + "'" +
            ", fluxo='" + getFluxo() + "'" +
            ", listaProcessos='" + getListaProcessos() + "'" +
            "}";
    }

}
