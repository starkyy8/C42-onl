import Homework_7.Patient;
import Homework_7.Terapist;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        getTreatment();

    }
    public static void getTreatment(){
        Patient patient1 = new Patient(1);
        Terapist terapist = new Terapist();
        System.out.println("Лечение пациента 1 по плану 1");
        terapist.assignDoctor(patient1);
        System.out.println();

        Patient patient2 = new Patient(2);
        System.out.println("Лечение пациента 2 по плану 2");
        terapist.assignDoctor(patient2);
        System.out.println();

        Patient patient3 = new Patient(3);
        System.out.println("Лечение пациента 3 по плану 3");
        terapist.assignDoctor(patient3);
    }
}