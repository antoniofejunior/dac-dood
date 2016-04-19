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

//        Usuario u = new Usuario("dijalmacz@gmail.com", Perfil.Administrador, "Dijalma", "Silva", "201312010134", 
//                "123123", Sexo.Masculino, new String("asd").getBytes(), LocalDate.now(), Status.Ativa);
//        Usuario usuario = service.buscar("dijalmacz@gmail.com");
//        boolean removeu = service.remover(usuario);
//        if (removeu)
//            JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");
        service.salvar(new Usuario("Wellington@admin.com", Perfil.Administrador, "Welligton", "AdminSys", "0003", "admin", Sexo.Masculino, new String("asd").getBytes(), LocalDate.now(), Status.Ativa));

    }
    
    public static void criarAdmin(){
                UsuarioService service = new ServiceLocator().lookup("java:global/DAC_Dood-core/UsuarioServiceImpl", UsuarioService.class);

//        Usuario u = new Usuario("dijalmacz@gmail.com", Perfil.Administrador, "Dijalma", "Silva", "201312010134", 
//                "123123", Sexo.Masculino, new String("asd").getBytes(), LocalDate.now(), Status.Ativa);
//        Usuario usuario = service.buscar("dijalmacz@gmail.com");
//        boolean removeu = service.remover(usuario);
//        if (removeu)
//            JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");
        service.salvar(new Usuario("Wellington@admin.com", Perfil.Administrador, "Welligton", "AdminSys", "0003", "admin", Sexo.Masculino, new String("asd").getBytes(), LocalDate.now(), Status.Ativa));

    }
}
