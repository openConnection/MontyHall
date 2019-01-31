import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	//Variables stock�es
	public static ArrayList<Integer> tableauPorte = new ArrayList<>(); //Tableau contenant les portes
	public static Integer victoire; //Nombre repr�sentant les victoires lorsque qu'on change de porte

	public static void main(String[] args) {
		
		//Remplissage du tableau avec le num�ro des portes
		tableauPorte.add(1);
		tableauPorte.add(2);
		tableauPorte.add(3);
		
		Random rand = new Random(); //Initialisation d'une fonction math�matique permettant de g�n�rer un nombre
		
		for(int i = 0; i < 1000; i++){ //Cr�ation d'une boucle qui ex�cutera le code 1000 fois
			
			Integer porte_gagnante = tableauPorte.get(rand.nextInt(tableauPorte.size())); //On nomme une porte gagnante au hasard
			Integer porte_vue = tableauPorte.get(rand.nextInt(tableauPorte.size())); //On nomme la porte qu'on va montrer au hasard
			Integer porte_choisie = tableauPorte.get(rand.nextInt(tableauPorte.size())); //On nomme la poret qu'on choisie au hasard
			
			do {
				porte_vue = tableauPorte.get(rand.nextInt(tableauPorte.size())); //Ex�cution de la condition
            } while ((porte_vue == porte_choisie) || (porte_vue == porte_gagnante)); //Si la porte montr�e ou gagnante est la m�me que celle choisie, on la renomme au hasard
			
			Integer choix_2 = ((porte_vue + porte_choisie) != 4) ? (porte_vue + porte_choisie) %4 : (porte_vue + porte_choisie)/2;
			// ? est une condition, ici en deuxi�me choix, on choisi la porte qui n'a pas �t� choisie
			if(choix_2 == porte_gagnante){
				victoire++; // Si le choix 2 est la porte gagnante, on augmente de 1 la victoire par changement de porte
			}
			System.out.println("Porte choisie : "+porte_choisie+" | Porte vue : "+porte_vue+" | Porte gagnante : "+porte_gagnante+" | Choix 2 : "+choix_2);	
			
		}
		
		System.out.println("Victoire par changement : "+victoire);
		
	}

}
