package hci_ortografia;

import processing.core.PApplet;
import processing.core.PImage;

public class NivelDos {

	private PApplet p;
	private PImage n3_1, n3_2, n3_3, n3_4, n3_5, n3_6, n3_7, n3_8, n3_9, n3_10;
	private PImage n3_11, n3_12, n3_13, n3_14, n3_15, n3_16, n3_17, n3_18, n3_19;
	private PImage n3_20, n3_21, n3_22, n3_23, n3_24;
	private int pantallas, vef, vv, bb1, bb2, bb3, opc1, opc2, opc3, caso, z1, z2, z3, o1, o2, o3, v1, v2, v3;
	private boolean opciones, opciones2, z_uno, z_dos, z_tres, verificar;
	String uno, dos, tres;

	public NivelDos(PApplet p) {
		this.p = p;

		cargarFotos();

		pantallas = 0;
		vef = 0;
		caso = 0;
		bb1 = 0;
		bb2 = 0;
		bb3 = 0;
		z1 = 0;
		z2 = 0;
		z3 = 0;
		o1 = 0;
		o2 = 0;
		o3 = 0;
		v1 = 0;
		v2 = 0;
		v3 = 0;
		opciones = false;
		opciones2 = false;
		z_uno = false;
		z_dos = false;
		z_tres = false;
		verificar = false;
		uno = "hay";
		dos = "ay";
		tres = "ahí";

	}

	public void pintar() {

		switch (pantallas) {

		case 0:
			p.image(n3_1, 0, 0);
			break;

		case 1:
			p.image(n3_2, 0, 0);
			break;

		case 2:
			p.image(n3_3, 0, 0);
			break;

		case 3:
			p.image(n3_4, 0, 0);
			break;

		case 4:
			p.image(n3_6, 0, 0);
			break;

		case 5:
			p.image(n3_5, 0, 0);
			juego();
			break;

		}
	}

	public void juego() {

		if (opciones == true) {

			p.image(n3_8, 0, 0);

			if (z1 == 1 && z2 == 1 && z3 == 1) {
				p.image(n3_7, 0, 0);
			}
		}


		texto();
		verificar();
		ganar();
		
		if (opciones2 == true) {
			p.image(n3_24, 0, 0);
		}
	}

	public void texto() {

		if (opc1 == 1) {
			p.textAlign(p.CENTER, p.CENTER);
			p.fill(255);
			p.textSize(18);
			p.text(uno, 108, 286);
			o1 = 1;
		} else if (opc1 == 2) {
			p.textAlign(p.CENTER, p.CENTER);
			p.fill(255);
			p.textSize(18);
			p.text(dos, 108, 286);
			o1 = 1;
		} else if (opc1 == 3) {
			p.textAlign(p.CENTER, p.CENTER);
			p.fill(255);
			p.textSize(18);
			p.text(tres, 108, 286);
			o1 = 1;
		}

		if (opc2 == 4) {
			p.textAlign(p.CENTER, p.CENTER);
			p.fill(255);
			p.textSize(18);
			p.text(uno, 286, 313);
			o2 = 1;
		} else if (opc2 == 5) {
			p.textAlign(p.CENTER, p.CENTER);
			p.fill(255);
			p.textSize(18);
			p.text(dos, 286, 313);
			o2 = 1;
		} else if (opc2 == 6) {
			p.textAlign(p.CENTER, p.CENTER);
			p.fill(255);
			p.textSize(18);
			p.text(tres, 286, 313);
			o2 = 1;

		}

		if (opc3 == 7) {
			p.textAlign(p.CENTER, p.CENTER);
			p.fill(255);
			p.textSize(18);
			p.text(uno, 191, 393);
			o3 = 1;
		} else if (opc3 == 8) {
			p.textAlign(p.CENTER, p.CENTER);
			p.fill(255);
			p.textSize(18);
			p.text(dos, 191, 393);
			o3 = 1;
		} else if (opc3 == 9) {
			p.textAlign(p.CENTER, p.CENTER);
			p.fill(255);
			p.textSize(18);
			p.text(tres, 191, 393);
			o3 = 1;
		}

	}

	public void verificar() {

		if (vv == 1) {
			if (opc1 == 3) {
				p.fill(0, 255, 0);
				p.textAlign(p.CENTER, p.CENTER);
				p.textSize(18);
				p.text(tres, 108, 286);

			} else if (opc1 == 1) {
				p.fill(255, 0, 0);
				p.textAlign(p.CENTER, p.CENTER);
				p.textSize(18);
				p.text(uno, 108, 286);

			} else if (opc1 == 2) {
				p.fill(255, 0, 0);
				p.textAlign(p.CENTER, p.CENTER);
				p.textSize(18);
				p.text(dos, 108, 286);
			}

			if (opc2 == 6) {
				p.fill(0, 255, 0);
				p.textAlign(p.CENTER, p.CENTER);
				p.textSize(18);
				p.text(tres, 286, 313);

			} else if (opc2 == 4) {
				p.fill(255, 0, 0);
				p.textAlign(p.CENTER, p.CENTER);
				p.textSize(18);
				p.text(uno, 286, 313);

			} else if (opc2 == 5) {
				p.fill(255, 0, 0);
				p.textAlign(p.CENTER, p.CENTER);
				p.textSize(18);
				p.text(dos, 286, 313);
			}

			if (opc3 == 7) {
				p.fill(0, 255, 0);
				p.textAlign(p.CENTER, p.CENTER);
				p.textSize(18);
				p.text(uno, 191, 393);
			} else if (opc3 == 8) {
				p.fill(255, 0, 0);
				p.textAlign(p.CENTER, p.CENTER);
				p.textSize(18);
				p.text(dos, 191, 393);

			} else if (opc3 == 9) {
				p.fill(255, 0, 0);
				p.textAlign(p.CENTER, p.CENTER);
				p.textSize(18);
				p.text(tres, 191, 393);
			}
			opciones = false;
			opciones2 = true;
			//System.out.println(opciones);
			

		}
	}

	public void ganar() {
		if (bb1 == 1) {
			// 3 estrellas
			if (opc1 == 3 && opc2 == 6 && opc3 == 7) {
				p.image(n3_20, 0, 0);
			}

			// 2 estrellas
			if (opc1 == 3 && opc2 == 6 && opc3 != 7) {
				p.image(n3_21, 0, 0);
			}

			if (opc1 == 3 && opc2 != 6 && opc3 == 7) {
				p.image(n3_21, 0, 0);
			}

			if (opc1 != 3 && opc2 == 6 && opc3 == 7) {
				p.image(n3_21, 0, 0);
			}

			// 1 estrella
			if (opc1 == 3 && opc2 != 6 && opc3 != 7) {
				p.image(n3_22, 0, 0);
			}

			if (opc1 != 3 && opc2 == 6 && opc3 != 7) {
				p.image(n3_22, 0, 0);
			}

			if (opc1 != 3 && opc2 != 6 && opc3 == 7) {
				p.image(n3_22, 0, 0);
			}

			// 0 estrella
			if (opc1 != 3 && opc2 != 6 && opc3 != 7 && opc1 != 0 && opc2 != 0 && opc3 != 0) {
				p.image(n3_23, 0, 0);
			}
		}
	}

	public void zonasS() {

		switch (pantallas) {

		case 0:

			if (p.mouseX > 79 && p.mouseX < 561 && p.mouseY > 316 && p.mouseY < 602) {
				pantallas = 1;
			}
			break;

		case 1:
			if (p.mouseX > 79 && p.mouseX < 561 && p.mouseY > 316 && p.mouseY < 602) {
				pantallas = 2;
			}
			break;

		case 2:
			if (p.mouseX > 79 && p.mouseX < 561 && p.mouseY > 316 && p.mouseY < 602) {
				pantallas = 3;
			}
			break;

		case 3:
			if (p.mouseX > 79 && p.mouseX < 561 && p.mouseY > 316 && p.mouseY < 602) {
				pantallas = 4;
			}
			break;

		case 4:
			if (p.mouseX > 79 && p.mouseX < 561 && p.mouseY > 316 && p.mouseY < 602) {
				pantallas = 5;
				opciones = true;
			}
			break;

		case 5:

			if (opciones = true) {

				if (p.mouseX > 74 && p.mouseX < 142 && p.mouseY > 272 && p.mouseY < 298) {
					caso = 1;
					z1 = 1;
				}

				if (p.mouseX > 255 && p.mouseX < 324 && p.mouseY > 300 && p.mouseY < 324) {
					caso = 2;
					z2 = 1;
				}

				if (p.mouseX > 155 && p.mouseX < 226 && p.mouseY > 381 && p.mouseY < 405) {
					caso = 3;
					z3 = 1;
				}

				eleccion();

				if (p.mouseX > 118 && p.mouseX < 278 && p.mouseY > 443 && p.mouseY < 478) {
					// verificar = true;
					vv = 1;
				}

			}

			if (opciones2 == true) {
				if (p.mouseX > 79 && p.mouseX < 561 && p.mouseY > 316 && p.mouseY < 602) {
					bb1 = 1;
				}
			}
			break;

		}
	}

	public void eleccion() {
		if (caso == 1) {
			if (p.mouseX > 33 && p.mouseX < 133 && p.mouseY > 562 && p.mouseY < 606) {
				opc1 = 1;

			}

			if (p.mouseX > 146 && p.mouseX < 248 && p.mouseY > 562 && p.mouseY < 606) {
				opc1 = 2;
			}

			if (p.mouseX > 263 && p.mouseX < 364 && p.mouseY > 562 && p.mouseY < 606) {
				opc1 = 3;
			}

		}

		if (caso == 2) {
			if (p.mouseX > 33 && p.mouseX < 133 && p.mouseY > 562 && p.mouseY < 606) {
				opc2 = 4;
			}

			if (p.mouseX > 146 && p.mouseX < 248 && p.mouseY > 562 && p.mouseY < 606) {
				opc2 = 5;
			}

			if (p.mouseX > 263 && p.mouseX < 364 && p.mouseY > 562 && p.mouseY < 606) {
				opc2 = 6;
			}
		}

		if (caso == 3) {
			if (p.mouseX > 33 && p.mouseX < 133 && p.mouseY > 562 && p.mouseY < 606) {
				opc3 = 7;
			}

			if (p.mouseX > 146 && p.mouseX < 248 && p.mouseY > 562 && p.mouseY < 606) {
				opc3 = 8;
			}

			if (p.mouseX > 263 && p.mouseX < 364 && p.mouseY > 562 && p.mouseY < 606) {
				opc3 = 9;
			}
		}

	}

	public void cargarFotos() {

		n3_1 = p.loadImage("../data/n3/n3_1.jpg");
		n3_2 = p.loadImage("../data/n3/n3_2.jpg");
		n3_3 = p.loadImage("../data/n3/n3_3.jpg");
		n3_4 = p.loadImage("../data/n3/n3_4.jpg");
		n3_5 = p.loadImage("../data/n3/n3_5.jpg");
		n3_6 = p.loadImage("../data/n3/n3_6.jpg");
		n3_7 = p.loadImage("../data/n3/n3_7.png");
		n3_8 = p.loadImage("../data/n3/n3_8.png");
		n3_9 = p.loadImage("../data/n3/n3_9.jpg");
		n3_10 = p.loadImage("../data/n3/n3_10.jpg");
		n3_11 = p.loadImage("../data/n3/n3_11.jpg");
		n3_12 = p.loadImage("../data/n3/n3_12.jpg");
		n3_13 = p.loadImage("../data/n3/n3_13.jpg");
		n3_14 = p.loadImage("../data/n3/n3_14.jpg");
		n3_15 = p.loadImage("../data/n3/n3_15.jpg");
		n3_16 = p.loadImage("../data/n3/n3_16.png");
		n3_17 = p.loadImage("../data/n3/n3_17.png");
		n3_18 = p.loadImage("../data/n3/n3_18.png");
		n3_19 = p.loadImage("../data/n3/n3_19.png");
		n3_20 = p.loadImage("../data/n3/n3_20.png");
		n3_21 = p.loadImage("../data/n3/n3_21.png");
		n3_22 = p.loadImage("../data/n3/n3_22.png");
		n3_23 = p.loadImage("../data/n3/n3_23.png");
		n3_24 = p.loadImage("../data/n3/n3_24.png");

	}
}
