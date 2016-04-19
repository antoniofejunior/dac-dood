/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.dood.pojos;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Usuario implements Serializable {

    @Transient
    private Token token;

    @Id
    private String email;
    @Enumerated(EnumType.STRING)
    private Perfil perfil;
    @Column(length = 40)
    private String nome;
    @Column(length = 40)
    private String sobrenome;
    @Column(length = 30)
    private String matricula;
    private String senha;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @Lob
    private byte[] avatar;
    private LocalDate dataNascimento;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToMany
    private List<Usuario> seguindo;

    @OneToMany
    private List<Arquivo> arquivos;

    @ManyToMany
    private List<Dood> doods;

    public Usuario() {
        this("", Perfil.Aluno, "", "", "", "", Sexo.Feminino, "".getBytes(), LocalDate.now(), Status.Inativa);
    }

    public Usuario(String email, Perfil perfil, String nome, String sobrenome, String matricula, String senha, Sexo sexo, byte[] avatar, LocalDate dataNascimento, Status status) {
        this(email, perfil, nome, sobrenome, matricula, senha, sexo, avatar, dataNascimento, status, new ArrayList<Usuario>(), new ArrayList<Dood>(), new ArrayList<Arquivo>());
    }

    public Usuario(String email, Perfil perfil, String nome, String sobrenome, String matricula, String senha, Sexo sexo, byte[] avatar, LocalDate dataNascimento, Status status, List<Usuario> seguindo, List<Dood> doods, List<Arquivo> arquivos) {
        this.token = new Token();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
        this.senha = UtilCriptografia.criptografar(senha);
        this.sexo = sexo;
        this.avatar = avatar;
        this.dataNascimento = dataNascimento;
        this.status = status;
        this.seguindo = seguindo;
        this.doods = doods;
        this.arquivos = arquivos;
        this.email = email;
        this.perfil = perfil;
    }

    public void seguir(Usuario usuario) {
        this.seguindo.add(usuario);
    }

    public void seguir(Dood dood) {
        this.doods.add(dood);
    }

    public void deixarDeSeguir(Usuario usuario) {
        this.seguindo.remove(usuario);
    }

    public void deixarDeSeguir(Dood dood) {
        this.doods.remove(dood);
    }

    public void addArquivo(Arquivo arquivo) {
        this.arquivos.add(arquivo);
    }

    public void remArquivo(Arquivo arquivo) {
        this.arquivos.remove(arquivo);
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = UtilCriptografia.criptografar(senha);
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Usuario> getSeguindo() {
        return seguindo;
    }

    public void setSeguindo(List<Usuario> seguindo) {
        this.seguindo = seguindo;
    }

    public List<Dood> getDoods() {
        return doods;
    }

    public void setDoods(List<Dood> doods) {
        this.doods = doods;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

}
