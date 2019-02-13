package calculator;

import Operations.Operation;
import java.util.HashMap;

/**
 *
 * @author valentin
 */
public class Calculatrice {

    private double operande1;
    private double operande2;
    private String operation;
    private HashMap<String, Operation> operations;

    public Calculatrice() {
        this.operations = new HashMap<>();
    }

    public void addOperation(String operation, Operation operations) {
        this.operations.put(operation, operations);
    }

    public void removeOperation(String operation) {
        this.operations.remove(operation);
    }

    public void init(double operande1, double operande2, String operation) {
        this.operande1 = operande1;
        this.operande2 = operande2;
        this.operation = operation;
    }

    public double calculer() {
        if (this.operations.containsKey(this.operation)) {
            return operations.get(this.operation).executer(this.operande1, this.operande2);
        } else {
            throw new IllegalArgumentException("Operation non reconnu");
        }
    }

}
