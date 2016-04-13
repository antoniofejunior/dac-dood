/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifpb.dac.dood.dao;

import ifpb.dac.dood.pojos.Arquivo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class ArquivoDao {

     @PersistenceContext(unitName = "Dac_Dood")
    private EntityManager em;
    
    public boolean salvar(Arquivo arquivo){
        em.persist(arquivo);
        return true;
    }
    
    public boolean remove(Arquivo arquivo){
        em.remove(arquivo);
        return true;
    }
    
    public Arquivo buscar(String link){
        return em.find(Arquivo.class, link);
    }
    
    public List<Arquivo> todos(){
        TypedQuery<Arquivo> query = em.createQuery("SELECT C FROM Arquivo", Arquivo.class);
        return query.getResultList();
    }
}
