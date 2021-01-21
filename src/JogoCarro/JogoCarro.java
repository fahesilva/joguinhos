// criando movimento automatico

package JogoCarro;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class JogoCarro extends JFrame{
	
	
	JLabel lCarro1 = new JLabel(new ImageIcon(getClass().getResource("dog1.png")));
	JLabel lCarro2 = new JLabel(new ImageIcon(getClass().getResource("dog2.jpg")));
	
	public JogoCarro() {
		editarJanela();
		new  Movimento().start(); //iniciando o Movimento das Imagens
	 
	}
	public void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize	(1400,800);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		lCarro1.setBounds(0, 0 , 200, 100);
		lCarro2.setBounds(0, 200 , 200, 100);
		add(lCarro1);
		add(lCarro2);
		
	}
	
	public class Movimento extends Thread {
		public void run() {
			while(true) {
				try {sleep(20);}catch(Exception erro){}
				if(lCarro1.getX()<1000) {
				lCarro1.setBounds(lCarro1.getX()+5, 0, 200, 100);
				}
				if(lCarro2.getX()<1000) { //colocando parada a imagem ao fim do percurso
				lCarro2.setBounds(lCarro2.getX()+8, 200, 200, 100);
				}
				}
		}
	}
	public static void main(String[] args) {
		new JogoCarro();
	
	}

}
