/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifpb.dac.dood.dao;

import ifpb.dac.dood.pojos.Convite;
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
public class ConviteDao {

    @PersistenceContext(unitName = "Dac_Dood")
    private EntityManager em;
    
    public boolean salvar(Convite convite){
        em.persist(convite);
        return true;
    }
    
    public boolean remove(Convite convite){
        em.remove(em.merge(convite));
        return true;
    }
    
    public Convite buscar(String email){
        return em.find(Convite.class, email);
    }
    
    public List<Convite> todos(){
        TypedQuery<Convite> query = em.createQuery("SELECT C FROM Convite", Convite.class);
        return query.getResultList();
    }
}
