package JogoAranha;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JogoAranha extends JFrame {

	
	private static final long serialVersionUID = 1L;
	ImageIcon iconParede = new ImageIcon(getClass().getResource("fundo.jpg"));
	ImageIcon iconAranhaMexendo = new ImageIcon(getClass().getResource("aranha.gif"));
	ImageIcon iconAranha = new ImageIcon(getClass().getResource("aranha1.png"));
	
	
	JLabel lParede = new JLabel(iconParede);
	JLabel lAranha = new JLabel(iconAranha);
	
	
	int posAranhaX=300;
	int posAranhaY=300;
	int posCarroX= 301;
	int posCarroY= 301;
	
	public JogoAranha() {
		editarJanela();
		editarComponentes();
		addMovimento();
		
		
		}
	
	
	public void addMovimento() {
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				lAranha.setIcon(iconAranha); //troca de imagem quando a tecla é solta.
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				lAranha.setIcon(iconAranhaMexendo); //troca de imagem quando pressiona tecla.
				if(e.getKeyCode()==38) {   //cima
					posAranhaY -=8;
				}
				if(e.getKeyCode()==40) {  //baixo
					posAranhaY +=8;
				}
				if(e.getKeyCode()==37) {  //esquerda
					posAranhaX -=8;
				}
				if(e.getKeyCode()==39) { //direita
					posAranhaX +=8;
				}
				lAranha.setBounds(posAranhaX, posAranhaY, 103, 202);
			}
		});
		
	}
	
	public void editarComponentes() {
		
		
		lParede.setBounds(0, 0, 800, 700);
		lAranha.setBounds(posAranhaX, posAranhaY, 103, 202);
	}	
		public void editarJanela() {
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize	(800,700);
			setLocationRelativeTo(null);
			setVisible(true);
			setLayout(null);
			add(lAranha);
			add(lParede);
			
	}
		
		
	
		public static void main(String[] args) {	
		new JogoAranha();
	}

}