package UTEZ.EDU.MX;

import java.util.Scanner;

public class Pacient {
    public String name;
    public String expedient;
    public int age;


    //Constructor para crear un nuevo paciente, este solicita el nmbre, edad y expediente del paciente
    public Pacient(String expedient, String name, int age) {
        this.expedient = expedient;
        this.name = name;
        this.age = age;
    }

    //constructor vacio por si se desea crear un nuevo objeto paciente sin inicializar sus datos
    public Pacient(){

    }

    public void getName(String name){
        this.name = name;
    }

    public void getExpedient(String expedient){
        this.expedient = expedient;
    }

    public void getAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getExpedient(){
        return this.expedient;
    }

    public int getAge(){
        return this.age;
    }

    public void saveNewPatient(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el ID del Pacient: ");
         this.name= teclado.nextLine();
        System.out.println("Ingrese el expedient del Pacient: ");
        this.expedient= teclado.nextLine();
        System.out.println("Ingrese el age del Pacient: ");
        this.age= teclado.nextInt();
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: "+this.name);
        System.out.println("Expedient: "+this.expedient);
        System.out.println("Age: "+this.age);
    }
}
