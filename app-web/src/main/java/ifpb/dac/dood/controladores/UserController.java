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
import javax.enterprise.context.SessionScoped;
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
    private String email;
    private String senha;
    
    public UserController(){
        this.usuario = new Usuario();
        this.email = "";
        this.senha = "";
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
    
    @SessionScoped
    public void login(){
        if(service.login(email, senha)){
            this.usuario = service.buscar(email);
        }
    };

    public Usuario getUsuario() {
        return usuario;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
