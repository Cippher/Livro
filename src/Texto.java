import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

// Create by 0196611
// Vinícius Daniel Neuenfeldt Barros

public class Texto extends JFrame{
	
	private static final long serialVersionUID = 7526472295622776147L;
	
	private JTextField fixa, caixa, caixa2, caixa3;
	private JButton exibe, exibe2, exibe3;
	int an, i;
	//int cod;
	String isb;
	
	public Texto(){
		
		super("Pesquisas");
		setLayout(new FlowLayout());
		
		
		fixa = new JTextField("Tipos de pesquisa");
		fixa.setEditable(false);
		add(fixa);

		
		JLabel codigo = new JLabel("Codigo");
		add(codigo);
		caixa=new JTextField(20);
		add(caixa);
		
		JLabel ano = new JLabel("Ano");
		add(ano);
		caixa3=new JTextField(20);
		add(caixa3);
		
		JLabel isbn = new JLabel("ISBN");
		add(isbn);
		caixa2=new JTextField(20);
		add(caixa2);
	
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
		
		//caixa.setText(String.valueOf(cod));
		//int cod = Integer.parseInt(caixa.getText());
		
		exibe = new JButton("Procurar por Codigo");
		exibe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento){
				int cod = Integer.parseInt(caixa.getText());
				if(evento.getSource() == exibe){
					for(i=0; i<5; i++){
					if(cod == vetLivroFisico[i].getCodigo()){
						JOptionPane.showMessageDialog(null, "LIVRO FISICO\nTitulo do livro: " + vetLivroFisico[i].getTitulo() + "\nAno: " +vetLivroFisico[i].getAno()+ "\nNumero de paginas: " +vetLivroFisico[i].getNpaginas()+ "\nPreco: "+vetLivroFisico[i].getPreco()+"\nPeso: "+vetLivroFisico[i].getPeso()+"\nAutor: "+vetAutor[i].getNome()+"\nBiografia do Autor: "+vetAutor[i].getBiografia()+"\nISBN: "+vetLivroFisico[i].getIsbn());
					}
					if(cod == vetLivroEletronico[i].getCodigo()){
						JOptionPane.showMessageDialog(null, "LIVRO ELETRONICO\nTitulo do livro: " + vetLivroEletronico[i].getTitulo() + "\nAno: "+vetLivroEletronico[i].getAno()+"\nNumero de paginas: " + vetLivroEletronico[i].getNpaginas() + "\nPreco: "+vetLivroEletronico[i].getPreco()+"\nISBN: "+vetLivroEletronico[i].getIsbn());
					}
				}
	}
			}
		}
		);
		add(exibe);
		
		//caixa3.setText(String.valueOf(an));
		exibe3 = new JButton("Procurar por ano");
		exibe3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento3){
				an = Integer.parseInt(caixa3.getText());
				if(evento3.getSource() == exibe3){
					for(int i=0; i<5; i++){
					if(an == vetLivroFisico[i].getAno()){
						JOptionPane.showMessageDialog(null, "\nTitulo do livro: " + vetLivroFisico[i].getTitulo() + "\nAno: " +vetLivroFisico[i].getAno()+ "\nNumero de paginas: " +vetLivroFisico[i].getNpaginas()+ "\nPreco: "+vetLivroFisico[i].getPreco()+"\nPeso: "+vetLivroFisico[i].getPeso()+"\nAutor: "+vetAutor[i].getNome()+"\nBiografia do Autor: "+vetAutor[i].getBiografia()+"\nISBN: "+vetLivroFisico[i].getIsbn());
					}
					if(an == vetLivroEletronico[i].getAno()){
						JOptionPane.showMessageDialog(null, "LIVRO ELETRONICO\nTitulo do livro: " + vetLivroEletronico[i].getTitulo() + "\nAno: "+vetLivroEletronico[i].getAno()+"\nNumero de paginas: " + vetLivroEletronico[i].getNpaginas() + "\nPreco: "+vetLivroEletronico[i].getPreco()+"\nISBN: "+vetLivroEletronico[i].getIsbn());
					}
				}
	}
			}
		}
		);
		add(exibe3);
		
		
		exibe2 = new JButton("Procurar por ISBN");
		exibe2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento2){
				isb = caixa2.getText();
				if(evento2.getSource() == exibe2){
					for(int i=0; i<5; i++){
					if(isb.equals(vetLivroFisico[i].getIsbn())){
						JOptionPane.showMessageDialog(null, "\nTitulo do livro: " + vetLivroFisico[i].getTitulo() + "\nAno: " +vetLivroFisico[i].getAno()+ "\nNumero de paginas: " +vetLivroFisico[i].getNpaginas()+ "\nPreco: "+vetLivroFisico[i].getPreco()+"\nPeso: "+vetLivroFisico[i].getPeso()+"\nAutor: "+vetAutor[i].getNome()+"\nBiografia do Autor: "+vetAutor[i].getBiografia()+"\nISBN: "+vetLivroFisico[i].getIsbn());
					}
					if(isb.equals(vetLivroEletronico[i].getIsbn())){
						JOptionPane.showMessageDialog(null, "LIVRO ELETRONICO\nTitulo do livro: " + vetLivroEletronico[i].getTitulo() + "\nAno: "+vetLivroEletronico[i].getAno()+"\nNumero de paginas: " + vetLivroEletronico[i].getNpaginas() + "\nPreco: "+vetLivroEletronico[i].getPreco()+"\nISBN: "+vetLivroEletronico[i].getIsbn());
					}
				}
	}
			}
		}
		);
		add(exibe2);
		
	
	}
	

}