import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("brewing coffee ...");
    }

    @Override
    void addCondiments() {
        System.out.println("adding milk and sugar ...");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Do you want some milk and sugar? (y/n) ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error");
        }

        if (answer == null) {
            return "no";
        }

        return answer;
    }
}
