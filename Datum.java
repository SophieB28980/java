public class Datum {

	private int dag;
	private int maand;
	private int jaar;

	/**
	 * Constructor
	 */
	public Datum(dag, maand, jaar) {
		bestaatDatum(dag, maand, jaar);
		if (bestaatDatum(dag, maand, jaar) == true) {
			this.dag;
			this.maand;
			this.jaar;
		}
		else {
			dag = 0;
			maand = 0;
			jaar = 0;
			this.dag;
			this.maand;
			this.jaar;
		}
	}

	public Datum() {
		dag = 0;
		maand = 0;
		jaar = 0;
		this.dag;
		this.maand;
		this.jaar;
	}

	private void setDag(dag) {
		this.dag;
	}

	private void setMaand(maand) {
		this.maand;
	}

	private void setJaar(jaar) {
		this.jaar;
	}

	public boolean bestaatDatum(int dag, int maand, int jaar) {
		int truthCounter = 0;
		if (dag >= 1 && dag <= 31) {
			truthCounter++;
		}
		if (maand >= 1 && maand <= 12) {
			truthCounter++;
		}
		if (jaar >= 1900 && jaar <= 2100) {
			truthCounter++;
		}
		if (maand == 1 || maand == 3 || maand == 5 || maand == 7 || maand == 8 || maand == 10 || maand == 12 && dag <= 31) {
			truthCounter++
		}
		if (maand == 4 || maand == 6 || maand == 9 || maand == 11 && dag <= 30) {
			truthCounter++
		}
		if (maand == 2 && jaar/100 != instanceOf Integer || jaar/400 == instanceOf Integer && jaar/4 == instanceOf Integer && dag <=29) {
			truthCounter++
		}
		if (maand == 2 && jaar/4 != instanceOf Integer && dag <= 28) {
			truthCounter++
		}

		if (truthCounter == 4) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Getter voor Sting weergave van datum
	 *
	 * @return Geboortedatum
	 */
	public String getDatumAsString() {
		String datum = dag + "-" + maand + "-" + jaar;
		return datum;
	}
}
