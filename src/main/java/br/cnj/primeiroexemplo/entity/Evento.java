package br.cnj.primeiroexemplo.entity;

import java.util.List;

public class Evento {
    private Integer id;
    private String descricao;
    private String observacao;
    private Boolean ativo;
    private String caminho;
    private String movimento;
    private String norma;
    private String lei;
    private String lei_artigo;
    private boolean segredo_justiça;
    private boolean visibilidade_externa;
    private String glossario;
    private Evento evento_pai;
    private List<Evento> subeventos;
    private Tarefa tarefa;
    private Status status;
    private String complemento;
    private Boolean eletronico;
    private Boolean papel;
    private Boolean permiteLote;
    private String breadcrumb;
    private Boolean padrao_sgt;
    private String motivo_inativacao;
    private Integer faixa_inferior;
    private Integer faixa_superior;
    private Integer nivel;
}
