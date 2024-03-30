package br.cnj.primeiroexemplo.entity;

import java.util.List;

public class Tarefa {
    private Integer id;
    private String descricao;
    private List<Tarefa_Jbpm> listaTarefasJbpm;
    private List<Evento> eventosRelacinados;
    private Fluxo fluxo;
    private List<Processo> listaProcessos;
}
