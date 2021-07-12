package br.com.generation.polimorfismo1;

public class TestaAnimal {
	
	public static void main (String []args) {
		
	ImprimeAnimal i = new ImprimeAnimal();
	Cachorro dog1 = new Cachorro();
	Cavalo cav1 = new Cavalo();
	Preguiça pre1 = new Preguiça();
	
	dog1.nome = "Bucky";
	dog1.idade = 2; 
	
	cav1.nome = "BlueJeans";
	cav1.idade = 5;
	
	pre1.nome ="Raymond";
	pre1.idade = 7;
	
	System.out.println("Dados do cachorro:");
	System.out.println("Nome: " + dog1.nome);
	System.out.println("Idade: " + dog1.idade + " anos");
	dog1.correr();
	System.out.println("\n");
	
	System.out.println("Dados do cavalo:");
	System.out.println("Nome: " + cav1.nome);
	System.out.println("Idade: " + cav1.idade + " anos");
	cav1.correr();
	System.out.println("\n");
	
	System.out.println("Dados da preguiça:");
	System.out.println("Nome: " + pre1.nome);
	System.out.println("Idade: " + pre1.idade + " anos");
	pre1.subirArvore();
	System.out.println("\n");

	
	i.fazerAnimalEmitirSom(new Cachorro());
	i.fazerAnimalEmitirSom(new Cavalo());
	i.fazerAnimalEmitirSom(new Preguiça());
	
		
			
		
		
		
		
		
	}

}
