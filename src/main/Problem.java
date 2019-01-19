package main;

import java.util.Random;

/**
 * @author Lenjo
 */
class Problem {
    static String[] list = {"Brokeness", "Cancer", "Gonorrhea", "Old Age", "Stress"};
    static boolean fatal() {
        return new Random().nextBoolean();
    }

}
