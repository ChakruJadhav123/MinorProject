package Hospital;

public class Orthopedics implements HospitalInterface{
    @Override
public void admitPatient(String patientName, Address address) {
	System.out.println("Patient Admitted : "+patientName);
	System.out.println("Address : "+address);
}
    @Override
	public void provideTreatment(String patientName) {
		System.out.println(patientName+" is Getting Treatment (Orthopedics)"+"\n And The Bill : 30000");
	}
    @Override
	public void generateBill(String patientName, double amount) {
		if(amount<30000) {
			System.out.println("Please pay Remaining Amount "+(30000-amount));
		}else if(amount>30000) {
			System.out.println("Remaining Bal :"+(amount -30000));
		}else {
			System.out.println("Bill is Clear");
		}
	}
}
