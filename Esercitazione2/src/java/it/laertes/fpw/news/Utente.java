/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bardoz
 */

package it.laertes.fpw.news;

public class Utente 
{
    private int id;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String urlProfImg;
    
    
    public Utente(){ 
        this.id = 0;
        this.nome = "pippo";
        this.cognome = "paperino";
        this.email = "pippo@paperino.com";
        this.password = "pippopaperino";
        this.urlProfImg = "www.google.it";
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUrlProfImg() {
        return urlProfImg;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrlProfImg(String urlProfImg) {
        this.urlProfImg = urlProfImg;
    }
    
    
}
