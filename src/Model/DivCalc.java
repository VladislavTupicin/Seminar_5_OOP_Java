package Model;

public class DivCalc implements ICalcModel {
    @Override
    public double result(double x, double y) {
        return x / y;
    }
}