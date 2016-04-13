/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.interfaces;

import ifpb.dac.dood.pojos.Convite;

/**
 *
 * @author Junior
 */
public interface ConviteService {
    
    void enviar(Convite convite);
    
    Convite ler();
    
    void aceitar(Convite convite);
    
    void recusar(Convite convite);
}
