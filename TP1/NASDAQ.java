package Environnement;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NASDAQ {
	int indice;
	public final Lock lock = new ReentrantLock();
	
	public NASDAQ(){
		indice = 4700;
	}
	
	public int getNASDAQ() {
		return this.indice;
	}

	public void setNASDAQ(int nASDAQ) {
		this.lock.lock();
		this.indice = nASDAQ;
		this.lock.unlock();
	}
}
