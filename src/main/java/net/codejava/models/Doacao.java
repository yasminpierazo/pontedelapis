package net.codejava.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.vladmihalcea.hibernate.type.json.JsonStringType;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;



@TypeDefs({ @TypeDef(name = "json", typeClass = JsonStringType.class) })
@Entity
public class Doacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDoacao;

    public Integer getIdDoacao() {
        return this.idDoacao;
    }

    public void setIdDoacao(Integer idDoacao) {
        this.idDoacao = idDoacao;
    }

    private Integer idLista;

    @Column(nullable = false, unique = true)
    private String emailDoador;

    public String getEmailDoador() {
        return this.emailDoador;
    }

    public void setEmailDoador(String emailDoador) {
        this.emailDoador = emailDoador;
    }

    @Column(nullable = false)
    @ColumnDefault("false")
    private boolean finalizada;

    public boolean isFinalizada() {
        return this.finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    @Type(type = "json")
    @Column(columnDefinition = "json", nullable = false)
    private InfoAluno infoAluno;

    public InfoAluno getInfoAluno() {
        return this.infoAluno;
    }

    public void setInfoAluno(InfoAluno infoAluno) {
        this.infoAluno = infoAluno;
    }

    @Type(type = "json")
    @Column(columnDefinition = "json", nullable = false)
    private InfoEscola infoEscola;

    public InfoEscola getInfoEscola() {
        return this.infoEscola;
    }

    public void setInfoEscola(InfoEscola infoEscola) {
        this.infoEscola = infoEscola;
    }

    @Type(type = "json")
    @Column(columnDefinition = "json", nullable = false)
    private List<String> itensDoacao;

    public List<String> getItensDoacao() {
        return this.itensDoacao;
    }

    public void setItensDoacao(List<String> itensDoacao) {
        this.itensDoacao = itensDoacao;
    }

    public Integer getIdLista() {
        return idLista;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }


    
}
