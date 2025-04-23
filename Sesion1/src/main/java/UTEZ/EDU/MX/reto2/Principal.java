package UTEZ.EDU.MX.reto2;

public class Principal {
    public static void main(String[] args) {
        Entrada entrada = new Entrada("Obra de teatro 1",250.0);
        Entrada entrada2 = new Entrada("Obra de teatro 2",150.0);
        RecordEntrada recordEntrada = new RecordEntrada("Obra  de teatro record",350.0);
        System.out.println("Entrada 2");
        entrada.mostrarInformacion();
        System.out.println("Entrada 1");
        entrada2.mostrarInformacion();
        System.out.println("Entrada desde record");
        recordEntrada.mostrarInformacion();

    }
}
