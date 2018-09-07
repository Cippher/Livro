import java.util.Scanner;

//Create by 0196611
//Vinícius Daniel Neuenfeldt Barros

public class Colecao {

	public static void main(String[] args) {
		
		int menu;
		Scanner scanner = new Scanner(System.in);
		
		
		LivroEletronico[] vetLivroEletronico = new LivroEletronico[5];
		LivroFisico[] vetLivroFisico = new LivroFisico[5];
		Autor[] vetAutor = new Autor[5];
		
		vetAutor[0] = new Autor("Davi Rosa", "O cara e bom", vetLivroFisico[4]);
		vetAutor[1] = new Autor("Ana Paula", "Escritora e programadora", vetLivroFisico[1]);
		vetAutor[2] = new Autor("Monique Nogueira", "Girl power", vetLivroFisico[2]);
		vetAutor[3] = new Autor("Junior Barros", "Programador nato", vetLivroFisico[3]);
		vetAutor[4] = new Autor("Vinicius Daniel", "Iniciante", vetLivroFisico[0]);
		
		vetLivroFisico[0] = new LivroFisico(000, 300.00, 2015, 352, "Java para novatos", "0973468126475", 1.65, vetAutor[4]);
		vetLivroFisico[1] = new LivroFisico(001, 90.49, 2010, 120, "Java o retorno", "0349826511075", 0.90, vetAutor[1]);
		vetLivroFisico[2] = new LivroFisico(002, 25.90, 2005, 121, "C para noobs", "6458003179456", 0.75, vetAutor[2]);
		vetLivroFisico[3] = new LivroFisico(003, 19.90, 2000, 89, "POA vs Python", "0035121379526", 0.59, vetAutor[3]);
		vetLivroFisico[4] = new LivroFisico(004, 249.90, 2017, 260, "HTML5", "3345780021065", 1.30, vetAutor[0]);
		
		
		vetLivroEletronico[0] = new LivroEletronico(111, 5.90, 2000, 326, "Java", "0132542198201", "PDF");
		vetLivroEletronico[1] = new LivroEletronico(222, 9.90, 2010, 420, "Algoritmos", "8876503154753", "PDF");
		vetLivroEletronico[2] = new LivroEletronico(333, 15.49, 2015, 612, "Logica para todos", "030305487998", "PDF");
		vetLivroEletronico[3] = new LivroEletronico(444, 8.90, 20005, 190, "Programacao na infancia", "321485001200", "PDF");
		vetLivroEletronico[4] = new LivroEletronico(000, 300.00, 2015, 352, "Java para novatos", "0973468126475", "PDF");
		
		
		do{
		System.out.printf("\n===> Menu de Consulta <===\n");
		System.out.printf("1 para consulta por codigo:\n");
		System.out.printf("2 para consulta por ISBN: \n");
		System.out.printf("3 para consulta por ano: \n");
		System.out.printf("4 para sair: ");
		menu = scanner.nextInt();
		
		String x = scanner.nextLine();
		
		
		
		
		switch (menu){
		case 1:
			System.out.printf("Digite o codigo do livro desejado: ");
			int cod = scanner.nextInt();
			for(int i=0; i<5; i++){
				if(cod == vetLivroFisico[i].getCodigo()){
					System.out.printf("\n>>>Livro Fisico!<<<");
					System.out.printf("\nTitulo do livro:%s\nAno:%d\nNumero de paginas:%d\nPreco:%.2f\nPeso:%.2f\nAutor:%s\nBiografia do Autor:%s\nISBN:%s\n", 
						vetLivroFisico[i].getTitulo(),
						vetLivroFisico[i].getAno(),
						vetLivroFisico[i].getNpaginas(),
						vetLivroFisico[i].getPreco(),
						vetLivroFisico[i].getPeso(),
						vetAutor[i].getNome(),
						vetAutor[i].getBiografia(),
						vetLivroFisico[i].getIsbn());
			}
				if(cod == vetLivroEletronico[i].getCodigo()){
					System.out.printf("\n>>>Livro Eletronico!<<<");
					System.out.printf("\nTitulo do livro:%s\nAno:%d\nNumero de paginas:%d\nPreco:%.2f\nISBN:%s\n",
							vetLivroEletronico[i].getTitulo(),
							vetLivroEletronico[i].getAno(),
							vetLivroEletronico[i].getNpaginas(),
							vetLivroEletronico[i].getPreco(),
							vetLivroEletronico[i].getIsbn());	
				}
			}
			break;
		case 2:
			System.out.printf("Digite o isbn do livro desejado: ");
			String isbn = scanner.nextLine();
			for(int i=0; i<5; i++){
				if(isbn.equalsIgnoreCase(vetLivroFisico[i].getIsbn())){
					System.out.printf("\n>>>Livro Fisico!<<<");
					System.out.printf("\nTitulo do livro:%s\nAno:%d\nNumero de paginas:%d\nPreco:%.2f\nPeso:%.2f\nAutor:%s\nBiografia do Autor:%s\nISBN:%s\n", 
						vetLivroFisico[i].getTitulo(),
						vetLivroFisico[i].getAno(),
						vetLivroFisico[i].getNpaginas(),
						vetLivroFisico[i].getPreco(),
						vetLivroFisico[i].getPeso(),
						vetAutor[i].getNome(),
						vetAutor[i].getBiografia(),
						vetLivroFisico[i].getIsbn());
			}
				if(isbn.equalsIgnoreCase(vetLivroFisico[i].getIsbn())){
					System.out.printf("\n>>>Livro Eletronico!<<<");
					System.out.printf("\nTitulo do livro:%s\nAno:%d\nNumero de paginas:%d\nPreco:%.2f\nISBN:%s\n",
							vetLivroEletronico[i].getTitulo(),
							vetLivroEletronico[i].getAno(),
							vetLivroEletronico[i].getNpaginas(),
							vetLivroEletronico[i].getPreco(),
							vetLivroEletronico[i].getIsbn());	
				}
			}
			break;
		case 3:
			System.out.printf("Digite o ano do livro desejado: ");
			int ano = scanner.nextInt();
			for(int i=0; i<5; i++){
			if(ano == vetLivroFisico[i].getAno()){
				System.out.printf("\nTitulo do livro:%s\nAno:%d\nNumero de paginas:%d\nPreco:%.2f\nPeso:%.2f\nAutor:%s\nBiografia do Autor:%s\nISBN:%s\n", 
						vetLivroFisico[i].getTitulo(),
						vetLivroFisico[i].getAno(),
						vetLivroFisico[i].getNpaginas(),
						vetLivroFisico[i].getPreco(),
						vetLivroFisico[i].getPeso(),
						vetAutor[i].getNome(),
						vetAutor[i].getBiografia(),
						vetLivroFisico[i].getIsbn());
			}
			if(ano == vetLivroEletronico[i].getAno()){
				System.out.printf("\nTitulo do livro:%s\nAno:%d\nNumero de paginas:%d\nPreco:%.2f\nISBN:%s\n",
						vetLivroEletronico[i].getTitulo(),
						vetLivroEletronico[i].getAno(),
						vetLivroEletronico[i].getNpaginas(),
						vetLivroEletronico[i].getPreco(),
						vetLivroEletronico[i].getIsbn());	
			}
			}
			
			break;

		}
		}while(menu != 4);
		scanner.close();
	
		}

}
