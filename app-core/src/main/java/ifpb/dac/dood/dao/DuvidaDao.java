/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifpb.dac.dood.dao;

import ifpb.dac.dood.pojos.Duvida;
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
public class DuvidaDao {

     @PersistenceContext(unitName = "Dac_Dood")
    private EntityManager em;
    
    public boolean salvar(Duvida duvida){
        em.persist(duvida);
        return true;
    }
    
    public boolean remove(Duvida duvida){
        em.remove(em.merge(duvida));
        return true;
    }
    
    public Duvida buscar(long id){
        return em.find(Duvida.class, id);
    }
    
    public List<Duvida> convites(){
        TypedQuery<Duvida> query = em.createQuery("SELECT C FROM Duvida", Duvida.class);
        return query.getResultList();
    }
}
