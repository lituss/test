package prova;

import java.net.Socket;

public class Clients {
	private int numJugadors = 0,jugant = 0,jocs = 0;
	public Clients(int numClients){
	
}
	public synchronized void incJugadors(){
		numJugadors++;
	}
	
public class clientReceiver extends Thread{
	
}
public class client extends Thread {
	private Clients clients;
	public client(Clients clients){
		this.clients = clients;
		start();
	}
	public void run(){
		
	}
}
}
