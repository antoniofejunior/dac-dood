/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood;

import ifpb.dac.dood.interfaces.UsuarioService;
import ifpb.dac.dood.pojos.Perfil;
import ifpb.dac.dood.pojos.Sexo;
import ifpb.dac.dood.pojos.Status;
import ifpb.dac.dood.pojos.Usuario;
import java.time.LocalDate;

/**
 *
 * @author Antônio
 */
public class TesteApp {

    public static void main(String[] args) {
        UsuarioService service = new ServiceLocator().lookup("java:global/DAC_Dood-core/UsuarioServiceImpl", UsuarioService.class);
        service.salvar(new Usuario("admin", Perfil.Administrador, "Admin", "AdminSys", "1", "admin", Sexo.Masculino, "ADS".getBytes(), LocalDate.now(), Status.Ativa));

    }
}
