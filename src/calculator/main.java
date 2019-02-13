package calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Operations.Soustraction;
import Operations.Operation;
import Operations.Multiplication;
import Operations.Modulo;
import Operations.Division;
import Operations.Addition;
import java.util.Scanner;

/**
 *
 * @author valentin
 */
public class main {

    private static Scanner sc = new Scanner(System.in);
    private static final CalculatricesStore application = new CalculatricesStore();
    private static String currentCalculatrice;
    private static String operation;
    private static double operande1;
    private static double operande2;
    private static Operation op;

    public static void main(String[] args) {

        System.out.println();
        System.out.println("MENU");
        System.out.println("1-Add a Calculatrice ");
        System.out.println("2-Add an Operation");
        System.out.println("3-Remove an Operation");
        System.out.println("4-Execute");
        System.out.println("5-actual Calculatrice");
        System.out.println("Other-Quit");
        int choix = sc.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Enter the name of the Calculatrice");
                application.addCalculatrice(currentCalculatrice = sc.next());
                System.out.println("ADD !");
                System.out.println("You are using " + currentCalculatrice + " !");
                main(args);
                break; 
            case 2:
                op=choixOp();
                System.out.println("Enter the symbole of your operation");
                operation=sc.next();
                application.getCalculatrice(currentCalculatrice).addOperation(operation, op);
                main(args);
                break;
            case 3:
                System.out.println("Choose the operation you want to remove");
                application.getCalculatrice(currentCalculatrice).removeOperation(sc.next());
                main(args);
                break;
            case 4:
                System.out.println("First Operande");
                operande1 = sc.nextDouble();
                System.out.println("Seconde Operande");
                operande2 = sc.nextDouble();
                System.out.println("Operation");
                operation = sc.next();
                application.getCalculatrice(currentCalculatrice).init(operande1, operande2, operation);
                System.out.println("Result : "+application.getCalculatrice(currentCalculatrice).calculer());
                main(args);
                break;
            case 5:
                System.out.println("Enter the name of your Calculatrice");
                currentCalculatrice = sc.next();
                System.out.println("You are using " + currentCalculatrice + " !");
                main(args);
                break;
            default:
                return;
        }
        sc.close();
    }

    public static Operation choixOp() {
        System.out.println("Available Operations");
        System.out.println("1-Addition ");
        System.out.println("2-Soustraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        System.out.println("5-Modulo");
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                return new Addition();
            case 2:
                return new Soustraction();
            case 3:
                return new Multiplication();
            case 4:
                return new Division();
            case 5:
                return new Modulo();
            default:
                    throw new IllegalArgumentException();
        }
    }
}
