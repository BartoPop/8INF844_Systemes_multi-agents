package Environnement;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NIKKEI {
	int indice;
	public final Lock lock = new ReentrantLock();
	
	public NIKKEI(){
		indice = 17300;
	}
	
	public int getNIKKEI() {
		return this.indice;
	}

	public void setNIKKEI(int nIKKEI) {
		this.lock.lock();
		this.indice = nIKKEI;
		this.lock.unlock();
	}
}
