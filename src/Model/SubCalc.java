package Model;

public class SubCalc implements ICalcModel {
    @Override
    public double result(double x, double y) {
        return x - y;
    }
}