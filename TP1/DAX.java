package Environnement;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DAX {
	int indice;
	public final Lock lock = new ReentrantLock();
	
	public DAX(){
		indice = 10400;
	}
	
	public int getDAX() {
		return indice;
	}

	public void setDAX(int dAX) {
		this.lock.lock();
		this.indice = dAX;
		this.lock.unlock();
	}
}
