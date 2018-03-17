package goddrinksjava;

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

        /* --------------- */

        if (me instanceof PointSet) {
            you.addAttribute(me.getDimensions().toAttribute());
            me.resetDimentions();
        }

        if (me instanceof Circle) {
            you.addAttribute(me.getCircumference().toAttribute());
            me.resetCircumference();
        }

        if (me instanceof SineWave) {
            you.addAction("sit", me.getTangent(you.getXPosition()));
        }

        if (me instanceof Sequence) {
            me.setLimit(you.toLimit());
        }

        /* --------------- */

        me.toggleCurrent();

        me.canSee(false);
        me.addFeeling("dizzy");

        world.timeTravelForTwo("AC", 617, me, you);
        world.timeTravelForTwo("BC", 3691, me, you);

        world.unite(me, you);

        /* --------------- */

        if (me.getNumSimulationsAvailable() >= you.getNumSimulationsNeeded()) {
            you.setSatisfaction(me.toSatisfaction());
        }

        if (you.getFeelingIndex("happy") != -1) {
            me.requestExecution(world);
        }

        world.lockThing(me);
        world.lockThing(you);

        /* --------------- */

        if (me instanceof Eggplant) {
            you.addAttribute(me.getNutrients().toAttribute());
            me.resetNutrients();
        }

        if (me instanceof Tomato) {
            you.addAttribute(me.getAntioxidants().toAttribute());
            me.resetAntioxidants();
        }

        if (me instanceof TabbyCat) {
            me.purr();
        }

        if (world.getGod().equals(me)) {
            me.setProof(you.toProof());
        }

        /* --------------- */

        me.toggleGender();
        me.toggleRoleBDSM();

        world.makeHigh(me);
        world.makeHigh(you);
    }
}
