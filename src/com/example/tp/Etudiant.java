package com.example.tp;

import java.util.Arrays;

public class Etudiant {
	private static int compteur = 0;
	private final int id;
	private String nom;
	private String prenom;
	//private double[] notes;
	//private int nbNotes;
	private Filiere filiere;

	public Etudiant(String nom, String prenom) {
		this.id = ++compteur;
		this.nom = nom;
		this.prenom = prenom;
		//this.notes = new double[5];
		//this.nbNotes = 0;
	}

	/*/ gerant la capacité de stockage si le tableau est plein.
	public void ajouterNote(double note) {
		if (nbNotes == notes.length) {
			double[] tmp = new double[notes.length * 2];
			System.arraycopy(notes, 0, tmp, 0, notes.length);
			notes = tmp;
		}
		notes[nbNotes++] = note;
	}

	// calcule du moyenne
	public double calculerMoyenne() {
		if (nbNotes == 0)
			return 0.0;
		double somme = 0;
		for (int i = 0; i < nbNotes; i++) {
			somme += notes[i];
		}
		return somme / nbNotes;
	}

	// suppression de la derniere note
	public void supprimerDerniereNote() {
		if (nbNotes == 0) {
			System.out.println("aucun note a supprimee");
			return;
		}
		nbNotes--;

	}

	// Faire un affichage lisible
	public void afficherNotes() {
		System.out.print("Notes de " + nom + " " + prenom + " : ");
		for (int i = 0; i < nbNotes; i++) {
			System.out.print(notes[i]);
			if (i < nbNotes - 1)
				System.out.print(", ");
		}
		System.out.println();
	}

	//
	public void triNotes(double[] notes) {
		for (int i = 1; i < nbNotes; i++) {
			for (int j = 0; j < nbNotes - i; j++) {
				if (notes[j] > notes[j + 1]) {
					double tmp = notes[j];
					notes[j] = notes[j + 1];
					notes[j + 1] = tmp;
				}
			}
		}
	}*/

	 public void setFiliere(Filiere f) {
	        this.filiere = f;
	    }
	 	
	   /* public double[] getNotes() {
		return notes;
	}*/

	

		public int getId() { return id; }
	    public String getNom() { return nom; }
	    public String getPrenom() { return prenom; }
	    public Filiere getFiliere() { return filiere; }
	@Override
	public String toString() {
		String fil = (filiere != null) ? filiere.getNom() : "Aucune";
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom +", filière=" + fil + "]";
	}

}
