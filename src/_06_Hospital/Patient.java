package _06_Hospital;

public class Patient {

	private boolean caredFor = false;
	public boolean feelsCaredFor() {
		return caredFor;
	}
	void checkPulse() {caredFor=true;};
}
