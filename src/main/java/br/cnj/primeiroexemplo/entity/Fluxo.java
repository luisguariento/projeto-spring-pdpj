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
}
