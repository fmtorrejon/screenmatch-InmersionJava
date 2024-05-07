package calculos;

import modelo.Titulo;

public class CalculadoraDeTiempos {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
//      tiempoTotal = tiempoTotal + titulo.getTiempoDeDuracionEnMinutos();
        tiempoTotal += titulo.getTiempoDeDuracionEnMinutos();

    }

}
