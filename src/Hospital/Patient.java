package Hospital;

public class Patient {
    String patientName;
    Address address;
    HospitalInterface hospitalInterface;
    
	public Patient(String patientName, Address address, HospitalInterface hospitalInterface) {
		super();
		this.patientName = patientName;
		this.address = address;
		this.hospitalInterface = hospitalInterface;
	}
    public void treatMent() {
    	hospitalInterface.admitPatient(patientName, address);
    	hospitalInterface.provideTreatment(patientName);
    }
    public void getBill(double amount) {
    	hospitalInterface.generateBill(patientName, amount);
    }
	
}
