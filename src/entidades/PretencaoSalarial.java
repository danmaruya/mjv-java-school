package entidades;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class PretencaoSalarial {
    private double pretencaoMinima;
    private double pretencaoMaxima;

    public PretencaoSalarial() {
    }

    public PretencaoSalarial(double pretencaoMinima, double pretencaoMaxima) {
        this.pretencaoMinima = pretencaoMinima;
        this.pretencaoMaxima = pretencaoMaxima;
    }

    public double getPretencaoMinima() {
        return pretencaoMinima;
    }

    public void setPretencaoMinima(double pretencaoMinima) {
        this.pretencaoMinima = pretencaoMinima;
    }

    public double getPretencaoMaxima() {
        return pretencaoMaxima;
    }

    public void setPretencaoMaxima(double pretencaoMaxima) {
        this.pretencaoMaxima = pretencaoMaxima;
    }

}
