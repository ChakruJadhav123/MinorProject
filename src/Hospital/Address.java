package Hospital;

public class Address {
  String street;
  String city;
  String state;
  long pinCode;
public Address(String street, String city, String state, long pinCode) {
	super();
	this.street = street;
	this.city = city;
	this.state = state;
	this.pinCode = pinCode;
}
@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
}
  
}
