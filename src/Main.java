import Console.View;
import Model.SumCalc;
import Presenter.Presenter;

public class Main {
    public static void main(String[] args) {
        Presenter app = new Presenter(new SumCalc(), new View());
        app.runOperation();
    }
}