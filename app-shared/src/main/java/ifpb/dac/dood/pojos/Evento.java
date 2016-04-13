/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.pojos;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Evento implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private String local;
    private LocalDate data;
    @Column(length = 50)
    private String nome;
    @Column(columnDefinition = "TEXT")
    private String descricao;

    public Evento() {
    }

    public Evento(long id, String local, LocalDate data, String nome, String descricao) {
        this.id = id;
        this.local = local;
        this.data = data;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Evento(String local, LocalDate data, String nome, String descricao) {
        this.local = local;
        this.data = data;
        this.nome = nome;
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
