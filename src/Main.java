import machines.Bulldozer;
import machines.Excavator;
import machines.Machine;

public class Main {
    public static void main(String[] args) {
        // You can test your code here.
        Machine generic = new Machine();
        generic.about(); // Output: This is a Machine.

        Bulldozer bulldozer = new Bulldozer();
        bulldozer.about(); // Output: This is a Bulldozer.

        Excavator excavator = new Excavator();
        excavator.about(); // Output: This is an Excavator.
    }
}
