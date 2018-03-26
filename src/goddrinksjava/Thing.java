package goddrinksjava;

import java.util.ArrayList;
import java.util.List;

public class Thing implements Circle, PointSet, SineWave, Sequence, Fruit, TabbyCat {
    public String myName;

    private Memory memory;
    private List<String> senseList;

    public Thing() {
        memory = new Memory();
        senseList = new ArrayList<>();
    }

    public void addAttribute(Attribute attribute) {

    }

    // Not sure what to return
    public Integer getXPosition() {
        return 0;
    }

    // Not sure what to return
    public Integer toLimit() {
        return 0;
    }

    public void toggleCurrent() {

    }

    public Integer getNumSimulationsAvailable() {
        return 0;
    }

    public Integer getNumSimulationsNeeded() {
        return 0;
    }

    public void setProof(Object proof) {

    }

    // Not sure what to return
    public Object toProof() {
        return "";
    }

    public void lookFor(Thing thing, World world) {
        if (world.thingList.contains(thing)) {
            System.out.println(String.format("Found %s", thing.myName));
        }
        else {
            System.out.println(String.format("Could not find %s", thing.myName));
        }
    }

    // Not sure what to return
    public Memory getMemory() {
        return memory;
    }

    public void escape(String... things) {

    }

    /* ----- Circle ----- */

    // Not sure what to return
    @Override
    public Circumference getCircumference() {
        return new Circumference();
    }

    @Override
    public void resetCircumference() {

    }

    /* ----- PointSet ----- */

    // Not sure what to return
    @Override
    public Dimension getDimensions() {
        return new Dimension();
    }

    @Override
    public void resetDimentions() {

    }

    /* ----- SineWave ----- */

    @Override
    public Tangent getTangent(Integer source) {
        return new Tangent();
    }

    /* ----- Sequence ----- */

    @Override
    public void setLimit(Integer limit) {

    }

    /* ----- Fruit ----- */

    // Not sure what to return
    @Override
    public Nutrients getNutrients() {
        return new Nutrients();
    }

    @Override
    public void resetNutrients() {

    }

    // Not sure what to return
    @Override
    public Nutrients getAntioxidants() {
        return new Nutrients();
    }

    @Override
    public void resetAntioxidants() {

    }

    /* ----- TabbyCat ----- */

    @Override
    public void purr() {
        System.out.println("Purr");
    }

    /* ----- Lovable ----- */

    public void addAction(String name, Object o) {

    }

    public void canSee(Boolean value) {

    }

    public void addFeeling(String feeling) {

    }

    public void setSatisfaction(Integer level) {

    }

    public Integer toSatisfaction() {
        return 0;
    }

    public Integer getFeelingIndex(String feeling) {
        return 0;
    }

    public void requestExecution(World world) {

    }

    public void toggleGender() {

    }

    public void toggleRoleBDSM() {

    }

    /**
     * Checks if a sense is in the sense list.
     *
     * @param sense The sense to find.
     * @return true if sense is in the list, else false.
     */
    public Boolean getSenseIndex(String sense) {
        return senseList.contains(sense);
    }

    public void removeFeeling(String feeling) {

    }

    public void setOpinion(Object of, Boolean b) {

    }

    public Integer getOpinionIndex(String s) {
        return 0;
    }

    public void setExecution(Object thing) {

    }

    // Not sure what to return
    public Object toExecution() {
        return "";
    }

    public void learnTopic(String topic) {

    }

    public void takeExamTopic(String topic) {

    }

    // Not sure what to return
    public Object getAlgebraicExpression(String s) {
        return "";
    }
}
