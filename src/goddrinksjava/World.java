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

    public void makeHigh(Thing height) {

    }
}
