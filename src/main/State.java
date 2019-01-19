package main;

/**
 * @author Lenjo
 */
class State {
    private static boolean state = true;
    static boolean alive(){return state;}
    static void stillAlive(boolean newState){state = newState;}
}
