/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifpb.dac.dood.cdi;

import ifpb.dac.dood.interfaces.ConviteService;
import ifpb.dac.dood.interfaces.UsuarioService;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@ApplicationScoped
public class ProducersResource {

    @Produces
    @Resource(lookup = "java:global/DAC_Dood-core/UsuarioServiceImpl")
    private UsuarioService usuarioService;
    
    @Produces
    @Resource(lookup = "java:global/DAC_Dood-core/ConviteServiceImpl")
    private ConviteService conviteService;
    
}
