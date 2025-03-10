// HospitalConsultation.java
// Problem 3: Hospital, Doctors, and Patients (Association and Communication)
import java.util.ArrayList;

class Patient {
    String name;
    private ArrayList<Doctor> consultedDoctors;
    
    public Patient(String name) {
        this.name = name;
        consultedDoctors = new ArrayList<>();
    }
    
    public void addDoctor(Doctor doctor) {
        if (!consultedDoctors.contains(doctor))
            consultedDoctors.add(doctor);
    }
    
    public void displayConsultedDoctors() {
        System.out.println("Patient " + name + " has consulted:");
        for (Doctor d : consultedDoctors) {
            System.out.println(" - Dr. " + d.name);
        }
    }
}

class Doctor {
    String name;
    private ArrayList<Patient> patients;
    
    public Doctor(String name) {
        this.name = name;
        patients = new ArrayList<>();
    }
    
    // Method to consult a patient
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.name);
        if (!patients.contains(patient))
            patients.add(patient);
        patient.addDoctor(this);
    }
    
    public void displayPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println(" - " + p.name);
        }
    }
}

class Hospital {
    String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;
    
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }
    
    public void addDoctor(Doctor d) {
        doctors.add(d);
    }
    
    public void addPatient(Patient p) {
        patients.add(p);
    }
    
    public void displayHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println(" - Dr. " + d.name);
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println(" - " + p.name);
        }
    }
}

public class HospitalConsultation {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");
        
        Doctor drAdams = new Doctor("Adams");
        Doctor drBrown = new Doctor("Brown");
        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");
        
        hospital.addDoctor(drAdams);
        hospital.addDoctor(drBrown);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        
        // Simulate consultations
        drAdams.consult(patient1);
        drAdams.consult(patient2);
        drBrown.consult(patient1);
        
        System.out.println();
        drAdams.displayPatients();
        System.out.println();
        patient1.displayConsultedDoctors();
        System.out.println();
        hospital.displayHospitalDetails();
    }
}
