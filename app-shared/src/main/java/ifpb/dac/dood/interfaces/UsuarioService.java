/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.interfaces;

import ifpb.dac.dood.pojos.Usuario;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface UsuarioService {

    boolean salvar(Usuario usuario);

    boolean remover(Usuario usuario);

    Usuario buscar(String email);

    List<Usuario> todos();
    
    boolean login(String email, String senha);
}
