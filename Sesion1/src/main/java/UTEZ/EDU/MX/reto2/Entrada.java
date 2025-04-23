package UTEZ.EDU.MX.reto2;

public class Entrada {
    private String nombreDelEvento;
    private Double precioDeLaEntrada;

    public Entrada(String nombreDelEvento, Double precioDeLaEntrada) {
        this.nombreDelEvento = nombreDelEvento;
        this.precioDeLaEntrada = precioDeLaEntrada;
    }
    public Entrada(){}

    public String GetNombreDelEvento(){
        return this.nombreDelEvento;
    }

    public Double getPrecioDeLaEntrada(){
        return this.precioDeLaEntrada;
    }

    public void setNombreDelEvento(String nombreDelEvento){
        this.nombreDelEvento = nombreDelEvento;
    }

    public void setPrecioDeLaEntrada(Double precioDeLaEntrada){
        this.precioDeLaEntrada = precioDeLaEntrada;
    }

    public void mostrarInformacion(){
        System.out.println("Evento: " + this.nombreDelEvento +" | Precio: " + this.precioDeLaEntrada);
    }
}
