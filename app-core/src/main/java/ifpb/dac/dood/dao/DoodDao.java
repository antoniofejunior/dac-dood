/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifpb.dac.dood.dao;

import ifpb.dac.dood.pojos.Dood;
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
public class DoodDao {

    @PersistenceContext(unitName = "Dac_Dood")
    private EntityManager em;
    
    public boolean salvar(Dood dood){
        em.persist(dood);
        return true;
    }
    
    public boolean remove(Dood dood){
        em.remove(dood);
        return true;
    }
    
    public Dood buscar(String titulo){
        return em.find(Dood.class, titulo);
    }
    
    public List<Dood> todos(){
        TypedQuery<Dood> query = em.createQuery("SELECT C FROM Dood", Dood.class);
        return query.getResultList();
    }
}
