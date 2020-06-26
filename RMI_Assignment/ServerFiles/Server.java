import java.rmi.*;

class Server{
	public static void main(String args []){
		try{
			System.setProperty("java.rmi.server.hostname", "172.17.216.81");
			Naming.rebind("rmi://localhost/FirstServer", new ServerImpl());
			System.out.println("Server is Ready");
		}
		catch(Exception e){
			System.out.println("Server Failed!!: " + e);
		}
	}
}