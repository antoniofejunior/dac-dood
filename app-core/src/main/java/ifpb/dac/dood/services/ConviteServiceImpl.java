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
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Stateless
@Remote(ConviteService.class)
public class ConviteServiceImpl implements ConviteService, Serializable {

    @EJB
    private ConviteDao dao;

    @Override
    public boolean enviar(Convite convite) {
        return dao.salvar(convite);
    }

    @Override
    public Convite ler(String email) {
        return dao.buscar(email);
    }

    @Override
    public boolean aceitar(Convite convite) {
        String mensagem = "<h2>Parabéns!</h2>"
                + "<h4>Sua solicitação para ingressar na mais nova rede social acadêmica, Dood, foi aceita.</h4>"
                + "<h4>Para fazer parte agora basta realizar seu cadastro clicando <a href='" + convite.gerarLink() + "'>aqui</a> .</h4>";
        convite.notify(mensagem);
        return remover(convite);
    }

    @Override
    public boolean recusar(Convite convite) {
        String mensagem = "<h2>Que pena!</h2>"
                + "<h4>Sua solicitação para ingressar na mais nova rede social acadêmica, Dood, foi recusada.</h4>"
                + "<h4>Nossa equipe verificou seu convite e constou algo errado.</h4>"
                + "<h4>Mas não fique triste, envie-nos novamente uma solicitação clicando <a href='http://localhost:8080/app-web/'>aqui</a> e"
                + " verifique se a opção de usuário realmente"
                + " condiz com o seu papel na área acadêmica.</h4>";
        convite.notify(mensagem);
        return remover(convite);
    }

    @Override
    public List<Convite> todos() {
        return dao.todos();
    }

    private boolean remover(Convite convite) {
        return dao.remove(convite);
    }
}
