/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.interfaces;

import ifpb.dac.dood.pojos.Arquivo;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface ArquivoService{
    
    boolean salvar(Arquivo arquivo);
    
    boolean remover(Arquivo arquivo);
    
    Arquivo buscar(long id);
    
    List<Arquivo> todos();
}
