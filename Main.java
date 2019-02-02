import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	//Variables stockées
	public static ArrayList<Integer> tableauPorte = new ArrayList<>(); //Tableau contenant les portes
	public static Integer victoire; //Nombre représentant les victoires lorsque qu'on change de porte

	public static void main(String[] args) {
		
		//Remplissage du tableau avec le numéro des portes
		tableauPorte.add(1);
		tableauPorte.add(2);
		tableauPorte.add(3);
		
		Random rand = new Random(); //Initialisation d'une fonction mathématique "aléatoire" permettant de générer un nombre
		
		for(int i = 0; i < 1000; i++){ //Création d'une boucle qui exécutera le code 1000 fois
			
			Integer porte_gagnante = tableauPorte.get(rand.nextInt(tableauPorte.size())); //On nomme une porte gagnante au hasard
			Integer porte_vue = tableauPorte.get(rand.nextInt(tableauPorte.size())); //On nomme la porte qu'on va montrer au hasard
			Integer porte_choisie = tableauPorte.get(rand.nextInt(tableauPorte.size())); //On nomme la porte qu'on choisie au hasard
			
			do {
				porte_vue = tableauPorte.get(rand.nextInt(tableauPorte.size())); //Exécution de la condition
            } while ((porte_vue == porte_choisie) || (porte_vue == porte_gagnante)); //Si la porte montrée ou gagnante est la même que celle choisie, on la renomme au hasard
			
			Integer choix_2 = ((porte_vue + porte_choisie) != 4) ? (porte_vue + porte_choisie) %4 : (porte_vue + porte_choisie)/2;
			// ? est une condition, ici en deuxième choix, on choisi la porte qui n'a pas été choisie
			if(choix_2 == porte_gagnante){
				victoire++; // Si le choix 2 est la porte gagnante, on augmente de 1 la victoire par changement de porte
			}
			System.out.println("Porte choisie : "+porte_choisie+" | Porte vue : "+porte_vue+" | Porte gagnante : "+porte_gagnante+" | Choix 2 : "+choix_2);	
			
		}
		
		System.out.println("Victoire par changement : "+victoire);
		
	}

}
