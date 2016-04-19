/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifpb.dac.dood.services;

import ifpb.dac.dood.dao.UsuarioDao;
import ifpb.dac.dood.interfaces.UsuarioService;
import ifpb.dac.dood.pojos.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Stateless
@Remote(UsuarioService.class)
public class UsuarioServiceImpl implements UsuarioService, Serializable{

    @EJB
    private UsuarioDao dao;
    
    @Override
    public boolean salvar(Usuario usuario) {
        return dao.salvar(usuario);
    }

    @Override
    public boolean remover(Usuario usuario) {
        return dao.remove(usuario);
    }

    @Override
    public Usuario buscar(String email) {
        return dao.buscar(email);
    }

    @Override
    public List<Usuario> todos() {
        return dao.todos();
    }

    @Override
    public boolean login(String email, String senha) {
        return dao.login(email, senha);
    }

}
