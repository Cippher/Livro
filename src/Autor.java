// Create by 0196611
// Vinícius Daniel Neuenfeldt Barros

public class Autor {

	private String nome;
	private String biografia;
	private LivroFisico livro;
	
	public Autor(String nome, String biografia, LivroFisico livroFisico) {
		this.nome = nome;
		this.biografia = biografia;
		this.livro = livroFisico;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBiografia() {
		return biografia;
	}
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	public LivroFisico getLivro() {
		return livro;
	}
	public void setLivro(LivroFisico livro) {
		this.livro = livro;
	}
	
}
