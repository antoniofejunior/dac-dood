/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.interfaces;

import ifpb.dac.dood.pojos.Evento;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface EventoService {

    boolean salvar(Evento evento);

    boolean remover(Evento evento);

    Evento buscar(long id);

    List<Evento> todos();
}
