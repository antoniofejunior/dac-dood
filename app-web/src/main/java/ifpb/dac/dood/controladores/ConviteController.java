/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.controladores;

import ifpb.dac.dood.interfaces.ConviteService;
import ifpb.dac.dood.pojos.Convite;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Named
@RequestScoped
public class ConviteController {

    @Inject
    private ConviteService service;

    private Convite convite;
    private String email;

    public ConviteController() {
        this.convite = new Convite();
        this.email = "";
    }

    public void enviar() {
        System.out.println("Convite enviado!");
        service.enviar(convite);
    }

    public void ler() {
        this.convite = service.ler(email);
    }

    public void aceitar() {
        service.aceitar(convite);
    }

    public void recusar() {
        service.recusar(convite);
    }

    public Convite getConvite() {
        return convite;
    }

    public String getEmail() {
        return email;
    }

    public void setConvite(Convite convite) {
        this.convite = convite;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
