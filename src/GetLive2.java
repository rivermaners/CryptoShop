import java.lang.Math;

public class GetLive2 {
    private double ETHMIN = 1000.00;
    private double ETHMAX = 5000.00;

    public double getLive() {
        return (double) Math.floor(Math.random() * (ETHMAX - ETHMIN + 1) + ETHMIN);
    }
}

