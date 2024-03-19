package Hospital;

public class Pediatrics implements HospitalInterface {
  @Override
 public void admitPatient(String patientName, Address address) {
	System.out.println("Patient Admitted : "+patientName);
	System.out.println("Address : "+address);
 } 
  @Override
	public void provideTreatment(String patientName) {
		System.out.println(patientName+" is Getting Treatment (Pediatrics)"
				+"\n And the Bill : 60000");
	}
   @Override
	public void generateBill(String patientName, double amount) {
		if(amount>60000) {
			System.out.println("Please Pay Remaining Amount "+(60000-amount));
		}else if(amount<60000) {
			System.out.println("remaining Bal : "+(amount-60000));
		}else {
			System.out.println("Bill is clear");
		}
		
	}
  
}
