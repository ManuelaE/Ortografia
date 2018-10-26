package hci_ortografia;

import processing.core.PApplet;

public class Homofonas {

	private PApplet p;
	private String[] homo;
	private int casos;

	public Homofonas(PApplet p) {
		this.p = p;

		homo = p.loadStrings("../data/homofonas.txt");
		casos = 0;
	}

	public void pintar() {

		switch (casos) {
		case 0:
			
			p.textAlign(p.CENTER, p.CENTER);
			p.fill(255, 200, 0);
			p.textSize(17);
			p.text(homo[0] + "\n" + homo[1] + "\n" + homo[2] + "\n" + homo[3] + "\n" + homo[4], 204, 265);
			
			break;

		case 1:
			
			p.textAlign(p.CENTER, p.CENTER);
			p.fill(255, 200, 0);
			p.textSize(17);
			p.text(homo[5] + "\n" + homo[6] + "\n" + homo[7] + "\n" + homo[8] + "\n" + homo[9], 204, 265);

			break;

		case 2:
			
			p.textAlign(p.CENTER, p.CENTER);
			p.fill(255, 200, 0);
			p.textSize(17);
			p.text(homo[10] + "\n" + homo[11] + "\n" + homo[12] + "\n" + homo[13] + "\n" + homo[14], 204, 265);

			break;

		}

	}

	public void elegir() {
		// System.out.println(p.mouseX + "," + p.mouseY);

	}
}
