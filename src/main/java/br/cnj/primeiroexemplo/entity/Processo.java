package br.cnj.primeiroexemplo.entity;

import java.time.LocalDate;
import java.util.List;

public class Processo {
    private Integer id;
    private Integer numero;
    private Integer numeroOrigem;
    private String complemento;
    private LocalDate dtInicio;
    private LocalDate dtFim;
    private Tarefa_Jbpm jbpm;
    private Integer duracao;
    private List<Usuario> autores;
    private List<Usuario> reus;
    private Integer idTbProcessoPg;
    private Integer idSessao;
    private Integer numProcessoTemp;
    private Fluxo fluxo;


    public Processo() {
    }


    public Processo(Integer id, Integer numero, Integer numeroOrigem, String complemento, LocalDate dtInicio, LocalDate dtFim, Tarefa_Jbpm jbpm, Integer duracao, List<Usuario> autores, List<Usuario> reus, Integer idTbProcessoPg, Integer idSessao, Integer numProcessoTemp, Fluxo fluxo) {
        this.id = id;
        this.numero = numero;
        this.numeroOrigem = numeroOrigem;
        this.complemento = complemento;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.jbpm = jbpm;
        this.duracao = duracao;
        this.autores = autores;
        this.reus = reus;
        this.idTbProcessoPg = idTbProcessoPg;
        this.idSessao = idSessao;
        this.numProcessoTemp = numProcessoTemp;
        this.fluxo = fluxo;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumeroOrigem() {
        return this.numeroOrigem;
    }

    public void setNumeroOrigem(Integer numeroOrigem) {
        this.numeroOrigem = numeroOrigem;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public LocalDate getDtInicio() {
        return this.dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDate getDtFim() {
        return this.dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }

    public Tarefa_Jbpm getJbpm() {
        return this.jbpm;
    }

    public void setJbpm(Tarefa_Jbpm jbpm) {
        this.jbpm = jbpm;
    }

    public Integer getDuracao() {
        return this.duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public List<Usuario> getAutores() {
        return this.autores;
    }

    public void setAutores(List<Usuario> autores) {
        this.autores = autores;
    }

    public List<Usuario> getReus() {
        return this.reus;
    }

    public void setReus(List<Usuario> reus) {
        this.reus = reus;
    }

    public Integer getIdTbProcessoPg() {
        return this.idTbProcessoPg;
    }

    public void setIdTbProcessoPg(Integer idTbProcessoPg) {
        this.idTbProcessoPg = idTbProcessoPg;
    }

    public Integer getIdSessao() {
        return this.idSessao;
    }

    public void setIdSessao(Integer idSessao) {
        this.idSessao = idSessao;
    }

    public Integer getNumProcessoTemp() {
        return this.numProcessoTemp;
    }

    public void setNumProcessoTemp(Integer numProcessoTemp) {
        this.numProcessoTemp = numProcessoTemp;
    }

    public Fluxo getFluxo() {
        return this.fluxo;
    }

    public void setFluxo(Fluxo fluxo) {
        this.fluxo = fluxo;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", numero='" + getNumero() + "'" +
            ", numeroOrigem='" + getNumeroOrigem() + "'" +
            ", complemento='" + getComplemento() + "'" +
            ", dtInicio='" + getDtInicio() + "'" +
            ", dtFim='" + getDtFim() + "'" +
            ", jbpm='" + getJbpm() + "'" +
            ", duracao='" + getDuracao() + "'" +
            ", autores='" + getAutores() + "'" +
            ", reus='" + getReus() + "'" +
            ", idTbProcessoPg='" + getIdTbProcessoPg() + "'" +
            ", idSessao='" + getIdSessao() + "'" +
            ", numProcessoTemp='" + getNumProcessoTemp() + "'" +
            ", fluxo='" + getFluxo() + "'" +
            "}";
    }


}