/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifpb.dac.dood.dao;

import ifpb.dac.dood.pojos.Resposta;
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
public class RespostaDao {

     @PersistenceContext(unitName = "Dac_Dood")
    private EntityManager em;
    
    public boolean salvar(Resposta resposta){
        em.persist(resposta);
        return true;
    }
    
    public boolean remove(Resposta resposta){
        em.remove(resposta);
        return true;
    }
    
    public Resposta buscar(long id){
        return em.find(Resposta.class, id);
    }
    
    public List<Resposta> todos(){
        TypedQuery<Resposta> query = em.createQuery("SELECT C FROM Resposta", Resposta.class);
        return query.getResultList();
    }
}
