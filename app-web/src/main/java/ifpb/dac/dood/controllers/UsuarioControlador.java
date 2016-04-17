/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifpb.dac.dood.controllers;

import ifpb.dac.dood.pojos.Usuario;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Named
@RequestScoped
public class UsuarioControlador {

    private Usuario usuario;

    public UsuarioControlador() {
        this.usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    public void salvar(){
        System.out.println("Salvando!");
    }
}
