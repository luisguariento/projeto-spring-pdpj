package br.cnj.primeiroexemplo.entity;

import java.time.LocalDate;

public class Processo {
    private Integer id;
    private Integer numero;
    private Integer numeroOrigem;
    private String complemento;
    private LocalDate dtInicio;
    private LocalDate dtFim;
    private Integer ibpm;
    private Integer duracao;
    private Integer actiorId;
    private Usuario usuarioCadastro;
    private Integer idTbProcessoPg;
    private Integer idSessao;
    private Integer numProcessoTemp;
    private Fluxo fluxo;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}