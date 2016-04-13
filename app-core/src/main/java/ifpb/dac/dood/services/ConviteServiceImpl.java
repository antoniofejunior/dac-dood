/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifpb.dac.dood.services;

import ifpb.dac.dood.dao.ConviteDao;
import ifpb.dac.dood.interfaces.ConviteService;
import ifpb.dac.dood.pojos.Convite;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Stateless
@Remote(ConviteService.class)
public class ConviteServiceImpl implements ConviteService, Serializable{

    @EJB
    private ConviteDao dao;
    
    @Override
    public void enviar(Convite convite) {
        dao.salvar(convite);
    }

    @Override
    public Convite ler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aceitar(Convite convite) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void recusar(Convite convite) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
