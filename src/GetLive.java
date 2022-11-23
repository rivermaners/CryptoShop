import java.lang.Math;

public class GetLive {
    private double BTCMIN = 55000.00;
    private double BTCMAX = 65000.00;

    public double getLive() {
        return (double) Math.floor(Math.random() * (BTCMAX - BTCMIN + 1) + BTCMIN);
    }
}

