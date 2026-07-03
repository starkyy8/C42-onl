package Homework_7;

public class Patient {

    private int treatmentPlan;
    private Doctor doctor;

    public Patient(int treatmentPlan){
        this.treatmentPlan = treatmentPlan;
    }
    public int getTreatmentPlan(){
        return treatmentPlan;
    }
    public void setTreatmentPlan(int treatmentPlan){
        this.treatmentPlan = treatmentPlan;
    }
    public Doctor getDoctor(){
        return doctor;
    }
    public void setDoctor(Doctor doctor){
        this.treatmentPlan = treatmentPlan;
    }
}
