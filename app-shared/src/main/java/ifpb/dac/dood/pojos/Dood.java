/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.pojos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Dood implements Serializable {

    @Id
    private String titulo;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String descricao;
    @OneToMany
    private List<Evento> eventos;
    @OneToMany
    private List<Arquivo> arquivos;
    @OneToMany
    private List<Duvida> duvidas;

    public Dood() {
    }

    public Dood(String titulo, String descricao) {
        this(titulo, descricao, new ArrayList<Evento>(), new ArrayList<Arquivo>(), new ArrayList<Duvida>());
    }

    public Dood(String titulo, String descricao, List<Evento> eventos, List<Arquivo> arquivos, List<Duvida> duvidas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.eventos = eventos;
        this.arquivos = arquivos;
        this.duvidas = duvidas;
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

    public void addEvento(Evento evento){
        this.eventos.add(evento);
    }
    
    public void remEvento(Evento evento){
        this.eventos.remove(evento);
    }
    
    public void addArquivo(Arquivo arquivo){
        this.arquivos.add(arquivo);
    }
    
    public void remArquivo(Arquivo arquivo){
        this.arquivos.remove(arquivo);
    }
    
    public void addDuvida(Duvida duvida){
        this.duvidas.add(duvida);
    }
    
    public void remDuvida(Duvida duvida){
        this.duvidas.remove(duvida);
    }
    
    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }

    public List<Duvida> getDuvidas() {
        return duvidas;
    }

    public void setDuvidas(List<Duvida> duvidas) {
        this.duvidas = duvidas;
    }

}
