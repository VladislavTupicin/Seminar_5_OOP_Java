package Model;

public class MultCalc implements ICalcModel {
    @Override
    public double result(double x, double y) {
        return x * y;
    }
}