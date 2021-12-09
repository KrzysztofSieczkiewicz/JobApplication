import java.util.ArrayList;
import java.util.List;

public class Numbers {

    public List<Double> mathematics(double numberOne, double numberTwo) {
        List<Double> solutions = new ArrayList<>();

        solutions.add(0, numberOne * numberTwo); //Multiplication
        solutions.add(1, numberOne / numberTwo); //Division
        solutions.add(2, numberOne % numberTwo);

        return solutions;
    }
}
