/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operations;

import Operations.Operation;

/**
 *
 * @author valentin
 */
public class Soustraction implements Operation {

    @Override
    public double executer(double operande1, double operande2) {
        return operande1 - operande2;
    }
}
