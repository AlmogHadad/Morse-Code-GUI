import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;

public class MorseApp {
	
	private JFrame frame; 			// frame
	private JTextField Massage; 	// its where you write the sentence that you want to convert
	private JTextArea pellet;   	// the pellet is presented in this text area
	private JLabel lblmassage;		
	private JLabel lblMorseSigh;
	private JButton btnMltr;		//button that present CodeMorse map image
	private JButton btnMorseSign1;	//button that add to the Massage area the morse sign "−"
	private JButton btnMorseSign2;	//button that add to the Massage area the morse sign "·"
	private JButton btnMorse;		//button that convert to morse from letters
	private JButton btnClear;		//button that clear the pellet area
	private JButton btnLetter;
//	private ImageIcon image;
//	private Image backgroundImage;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MorseApp window = new MorseApp();
					window.frame.setVisible(true);}
					catch (Exception e) {
					e.printStackTrace();}
							  }
											   });

}
											

	/**
	 * Create the application.
	 */
	public MorseApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Morse Convertor");
		frame.getContentPane().setBackground(new Color(51, 51, 102));
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnMorse = new JButton("covert to morse");
		btnMorse.setForeground(Color.WHITE);
		btnMorse.setBackground(new Color(51, 51, 102));
		
		btnMorse.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) { // convert the sentence to Morse code
				
				Morse morse = new Morse();
				String sentence = Massage.getText();
				String sentenceInMorse = morse.convertToMorse(sentence);
				pellet.setText(sentenceInMorse); 
			}
		});
		btnMorse.setFont(new Font("Arial", Font.PLAIN, 16));
		btnMorse.setBounds(10, 114, 159, 23);
		frame.getContentPane().add(btnMorse);
		
		Massage = new JTextField();
		Massage.setFont(new Font("Arial", Font.PLAIN, 23));
		Massage.setBackground(Color.WHITE);
		Massage.setBounds(10, 60, 414, 43);
		frame.getContentPane().add(Massage);
		Massage.setColumns(10);
		
		lblmassage = new JLabel("Morse Convertor");
		lblmassage.setForeground(new Color(255, 255, 255));
		lblmassage.setHorizontalAlignment(SwingConstants.CENTER);
		lblmassage.setFont(new Font("Arial", Font.BOLD, 22));
		lblmassage.setBounds(10, 11, 414, 38);
		frame.getContentPane().add(lblmassage);
		
		btnLetter = new JButton("converte to letter");
		btnLetter.setForeground(Color.WHITE);
		btnLetter.setBackground(new Color(51, 51, 102));
		btnLetter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Massage morsee = new Massage();
				String sentence = Massage.getText();
				String sentenceInMassage = morsee.convertToMassage(sentence);
				pellet.setText(pellet.getText()+sentenceInMassage);
				Massage.setText("");
			}
		});
		btnLetter.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLetter.setBounds(191, 183, 188, 23);
		frame.getContentPane().add(btnLetter);
		
		btnMorseSign1 = new JButton("\u2212");
		btnMorseSign1.setForeground(Color.WHITE);
		btnMorseSign1.setBackground(new Color(51, 51, 102));
		btnMorseSign1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Massage.replaceSelection("−");
			}
		});
		btnMorseSign1.setFont(new Font("Arial", Font.PLAIN, 22));
		btnMorseSign1.setBounds(191, 148, 89, 23);
		frame.getContentPane().add(btnMorseSign1);
		
		btnMorseSign2 = new JButton("\u00B7");
		btnMorseSign2.setForeground(Color.WHITE);
		btnMorseSign2.setBackground(new Color(51, 51, 102));
		btnMorseSign2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Massage.replaceSelection("·");
			}
		});
		btnMorseSign2.setFont(new Font("Arial", Font.PLAIN, 22));
		btnMorseSign2.setBounds(290, 148, 89, 23);
		frame.getContentPane().add(btnMorseSign2);
		
		lblMorseSigh = new JLabel("morse signs");
		lblMorseSigh.setForeground(new Color(255, 255, 255));
		lblMorseSigh.setHorizontalAlignment(SwingConstants.CENTER);
		lblMorseSigh.setFont(new Font("Arial", Font.PLAIN, 22));
		lblMorseSigh.setBounds(191, 114, 188, 23);
		frame.getContentPane().add(lblMorseSigh);
		
		pellet = new JTextArea();
		pellet.setBackground(Color.WHITE);
		pellet.setFont(new Font("Arial", Font.PLAIN, 23));
		pellet.setBounds(10, 217, 414, 184);
		frame.getContentPane().add(pellet);
		
		btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pellet.setText("");
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Arial", Font.PLAIN, 16));
		btnClear.setBounds(10, 183, 159, 23);
		btnClear.setBackground(new Color(51, 51, 102));
		frame.getContentPane().add(btnClear);
		
		btnMltr = new JButton("morse letter");
		btnMltr.setForeground(Color.WHITE);
		btnMltr.setFont(new Font("Arial", Font.PLAIN, 16));
		btnMltr.setBounds(10, 150, 159, 21);
		btnMltr.setBackground(new Color(51, 51, 102));
		frame.getContentPane().add(btnMltr);
		
			
	}
}
