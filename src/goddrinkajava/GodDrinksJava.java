package goddrinkajava;

/*
 * The program GodDrinksJava implements an application that
 * creates an empty simulated world with no meaning or purpose
 *
 * author momocashew
 */

public class GodDrinksJava {
    public static void main(String[] args) {
        Thing me = new Lovable("Me", 0, true, -1, false);

        Thing you = new Lovable("You", 0, false, -1, false);

        World world = new World(5);
        world.addThing(me);
        world.addThing(you);
        world.startSimulation();
    }
}
