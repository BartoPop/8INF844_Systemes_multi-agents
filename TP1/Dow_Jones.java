package Environnement;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Dow_Jones {
	int indice;
	public final Lock lock = new ReentrantLock();
	
	public Dow_Jones(){
		indice = 17500;
	}

	public int getDow_Jones() {
		return indice;
	}

	public void setDow_Jones(int dow_Jones) {
		this.lock.lock();
		this.indice = dow_Jones;
		this.lock.unlock();
	}
}
