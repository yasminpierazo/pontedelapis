package net.codejava.models;

public class InfoEscola {
    private String nomeEscola;
    private String logradouroEscola;
    private String cepEscola;
    private String numEscola;
    private String cidadeEscola;
    private String estadoEscola;
    private String bairro;

    public String getNomeEscola() {
        return this.nomeEscola;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstadoEscola() {
        return estadoEscola;
    }

    public void setEstadoEscola(String estadoEscola) {
        this.estadoEscola = estadoEscola;
    }

    public String getCidadeEscola() {
        return cidadeEscola;
    }

    public void setCidadeEscola(String cidadeEscola) {
        this.cidadeEscola = cidadeEscola;
    }

    public String getCepEscola() {
        return cepEscola;
    }

    public void setCepEscola(String cepEscola) {
        this.cepEscola = cepEscola;
    }

    public String getLogradouroEscola() {
        return logradouroEscola;
    }

    public void setLogradouroEscola(String logradouroEscola) {
        this.logradouroEscola = logradouroEscola;
    }

    public String getNumEscola() {
        return numEscola;
    }

    public void setNumEscola(String numEscola) {
        this.numEscola = numEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

}
