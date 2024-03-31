package br.cnj.primeiroexemplo.entity;

public class Telefone {
    private Integer codigoPais;
    private Integer codigoEstado;
    private Integer numero;


    public Telefone() {
    }


    public Telefone(Integer codigoPais, Integer codigoEstado, Integer numero) {
        this.codigoPais = codigoPais;
        this.codigoEstado = codigoEstado;
        this.numero = numero;
    }


    public Integer getCodigoPais() {
        return this.codigoPais;
    }

    public void setCodigoPais(Integer codigoPais) {
        this.codigoPais = codigoPais;
    }

    public Integer getCodigoEstado() {
        return this.codigoEstado;
    }

    public void setCodigoEstado(Integer codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "{" +
            " codigoPais='" + getCodigoPais() + "'" +
            ", codigoEstado='" + getCodigoEstado() + "'" +
            ", numero='" + getNumero() + "'" +
            "}";
    }



}
