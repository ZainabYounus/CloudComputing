import java.rmi.*;

public interface  ServerInterface extends Remote{

	public String operation(double a, double b, String input) throws RemoteException;

	public double addition(double a, double b) throws RemoteException;

	public double subtraction(double a, double b) throws RemoteException;

	public double multiplication(double a, double b) throws RemoteException;

	public double division(double a, double b) throws RemoteException;
}