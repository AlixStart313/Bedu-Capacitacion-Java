package UTEZ.EDU.MX.reto1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Pacient paciente = new Pacient();
        PacientRecord pacientRecord = new PacientRecord("Juan Perez", "WEF$%#",23);
        paciente.saveNewPatient();
        paciente.mostrarInformacion();
        System.out.println(pacientRecord.toString());
    }
}