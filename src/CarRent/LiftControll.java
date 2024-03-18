package CarRent;
import java.util.*;

public class LiftControll {
     int maxFloar;
     int currentFloar;
     public LiftControll(int maxFloar) {
		this.maxFloar=maxFloar;
		this.currentFloar=1;
     }
     void moveLift(int target) {
    	 if(target>maxFloar || target <currentFloar) {
    		 System.out.println("Invalid floar");
    	 }
    	 if(target==currentFloar) {
    		 System.out.println("lift is currenlty on "+currentFloar);  
    		 return;
    	 }
    	
    	System.out.println("Lift is at"+target);
    	currentFloar=target;
     }
     public void openDoor(){
    	 System.out.println("Door are opening on "+currentFloar);
     }
     public void closeDoor() {
    	 System.out.println("Door are closing on "+currentFloar);
     }
     public void cuurentFloor() {
    	 System.out.println("Lift is at Floor "+currentFloar);
     }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers floors in building");
		int flooar=sc.nextInt();
		
		LiftControll obj = new LiftControll(flooar);
		while(true) {
			System.out.println("\nOptions:");
			System.out.println("1. Move lift to a specific floor");
			System.out.println("2. Open doors");
			System.out.println("3. Close doors");
			System.out.println("4. Print current floor");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter target floor: ");
				int targetFloor = sc.nextInt();
				obj.moveLift(targetFloor);
				break;
				
			case 2:
				obj.closeDoor();
				break;
				
			case 3:
				obj.openDoor();
				break;
			
			case 4:
				obj.cuurentFloor();
				break;
				
			case 5:
				System.out.println("Exiting program...");
				System.exit(0);
				
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
	}

}
