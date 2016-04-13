/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.pojos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Duvida implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private LocalDate data;
    @Column(length = 50)
    private String titulo;
    @Column(columnDefinition = "TEXT")
    private String descricao;

    @OneToMany
    private List<Resposta> respostas;
    @ManyToOne
    private Usuario usuario;

    public Duvida() {
    }

    public Duvida(LocalDate data, String titulo, String descricao, Usuario usuario) {
        this(data, titulo, descricao, new ArrayList<Resposta>(), usuario);
    }

    public Duvida(LocalDate data, String titulo, String descricao, List<Resposta> respostas, Usuario usuario) {
        this.data = data;
        this.titulo = titulo;
        this.descricao = descricao;
        this.respostas = respostas;
        this.usuario = usuario;
    }

    public Duvida(long id, LocalDate data, String titulo, String descricao, List<Resposta> respostas, Usuario usuario) {
        this.id = id;
        this.data = data;
        this.titulo = titulo;
        this.descricao = descricao;
        this.respostas = respostas;
        this.usuario = usuario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<Resposta> respostas) {
        this.respostas = respostas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
