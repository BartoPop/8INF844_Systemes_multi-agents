package Environnement;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CAC_40 {
	int indice;
	public final Lock lock = new ReentrantLock();
	public CAC_40(){
		indice = 4500;
	}
	
	public int getCAC_40() {
		return indice;
	}

	public void setCAC_40(int cAC_40) {
		this.lock.lock();
		this.indice = cAC_40;
		this.lock.unlock();
	}
}
