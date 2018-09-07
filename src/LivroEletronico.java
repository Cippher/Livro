// Create by 0196611
// Vinícius Daniel Neuenfeldt Barros
public class LivroEletronico extends Livro{

	private String formato;

	public LivroEletronico(int codigo, double preco, int ano, int npaginas, String titulo, String isbn,
			String formato) {
		super(codigo, preco, ano, npaginas, titulo, isbn);
		this.formato = formato;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	
	
}
