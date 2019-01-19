package main;

import java.util.Random;

/**
 * @author Lenjo
 * @version 1.0.0
 */
public class Life {
    public static void main(String[] args) {
        int problemCount = 0;
        while (State.alive()) {            
            giveProblem();
            problemCount++;
        }
        System.out.println("You died after "+problemCount+" problems.");}
    private static void giveProblem() {
        if (Problem.fatal()){
            State.stillAlive(false);
            System.out.println(Problem.list[new Random().nextInt(Problem.list.length)]+" killed you.");
        }else{
            System.out.println("You survived "+Problem.list[new Random().nextInt(Problem.list.length)]);
        }}
    
    
}
