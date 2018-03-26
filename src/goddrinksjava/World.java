package goddrinksjava;

import java.util.ArrayList;
import java.util.List;

public class World {
    public final List<Thing> thingList;

    private Boolean settingGod = true;
    private Lovable God;

    public World(Integer i) {
        thingList = new ArrayList<>();
    }

    public void addThing(Thing thing) {
        if (thing instanceof Lovable && settingGod) {
            God = (Lovable) thing;

            settingGod = false;
        }

        thingList.add(thing);
        System.out.println(String.format("Added %s", thing.myName));
    }

    public void startSimulation() {
        System.out.println("Starting simulation");
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
        thingList.remove(thing);
        System.out.println(String.format("Removed %s", thing.myName));
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
