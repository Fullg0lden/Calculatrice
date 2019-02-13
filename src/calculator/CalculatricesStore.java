/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.HashMap;

/**
 *
 * @author valentin
 */
public class CalculatricesStore {

    private HashMap<String, Calculatrice> calculatrices;

    public CalculatricesStore() {
        this.calculatrices = new HashMap<String, Calculatrice>();
    }

    public Calculatrice getCalculatrice(String calculatrice) {
        return this.calculatrices.get(calculatrice);
    }

    public void addCalculatrice(String nomcalculatrice) {
        Calculatrice calculatrice = new Calculatrice();
        this.calculatrices.put(nomcalculatrice, calculatrice);
    }

    public void removeCalculatrice(String nomcalculatrice) {
        this.calculatrices.remove(nomcalculatrice);
    }

}
