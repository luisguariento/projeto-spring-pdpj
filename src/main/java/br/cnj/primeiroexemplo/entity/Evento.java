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


    public Evento() {
    }


    public Evento(Integer id, String descricao, String observacao, Boolean ativo, String caminho, String movimento, String norma, String lei, String lei_artigo, boolean segredo_justiça, boolean visibilidade_externa, String glossario, Evento evento_pai, List<Evento> subeventos, Tarefa tarefa, Status status, String complemento, Boolean eletronico, Boolean papel, Boolean permiteLote, String breadcrumb, Boolean padrao_sgt, String motivo_inativacao, Integer faixa_inferior, Integer faixa_superior, Integer nivel) {
        this.id = id;
        this.descricao = descricao;
        this.observacao = observacao;
        this.ativo = ativo;
        this.caminho = caminho;
        this.movimento = movimento;
        this.norma = norma;
        this.lei = lei;
        this.lei_artigo = lei_artigo;
        this.segredo_justiça = segredo_justiça;
        this.visibilidade_externa = visibilidade_externa;
        this.glossario = glossario;
        this.evento_pai = evento_pai;
        this.subeventos = subeventos;
        this.tarefa = tarefa;
        this.status = status;
        this.complemento = complemento;
        this.eletronico = eletronico;
        this.papel = papel;
        this.permiteLote = permiteLote;
        this.breadcrumb = breadcrumb;
        this.padrao_sgt = padrao_sgt;
        this.motivo_inativacao = motivo_inativacao;
        this.faixa_inferior = faixa_inferior;
        this.faixa_superior = faixa_superior;
        this.nivel = nivel;
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

    public String getObservacao() {
        return this.observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
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

    public String getCaminho() {
        return this.caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getMovimento() {
        return this.movimento;
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
    }

    public String getNorma() {
        return this.norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public String getLei() {
        return this.lei;
    }

    public void setLei(String lei) {
        this.lei = lei;
    }

    public String getLei_artigo() {
        return this.lei_artigo;
    }

    public void setLei_artigo(String lei_artigo) {
        this.lei_artigo = lei_artigo;
    }

    public boolean isSegredo_justiça() {
        return this.segredo_justiça;
    }

    public boolean getSegredo_justiça() {
        return this.segredo_justiça;
    }

    public void setSegredo_justiça(boolean segredo_justiça) {
        this.segredo_justiça = segredo_justiça;
    }

    public boolean isVisibilidade_externa() {
        return this.visibilidade_externa;
    }

    public boolean getVisibilidade_externa() {
        return this.visibilidade_externa;
    }

    public void setVisibilidade_externa(boolean visibilidade_externa) {
        this.visibilidade_externa = visibilidade_externa;
    }

    public String getGlossario() {
        return this.glossario;
    }

    public void setGlossario(String glossario) {
        this.glossario = glossario;
    }

    public Evento getEvento_pai() {
        return this.evento_pai;
    }

    public void setEvento_pai(Evento evento_pai) {
        this.evento_pai = evento_pai;
    }

    public List<Evento> getSubeventos() {
        return this.subeventos;
    }

    public void setSubeventos(List<Evento> subeventos) {
        this.subeventos = subeventos;
    }

    public Tarefa getTarefa() {
        return this.tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Boolean isEletronico() {
        return this.eletronico;
    }

    public Boolean getEletronico() {
        return this.eletronico;
    }

    public void setEletronico(Boolean eletronico) {
        this.eletronico = eletronico;
    }

    public Boolean isPapel() {
        return this.papel;
    }

    public Boolean getPapel() {
        return this.papel;
    }

    public void setPapel(Boolean papel) {
        this.papel = papel;
    }

    public Boolean isPermiteLote() {
        return this.permiteLote;
    }

    public Boolean getPermiteLote() {
        return this.permiteLote;
    }

    public void setPermiteLote(Boolean permiteLote) {
        this.permiteLote = permiteLote;
    }

    public String getBreadcrumb() {
        return this.breadcrumb;
    }

    public void setBreadcrumb(String breadcrumb) {
        this.breadcrumb = breadcrumb;
    }

    public Boolean isPadrao_sgt() {
        return this.padrao_sgt;
    }

    public Boolean getPadrao_sgt() {
        return this.padrao_sgt;
    }

    public void setPadrao_sgt(Boolean padrao_sgt) {
        this.padrao_sgt = padrao_sgt;
    }

    public String getMotivo_inativacao() {
        return this.motivo_inativacao;
    }

    public void setMotivo_inativacao(String motivo_inativacao) {
        this.motivo_inativacao = motivo_inativacao;
    }

    public Integer getFaixa_inferior() {
        return this.faixa_inferior;
    }

    public void setFaixa_inferior(Integer faixa_inferior) {
        this.faixa_inferior = faixa_inferior;
    }

    public Integer getFaixa_superior() {
        return this.faixa_superior;
    }

    public void setFaixa_superior(Integer faixa_superior) {
        this.faixa_superior = faixa_superior;
    }

    public Integer getNivel() {
        return this.nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", descricao='" + getDescricao() + "'" +
            ", observacao='" + getObservacao() + "'" +
            ", ativo='" + isAtivo() + "'" +
            ", caminho='" + getCaminho() + "'" +
            ", movimento='" + getMovimento() + "'" +
            ", norma='" + getNorma() + "'" +
            ", lei='" + getLei() + "'" +
            ", lei_artigo='" + getLei_artigo() + "'" +
            ", segredo_justiça='" + isSegredo_justiça() + "'" +
            ", visibilidade_externa='" + isVisibilidade_externa() + "'" +
            ", glossario='" + getGlossario() + "'" +
            ", evento_pai='" + getEvento_pai() + "'" +
            ", subeventos='" + getSubeventos() + "'" +
            ", tarefa='" + getTarefa() + "'" +
            ", status='" + getStatus() + "'" +
            ", complemento='" + getComplemento() + "'" +
            ", eletronico='" + isEletronico() + "'" +
            ", papel='" + isPapel() + "'" +
            ", permiteLote='" + isPermiteLote() + "'" +
            ", breadcrumb='" + getBreadcrumb() + "'" +
            ", padrao_sgt='" + isPadrao_sgt() + "'" +
            ", motivo_inativacao='" + getMotivo_inativacao() + "'" +
            ", faixa_inferior='" + getFaixa_inferior() + "'" +
            ", faixa_superior='" + getFaixa_superior() + "'" +
            ", nivel='" + getNivel() + "'" +
            "}";
    }
    

}
