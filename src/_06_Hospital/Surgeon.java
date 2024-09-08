package _06_Hospital;

public class Surgeon extends Doctor{

	@Override
	boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean performsSurgery() {
		// TODO Auto-generated method stub
		return true;
	}

}
