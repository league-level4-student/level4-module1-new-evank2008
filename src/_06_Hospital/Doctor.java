package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {

	abstract boolean makesHouseCalls();
	abstract boolean performsSurgery();
	
	private ArrayList<Patient> list = new ArrayList<Patient>();
	 void doMedicine() {
		 for (Patient p: list) {
			 p.checkPulse();
		 }
	 }
	void assignPatient(Patient p) throws DoctorFullException{
		if(list.size()>2) {
			throw new DoctorFullException();
		} else {
		list.add(p);
		}
	}
	public ArrayList<Patient> getPatients() {
		return list;
		
	}
}
class DoctorFullException extends Exception {
}
