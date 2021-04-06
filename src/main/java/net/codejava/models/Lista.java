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
public class Lista {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLista;

    @Column(nullable = false, unique = true)
    private String emailUsuario;

    @Column(nullable = false)
    @ColumnDefault("false")
    private boolean doada;

    @Type(type = "json")
    @Column(columnDefinition = "json", nullable = false)
    private InfoAluno infoAluno;

    @Type(type = "json")
    @Column(columnDefinition = "json", nullable = false)
    private InfoEscola infoEscola;

    @Type(type = "json")
    @Column(columnDefinition = "json", nullable = false)
    private List<String> itens;

    public Integer getIdLista() {
        return this.idLista;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }

    public String getEmailUsuario() {
        return this.emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public Boolean getDoada() {
        return this.doada;
    }

    public void setDoada(Boolean doada) {
        this.doada = doada;
    }

    public InfoAluno getInfoAluno() {
        return this.infoAluno;
    }

    public void setInfoAluno(InfoAluno infoAluno) {
        this.infoAluno = infoAluno;
    }

    public InfoEscola getInfoEscola() {
        return this.infoEscola;
    }

    public void setInfoEscola(InfoEscola infoEscola) {
        this.infoEscola = infoEscola;
    }

    public List<String> getItens() {
        return this.itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }

}