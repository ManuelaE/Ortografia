package hci_ortografia;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import processing.core.PApplet;

public class Sinonimos {

	private PApplet p;
	private int xS, yS, xP, yP, sins, pCurso, puntos;
	private boolean termineNivel;
	private String sinonimo_uno, sinonimo_dos, sinonimo_tres, prueba;
	private ArrayList<String> palabraEnCurso;
	private ArrayList<ArrayList> sinonimos;
	private ArrayList<String> s_uno;
	private ArrayList<String> s_dos;
	private ArrayList<String> s_tres;
	private ArrayList<String> s_guardoRandom;
	String[] palabritas;
	String[] palabrotas_uno;
	String[] palabrotas_dos;
	String[] palabrotas_tres;

	public Sinonimos(PApplet p) {
		this.p = p;

		palabraEnCurso = new ArrayList<>();
		sinonimos = new ArrayList<>();
		s_uno = new ArrayList<>();
		s_dos = new ArrayList<>();
		s_tres = new ArrayList<>();
		s_guardoRandom = new ArrayList<>();

		palabraEnCurso.add("amor");
		palabraEnCurso.add("analizar");
		palabraEnCurso.add("incomodidad");

		xS = 204;
		yS = 200;
		xP = 204;
		yP = 100;
		sins = 0;
		pCurso = 0;
		puntos = 0;

		palabritas = p.loadStrings("../data/sinonimosPorPalabra.txt");
		palabrotas_uno = palabritas[3].split(",");
		palabrotas_dos = palabritas[4].split(",");
		palabrotas_tres = palabritas[5].split(",");

		cargarPalabras();

	}

	public void pintar() {

		p.fill(255, 200, 0);
		p.textSize(30);
		p.text(puntos, 300, 50);

		p.noStroke();
		p.fill(255, 150, 0);
		p.rect(50, 400, 150, 50);
		p.rect(220, 400, 150, 50);

		String palabra = palabraEnCurso.get(pCurso);
		
		p.textAlign(p.CENTER, p.CENTER);
		p.fill(255, 200, 0);
		p.textSize(30);
		p.text(palabra, xP, yP);

		pintarSinonimos();
	}

	public void pintarSinonimos() {

		if (pCurso == 0) {

			sinonimo_uno = s_uno.get(sins);

			p.fill(255, 100, 0);
			p.textSize(30);
			p.text(sinonimo_uno, xS, yS);

		} else if (pCurso == 1) {

			sinonimo_dos = s_dos.get(sins);

			p.fill(255, 100, 0);
			p.textSize(30);
			p.text(sinonimo_dos, xS, yS);

		} else if (pCurso == 2) {

			sinonimo_tres = s_tres.get(sins);

			p.fill(255, 100, 0);
			p.textSize(30);
			p.text(sinonimo_tres, xS, yS);
		}
	}

	public void validar(boolean comprobar) {

		String palabra_1 = palabritas[pCurso];

		if (comprobar == true) {

			switch (pCurso) {
			case 0:

				if (palabra_1.contains(sinonimo_uno)) {
					puntos += 30;
				}
				break;

			case 1:

				if (palabra_1.contains(sinonimo_dos)) {
					puntos += 30;
				}
				break;

			case 2:

				if (palabra_1.contains(sinonimo_tres)) {
					puntos += 30;
				}
				break;

			}

		} else {

			switch (pCurso) {
			case 0:

				if (palabra_1.contains(sinonimo_uno) == false) {
					puntos += 30;
				}
				
				break;

			case 1:

				if (palabra_1.contains(sinonimo_dos) == false) {
					puntos += 30;
				}
				
				break;

			case 2:

				if (palabra_1.contains(sinonimo_tres) == false) {
					puntos += 30;
				}
				
				break;

			}
		}

	}

	public void validarCambio() {
		// System.out.println(p.mouseX + "," + p.mouseY);

		if (p.mouseX > 50 && p.mouseX < 199 && p.mouseY > 400 && p.mouseY < 450) {

			validar(false);

			if (sins < 19) {
				sins++;

			} else if (sins == 19) {

				if (pCurso < 3) {
					sins = 0;

					if (pCurso == 2) {
						termineNivel = true;
					} else {

						pCurso++;
					}

				}
			}

		}

		if (p.mouseX > 220 && p.mouseX < 379 && p.mouseY > 400 && p.mouseY < 450) {

			validar(true);

			if (sins < 19) {
				sins++;

			} else if (sins == 19) {

				if (pCurso < 3) {
					sins = 0;

					if (pCurso == 2) {
						termineNivel = true;
					} else {

						pCurso++;
					}
				}
			}
		}
	}

	public void cargarPalabras() {

		for (int i = 0; i < palabrotas_uno.length; i++) {

			s_uno.add(palabrotas_uno[i].trim());
			// System.out.println(palabrotas_uno[i].trim());
		}

		Collections.shuffle(s_uno);

		for (int i = 0; i < palabrotas_dos.length; i++) {

			s_dos.add(palabrotas_dos[i].trim());
			// System.out.println(palabrotas_dos[i].trim());
		}

		Collections.shuffle(s_dos);

		for (int i = 0; i < palabrotas_tres.length; i++) {

			s_tres.add(palabrotas_tres[i].trim());
			// System.out.println(palabrotas_tres[i].trim());
		}

		Collections.shuffle(s_tres);
		/*
		 * for (int i = 0; i < s_tres.size(); i++) {
		 * 
		 * System.out.println(s_tres.get(i)); }
		 */

	}

	public boolean isTermineNivel() {
		return termineNivel;
	}

	public void setTermineNivel(boolean termineNivel) {
		this.termineNivel = termineNivel;
	}
}
