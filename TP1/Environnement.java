package Environnement;

public class Environnement implements Runnable {

	protected int nbre = 5;
	protected CAC_40 CAC_40;
	protected DAX DAX;
	protected Dow_Jones Dow_Jones;
	protected NASDAQ NASDAQ;
	protected NIKKEI NIKKEI;
	protected CAC_40 CAC_40_t1;
	protected DAX DAX_t1;
	protected Dow_Jones Dow_Jones_t1;
	protected NASDAQ NASDAQ_t1;
	protected NIKKEI NIKKEI_t1;

	public Environnement() {
		CAC_40 = new CAC_40();
		DAX = new DAX();
		Dow_Jones = new Dow_Jones();
		NASDAQ = new NASDAQ();
		NIKKEI = new NIKKEI();
		CAC_40_t1 = new CAC_40();
		DAX_t1 = new DAX();
		Dow_Jones_t1 = new Dow_Jones();
		NASDAQ_t1 = new NASDAQ();
		NIKKEI_t1 = new NIKKEI();
		new Thread(this).start();
	}

	public void balance() {
		if (CAC_40_t1.indice - CAC_40.indice > 0) {
			NIKKEI_t1.setNIKKEI(NIKKEI_t1.indice - nbre);
			NASDAQ_t1.setNASDAQ(NASDAQ_t1.indice - nbre);
			Dow_Jones_t1.setDow_Jones(Dow_Jones_t1.indice - nbre);
			DAX_t1.setDAX(DAX_t1.indice - nbre);
		}

		if (DAX_t1.indice - DAX.indice > 0) {
			NIKKEI_t1.setNIKKEI(NIKKEI_t1.indice - nbre);
			NASDAQ_t1.setNASDAQ(NASDAQ_t1.indice - nbre);
			Dow_Jones_t1.setDow_Jones(Dow_Jones_t1.indice - nbre);
			DAX_t1.setDAX(DAX_t1.indice - nbre);
		}

		if (Dow_Jones_t1.indice - Dow_Jones.indice > 0) {
			NIKKEI_t1.setNIKKEI(NIKKEI_t1.indice - nbre);
			NASDAQ_t1.setNASDAQ(NASDAQ_t1.indice - nbre);
			CAC_40_t1.setCAC_40(CAC_40.indice - nbre);
			DAX_t1.setDAX(DAX_t1.indice - nbre);
		}

		if (NASDAQ_t1.indice - NASDAQ.indice > 0) {
			NIKKEI_t1.setNIKKEI(NIKKEI_t1.indice - nbre);
			CAC_40_t1.setCAC_40(CAC_40.indice - nbre);
			Dow_Jones_t1.setDow_Jones(Dow_Jones_t1.indice - nbre);
			DAX_t1.setDAX(DAX_t1.indice - nbre);
		}

		if (NIKKEI_t1.indice - NIKKEI.indice > 0) {
			CAC_40_t1.setCAC_40(CAC_40.indice - nbre);
			NASDAQ_t1.setNASDAQ(NASDAQ_t1.indice - nbre);
			Dow_Jones_t1.setDow_Jones(Dow_Jones_t1.indice - nbre);
			DAX_t1.setDAX(DAX_t1.indice - nbre);
		}

	}

	public int randSubPoint() {
		return (int) (Math.random() * 50);
	}

	@Override
	public void run() {
		while (true) {
			nbre = randSubPoint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.balance();
		}
	}
}
