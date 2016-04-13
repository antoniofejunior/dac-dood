/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.interfaces;

import ifpb.dac.dood.pojos.Duvida;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface DuvidaService {

    boolean salvar(Duvida duvida);

    boolean remover(Duvida duvida);

    Duvida buscar(long id);

    List<Duvida > todos();
}
