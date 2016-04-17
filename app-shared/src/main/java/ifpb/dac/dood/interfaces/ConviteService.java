/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.interfaces;

import ifpb.dac.dood.pojos.Convite;
import java.util.List;

/**
 *
 * @author Junior
 */
public interface ConviteService {
    
    boolean enviar(Convite convite);
    
    Convite ler(String email);
    
    boolean aceitar(Convite convite);
    
    boolean recusar(Convite convite);
    
    List<Convite> todos();
}
