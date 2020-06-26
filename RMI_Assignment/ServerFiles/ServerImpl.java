import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class ServerImpl extends UnicastRemoteObject implements ServerInterface{

	double result;
	String output;

	public ServerImpl() throws RemoteException{

	}

	public String operation(double a, double b, String input) throws RemoteException{

		if(input.equals("add")){
			output = "Addition is: " + addition(a,b);
		}

		else if(input.equals("sub")){
			output = "Subtraction is: " + subtraction(a,b);
		}

		else if(input.equals("mul")){
			output = "Multiplication is: " + multiplication(a,b);
		}

		else if(input.equals("div")){
			output = "Division is: " + division(a,b);
		}

		return output;
	}

	public double addition(double a, double b) throws RemoteException{
		result = a + b;
		return result;
	}

	public double subtraction(double a, double b) throws RemoteException{
		result = a - b;
		return result;
	}

	public double multiplication(double a, double b) throws RemoteException{
		result = a * b;
		return result;
	}

	public double division(double a, double b) throws RemoteException{
		result = a / b;
		return result;
	}
}
