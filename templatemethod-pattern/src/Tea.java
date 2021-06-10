public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("steeping tea bag ...");
    }

    @Override
    void addCondiments() {
        System.out.println("adding lemon ...");
    }

}
