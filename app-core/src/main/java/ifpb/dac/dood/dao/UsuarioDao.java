/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.dao;

import ifpb.dac.dood.pojos.Usuario;
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
public class UsuarioDao {

    @PersistenceContext(unitName = "Dac_Dood")
    private EntityManager em;

    public boolean salvar(Usuario usuario) {
        em.persist(usuario);
        return true;
    }

    public boolean remove(Usuario usuario) {
        em.remove(em.merge(usuario));
        return true;
    }

    public Usuario buscar(String email) {
        return em.find(Usuario.class, email);
    }

    public List<Usuario> todos() {
        TypedQuery<Usuario> query = em.createQuery("SELECT C FROM Usuario", Usuario.class);
        return query.getResultList();
    }
    
    public boolean login(String email, String senha){
//        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.email like :email AND u.senha like :senha", Usuario.class);
        TypedQuery<String> query = em.createQuery("SELECT u.senha FROM Usuario u WHERE UPPER(u.email) like UPPER(:email)", String.class);
        query.setParameter("email", email);
        return (senha == null ? query.getSingleResult() == null : senha.equals(query.getSingleResult()));
    }
}
