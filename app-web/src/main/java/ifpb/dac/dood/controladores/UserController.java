/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifpb.dac.dood.controladores;

import ifpb.dac.dood.interfaces.UsuarioService;
import ifpb.dac.dood.pojos.Usuario;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Named(value = "userController")
@RequestScoped
public class UserController {

    @Inject
    private UsuarioService service;
    
    private Usuario usuario;
    
    public UserController(){
        this.usuario = new Usuario();
    }
    
    public boolean salvar(){
        return service.salvar(usuario);
    }

    public boolean remover(){
        return service.remover(usuario);
    }

    public void buscar(String email){
        this.usuario = service.buscar(email);
    }

    public List<Usuario> todos(){
        return service.todos();
    }
    
    public void login(String email, String senha){
        this.usuario = service.login(email, senha);
    }
}
