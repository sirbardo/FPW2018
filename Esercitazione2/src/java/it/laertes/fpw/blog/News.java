/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.laertes.fpw.blog;

/**
 *
 * @author bardoz
 */
public class News {

    private int id;
    private String titolo;
    private String content;
    private String img;
    private String categoria;
    private User autore;

    public News()
    {
        this.id = 0;
        this.titolo = "Titoloplaceholder";
        this.content= "Contenutobello";
        this.img= "";
        this.categoria = "";
        this.autore = new User();
    }
        
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the titolo
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * @param titolo the titolo to set
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the autore
     */
    public User getAutore() {
        return autore;
    }

    /**
     * @param autore the autore to set
     */
    public void setAutore(User autore) {
        this.autore = autore;
    }
        
    
}
