package br.cnj.primeiroexemplo.entity;

import java.util.List;

public class Status {
    private Integer id;
    private String descStatus;
    private boolean ativo;
    List<Processo> listaProcessos;
    List<Evento> eventosRelacionados;

    public Status() {
    }


    public Status(Integer id, String descStatus, boolean ativo, List<Processo> listaProcessos, List<Evento> eventosRelacionados) {
        this.id = id;
        this.descStatus = descStatus;
        this.ativo = ativo;
        this.listaProcessos = listaProcessos;
        this.eventosRelacionados = eventosRelacionados;
    }

    


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescStatus() {
        return this.descStatus;
    }

    public void setDescStatus(String descStatus) {
        this.descStatus = descStatus;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public boolean getAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Processo> getListaProcessos() {
        return this.listaProcessos;
    }

    public void setListaProcessos(List<Processo> listaProcessos) {
        this.listaProcessos = listaProcessos;
    }


    public List<Evento> getEventosRelacionados() {
        return this.eventosRelacionados;
    }

    public void setEventosRelacionados(List<Evento> eventosRelacionados) {
        this.eventosRelacionados = eventosRelacionados;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", descStatus='" + getDescStatus() + "'" +
            ", ativo='" + isAtivo() + "'" +
            ", listaProcessos='" + getListaProcessos() + "'" +
            ", eventosRelacionados='" + getEventosRelacionados() + "'" +
            "}";
    }


}
