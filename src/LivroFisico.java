// Create by 0196611
// Vinícius Daniel Neuenfeldt Barros
public class LivroFisico extends Livro{

	private double peso;
	Autor autor;
	
	
	public LivroFisico(int codigo, double preco, int ano, int npaginas, String titulo, String isbn, double peso,
			Autor autor) {
		super(codigo, preco, ano, npaginas, titulo, isbn);
		this.peso = peso;
		this.autor = autor;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
}
