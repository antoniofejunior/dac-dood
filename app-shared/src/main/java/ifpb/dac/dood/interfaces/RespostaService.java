/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.interfaces;

import ifpb.dac.dood.pojos.Resposta;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface RespostaService {

    boolean salvar(Resposta resposta);

    boolean remover(Resposta resposta);

    Resposta buscar(long id);

    List<Resposta> todos();
}
