package UTEZ.EDU.MX.reto2;

public record RecordEntrada(String nombreDelEvento, Double precioDelBoleto) {

    public void mostrarInformacion(){
        System.out.println("Evento:"+this.nombreDelEvento+ " | Precio: "+this.precioDelBoleto);
    }
}
