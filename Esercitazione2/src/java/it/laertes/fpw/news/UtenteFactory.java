/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.laertes.fpw.news;

/**
 * 
 * Factory for Utente objects. Implemented by using the singleton pattern.
 *
 * @author bardoz
 */

public class UtenteFactory {
    
    /**
     * Singleton pattern. 
     * instance -> only existing instance of this factory.
     * 
     * notes on singleton pattern: constructor must be private!
     * 
     */
    private static UtenteFactory instance;
    
    private UtenteFactory()
    {
        
        
    }
    
    public static UtenteFactory getInstance()
    {
        if (instance == null)
            instance = new UtenteFactory();
        
        return instance;
    }
    
}
