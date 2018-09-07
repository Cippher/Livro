import java.awt.FlowLayout;
import javax.swing.JFrame;

//Create by 0196611
//Vinícius Daniel Neuenfeldt Barros

public interface Exibicao {

	public static void main(String[] args) {
		
		
		  Texto texfield = new Texto();
			
		  texfield.setLayout(new FlowLayout(FlowLayout.LEFT));
		  texfield.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  texfield.setSize(1000,200);
		  texfield.setVisible(true);
		  texfield.setResizable(false);
		   
	}
}
