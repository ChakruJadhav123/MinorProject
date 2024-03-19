package Hospital;

public class Cardiology implements HospitalInterface {
	@Override
	public void admitPatient(String patientName, Address address) {
       	System.out.println("Patient Admitted :"+patientName);
       	System.out.println("Address :"+address);
	}
	@Override
	public void provideTreatment(String patientName) {
		System.out.println(patientName+" is Getting Treatment (Cardiology)"+"\n And the Bill :10000");
	}
    @Override
	public void generateBill(String patientName, double amount) {
		if(amount<10000) {
			System.out.println("Please pay Remaining Amount "+(10000-amount));
		}else if(amount > 10000) {
			System.out.println("Remainig Bal :"+(amount-10000));
		}else {
			System.out.println("Bill is Clear");
		}
	}
}
