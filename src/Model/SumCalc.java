package Model;

public class SumCalc extends CalcModel implements ICalcModel {

    @Override
    public double result(double x, double y) {
        return x + y;
    }
}