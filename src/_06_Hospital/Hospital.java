package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
ArrayList<Doctor> staff = new ArrayList<Doctor>();
ArrayList<Patient> customerBase = new ArrayList<Patient>();
void addDoctor(Doctor d) {
	staff.add(d);
}
void addPatient(Patient p) {
	customerBase.add(p);
}
ArrayList<Doctor> getDoctors() {
	return staff;
}
ArrayList<Patient> getPatients() {
	return customerBase;
}
void assignPatientsToDoctors() throws DoctorFullException {
	int i = 0;
	for(Patient p: customerBase) {
		staff.get(i).assignPatient(p);
		if(i!=staff.size()-1) {
			i++;
		} else {i=0;}
	}
}

}
