package Hospital;

public class MainForHospital {

	public static void main(String[] args) {
		Pediatrics hospital = new Pediatrics();
		Address address = new Address("amp", "hyd", "tel", 01010);
		Patient pat = new Patient("John", address, hospital);
		pat.treatMent();
		pat.getBill(10000);
	}

}
