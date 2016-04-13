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
import javax.persistence.ManyToOne;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Resposta implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private LocalDate data;
    @Column(columnDefinition = "TEXT")
    private String mensagem;

    @ManyToOne
    private Usuario usuario;

    public Resposta() {
    }

    public Resposta(LocalDate data, String mensagem, Usuario usuario) {
        this.data = data;
        this.mensagem = mensagem;
        this.usuario = usuario;
    }

    public Resposta(long id, LocalDate data, String mensagem, Usuario usuario) {
        this.id = id;
        this.data = data;
        this.mensagem = mensagem;
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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
