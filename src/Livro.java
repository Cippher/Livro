// Create by 0196611
// Vinícius Daniel Neuenfeldt Barros
public abstract class Livro extends Produto{
	private int ano;
	private int npaginas;
	private String titulo;
	private String isbn;
	
	
	
	public Livro(int codigo, double preco, int ano, int npaginas, String titulo, String isbn) {
		super(codigo, preco);
		this.ano = ano;
		this.npaginas = npaginas;
		this.titulo = titulo;
		this.isbn = isbn;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getNpaginas() {
		return npaginas;
	}
	public void setNpaginas(int npaginas) {
		this.npaginas = npaginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
