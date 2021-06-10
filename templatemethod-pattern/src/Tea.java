public class Tea {

    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("boiling water ...");
    }

    public void steepTeaBag() {
        System.out.println("steeping tea bag ...");
    }

    public void pourInCup() {
        System.out.println("pouring in cup ...");
    }

    public void addLemon() {
        System.out.println("adding lemon ...");
    }
}
