package Homework_7;

public class Terapist extends Doctor{
    @Override
    public void treat(){
        System.out.println("Терапевт назначает лечение.");
    }

    public void assignDoctor(Patient patient){
        int plan = patient.getTreatmentPlan();
        Doctor assignedDoctor;

        if (plan == 1 ){
            assignedDoctor = new Surgeon();
        }
        else if (plan == 2){
            assignedDoctor = new Dentist();
        }
        else {
            assignedDoctor = new Terapist();
        }

        patient.setDoctor(assignedDoctor);
        System.out.println("Назначаем врача");
        assignedDoctor.treat();
    }
}
