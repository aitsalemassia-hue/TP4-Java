package com.example.tp;

public class Main {
	public static void main(String[] args) {
		/*Création de deux étudiants
		Etudiant e1 = new Etudiant("Salim", "Amina");
		Etudiant e2 = new Etudiant("Martin", "Ali");
		Etudiant e3 = new Etudiant("Ait salem", "Assiya");
		Etudiant e4 = new Etudiant("Alami", "Salwa");

		//Ajout de notes
		e1.ajouterNote(14.5);
		e1.ajouterNote(12.0);
		e1.ajouterNote(16.0);
		e2.ajouterNote(10.0);
		e2.ajouterNote(13.5);
		e3.ajouterNote(17.0);
		e3.ajouterNote(10.0);
		e3.ajouterNote(14.0);
		e3.ajouterNote(12.0);
		e4.ajouterNote(10.0);
		e4.ajouterNote(13.0);*/

		// Affichage des notes et moyennes
		/*e1.afficherNotes();
		System.out.println(e1);

		e2.afficherNotes();
		System.out.println(e2);
		e3.afficherNotes();
		System.out.println(e3);
		e4.afficherNotes();
		System.out.println(e4);

		System.out.println("avant la suppression :");
		e3.afficherNotes();
		e3.supprimerDerniereNote();
		System.out.println("apres la suppression :");
		e3.afficherNotes();

		System.out.println("avant le tri  :");
		e3.afficherNotes();
		e3.triNotes(e3.getNotes());
		System.out.println("apres le tri :");
		e3.afficherNotes();*/
		
		 // 1. Création des filières
        Filiere info   = new Filiere("Informatique");
        Filiere genie  = new Filiere("Génie Civil");

        // 2. Création des étudiants (noms marocains)
        Etudiant e1 = new Etudiant("El Idrissi", "Mohamed");
        Etudiant e2 = new Etudiant("Bentaleb", "Fatima");
        Etudiant e3 = new Etudiant("Chouaib",   "Youssef");
        Etudiant e4 = new Etudiant("Lahlou",    "Salma");
        Etudiant e5 = new Etudiant("Roussafi",  "Hassan");
        Etudiant e6 = new Etudiant("Amrani",    "Aïcha");

        // 3. Association étudiants ↔ filières
        info.ajouterEtudiant(e1);
        info.ajouterEtudiant(e2);
        info.ajouterEtudiant(e3);
        info.ajouterEtudiant(e4);
        info.ajouterEtudiant(e5);
        // force l’agrandissement du tableau
        info.ajouterEtudiant(e6);

        genie.ajouterEtudiant(new Etudiant("Belkahia", "Khadija"));
        genie.ajouterEtudiant(new Etudiant("Laaroussi","Walid"));

        // 4. Affichage
        System.out.println(info);
        info.afficherEtudiants();
        System.out.println();

        System.out.println(genie);
        genie.afficherEtudiants();
        System.out.println();

        // 5. Détail d’un étudiant
        System.out.println("Détail de e3 : " + e3);
	
	    
	}
}
