package squier.john.javacd10;

/**
 * Created by johnsquier on 1/12/17.
 */
public class Main {

    public static void main(String[] args) {

        InputPrompter prompter = new InputPrompter();
        InputSummer summer = new InputSummer();

        int sum = summer.sumUpToInput(prompter.getInput());

        prompter.displayResults(sum);
    }
}
