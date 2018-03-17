package goddrinksjava;

public class World {
    private Boolean settingGod = true;

    private Lovable God;

    public World(Integer i) {

    }

    public void addThing(Thing thing) {
        if (thing instanceof Lovable && settingGod) {
            God = (Lovable) thing;

            settingGod = false;
        }
    }

    public void startSimulation() {

    }

    public void timeTravelForTwo(String period, Integer year, Thing first, Thing second) {

    }

    public void unite(Thing first, Thing second) {

    }

    public void lockThing(Thing thing) {

    }

    public Lovable getGod() {
        return God;
    }

    public void procreate(Thing... things) {

    }

    public void makeHigh(Thing height) {

    }

    public void unlock(Thing thing) {

    }

    public void removeThing(Thing thing) {

    }

    public void announce(String... s) {

    }

    public void runExecution() {

    }

    public Boolean isExecutableBy(Thing thing) {
        return false;
    }

    public Integer getThingIndex(Thing thing) {
        return 0;
    }

    public void execute(Thing thing) {

    }
}
