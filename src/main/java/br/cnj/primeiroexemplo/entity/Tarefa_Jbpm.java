package br.cnj.primeiroexemplo.entity;

public class Tarefa_Jbpm {
    private Integer id;
    private String descricao;


    public Tarefa_Jbpm() {
    }


    public Tarefa_Jbpm(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
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


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", descricao='" + getDescricao() + "'" +
            "}";
    }

}
