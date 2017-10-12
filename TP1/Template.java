package Environnement;

public class Template implements Runnable {
	private int nbrIndice = 5;
	// pref = 1 CAC_40 pref = 2 DAX pref = 3 NASDAQ ...
	private int pref1;
	private int pref2;
	private int pref3;
	public int number;
	
	

	private int addpoint = randAddPoint(); //� modifier mettre randAddPoint

	public Template() {
		this.preference();
		System.out.println("pref�rences :" + pref1 + pref2 + pref3);
		new Thread(this).start();
	}

	@Override
	public void run() {
		int i=0;
			while(true){
			if ((pref1 == 0) || (pref2 == 0) || (pref3 == 0)) {
				if (Main.environnement.CAC_40.lock.tryLock()) {
					Main.environnement.CAC_40.setCAC_40(Main.environnement.CAC_40_t1.indice);
					Main.text=Main.text+"L'agent " +number+" a augmenté l'indice CAC_40\n";
					Main.environnement.CAC_40_t1.setCAC_40(Main.environnement.CAC_40_t1.indice + addpoint);
					
				}
			}

			if ((pref1 == 1) || (pref2 == 1) || (pref3 == 1)) {
				if (Main.environnement.DAX.lock.tryLock()) {
					Main.environnement.DAX.setDAX(Main.environnement.DAX_t1.indice);
					Main.text=Main.text+"L'agent " +number+" a augmenté l'indice DAX\n";
					Main.environnement.DAX_t1.setDAX(Main.environnement.DAX.indice + addpoint);
				}
			}

			if ((pref1 == 2) || (pref2 == 2) || (pref3 == 2)) {
				if (Main.environnement.Dow_Jones.lock.tryLock()) {
					Main.environnement.Dow_Jones.setDow_Jones(Main.environnement.Dow_Jones_t1.indice);
					Main.text=Main.text+"L'agent " +number+" a augmenté l'indice Dow_Jones\n";
					Main.environnement.Dow_Jones_t1.setDow_Jones(Main.environnement.Dow_Jones.indice + addpoint);
				}
			}

			if ((pref1 == 3) || (pref2 == 3) || (pref3 == 3)) {
				if (Main.environnement.NASDAQ.lock.tryLock()) {
					Main.environnement.NASDAQ.setNASDAQ(Main.environnement.NASDAQ_t1.indice);
					Main.text=Main.text+"L'agent " +number+" a augmenté l'indice NASDAQ\n";
					Main.environnement.NASDAQ_t1.setNASDAQ(Main.environnement.NASDAQ.indice + addpoint);
				}
			}

			if ((pref1 == 4) || (pref2 == 4) || (pref3 == 4)) {
				if (Main.environnement.NIKKEI.lock.tryLock()) {
					Main.environnement.NIKKEI.setNIKKEI(Main.environnement.NIKKEI_t1.indice);
					Main.text=Main.text+"L'agent " +number+" a augmenté l'indice NIKKEI\n";
					Main.environnement.NIKKEI_t1.setNIKKEI(Main.environnement.NIKKEI.indice + addpoint);
				}
			}
		
//		System.out.println("CAC40 : " + Main.environnement.CAC_40_t1.indice);
//		System.out.println("DAX : " + Main.environnement.DAX_t1.indice);
//		System.out.println("NIKKEI : " + Main.environnement.NIKKEI_t1.indice);
//		System.out.println("NASDAQ : " + Main.environnement.NASDAQ_t1.indice);
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addpoint = randAddPoint();
		i++;
		if(i==4){Main.text="";
		i=0;}
		
	}
	}

	public void preference() {

		pref1 = (int) (Math.random() * nbrIndice);

		do {
			pref2 = (int) (Math.random() * nbrIndice);
		} while (pref1 == pref2);

		do {
			pref3 = (int) (Math.random() * nbrIndice);
		} while ((pref3 == pref2) || (pref3 == pref1));

	}
	
	public int randAddPoint(){
		return (int) ((Math.random() * 30) + 50);
	}
}
