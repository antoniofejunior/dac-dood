/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifpb.dac.dood.dao;

import ifpb.dac.dood.pojos.Evento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Stateless
public class EventoDao {

     @PersistenceContext(unitName = "Dac_Dood")
    private EntityManager em;
    
    public boolean salvar(Evento evento){
        em.persist(evento);
        return true;
    }
    
    public boolean remove(Evento event){
        em.remove(event);
        return true;
    }
    
    public Evento buscar(long id){
        return em.find(Evento.class, id);
    }
    
    public List<Evento> todos(){
        TypedQuery<Evento> query = em.createQuery("SELECT C FROM Evento", Evento.class);
        return query.getResultList();
    }
}
