/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.interfaces;

import ifpb.dac.dood.pojos.Dood;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface DoodService {
 
    boolean salvar(Dood dood);
    
    boolean remover(Dood dood);
    
    Dood buscar(String titulo);
    
    List<Dood> todos();
}
