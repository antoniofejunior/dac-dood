/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.pojos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

/**
 *
 * @author Junior
 */
@Entity
public class Convite implements Serializable {

    @Id
    private String email;
    @Enumerated(EnumType.STRING)
    private Perfil perfil;
    private LocalDate data;

    public Convite(String email, Perfil perfil, LocalDate data) {
        this.email = email;
        this.perfil = perfil;
        this.data = data;
    }

    public Convite() {
        this.data = LocalDate.now();
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the perfil
     */
    public Perfil getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    /**
     * @return the data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    public void notify(String mensagem) {
        String titulo = "Resposta para ingressar na Rede Dood";
        ThreadEmail emailThread = new ThreadEmail();
        emailThread.setEmail(email, titulo, mensagem);
        emailThread.start();
    }

    public String gerarLink() {

        String linkGerado = "";

        for (int i = 0; i < 30; i++) {
            int t = new Random().nextInt(2);
            if (t == 1) {
                int caractere = new Random().nextInt(25) + 65;
                linkGerado += (char) caractere;
            } else {
                int caractere = new Random().nextInt(25) + 97;
                linkGerado += (char) caractere;
            }
        }
        return "http://localhost:8080/app-web/" + perfil.name().toLowerCase() + "?hashCode=" + linkGerado;
    }

    @Override
    public String toString() {
        return "Convite{" + "email=" + email + ", perfil=" + perfil + ", data=" + data + '}';
    }

}
