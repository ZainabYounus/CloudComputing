import java.rmi.*;
import java.util.*;

class Client{
	public static void main (String args []){

		ServerInterface server;

		try{
			server = (ServerInterface)Naming.lookup("rmi://172.17.216.81/FirstServer");

			Scanner input = new Scanner(System.in);
			System.out.println("Enter first number:");
			double firstNum = Double.parseDouble(input.nextLine());

			System.out.println("Enter second number:");
			double secondNum = Double.parseDouble(input.nextLine());

			System.out.println("Enter operation from options: (add, sub, mul, div)");
			String op = input.nextLine();

			System.out.println(server.operation(firstNum, secondNum, op));
		}
		catch(Exception e){
			System.out.println("Client Exception: " + e);
		}
	}
}