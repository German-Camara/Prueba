package aaaa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Window.Type;
import java.awt.Color;

public class consola {

	private JFrame frmCazandoACarlos;
	private JTextField texto;
	private JTextField pantalla;
	private int objetivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consola window = new consola();
					window.frmCazandoACarlos.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public consola() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCazandoACarlos = new JFrame();
		frmCazandoACarlos.setResizable(false);
		frmCazandoACarlos.setTitle("Cazando a Carlos...");
		frmCazandoACarlos.setBounds(100, 100, 530, 269);
		frmCazandoACarlos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCazandoACarlos.getContentPane().setLayout(null);
		objetivo=(int) (Math.random()*17);
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b10 = new JButton("10");
		JButton b11 = new JButton("11");
		JButton b13 = new JButton("13");
		JButton b12 = new JButton("12");
		JButton b14 = new JButton("14");
		JButton b15 = new JButton("15");
		JButton b16 = new JButton("16");
		
		JButton restart = new JButton("restart");
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b1.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b1.setBounds(12, 12, 50, 50);
		frmCazandoACarlos.getContentPane().add(b1);
		
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b2.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b2.setBounds(65, 12, 50, 50);
		frmCazandoACarlos.getContentPane().add(b2);
		
		
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b3.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b3.setBounds(119, 12, 50, 50);
		frmCazandoACarlos.getContentPane().add(b3);
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b4.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b4.setBounds(173, 12, 50, 50);
		frmCazandoACarlos.getContentPane().add(b4);		
		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b5.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b5.setBounds(12, 70, 50, 50);
		frmCazandoACarlos.getContentPane().add(b5);		
		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b6.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b6.setBounds(65, 70, 50, 50);
		frmCazandoACarlos.getContentPane().add(b6);		
		
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b7.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b7.setBounds(119, 70, 50, 50);
		frmCazandoACarlos.getContentPane().add(b7);		
		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b8.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b8.setBounds(173, 70, 50, 50);
		frmCazandoACarlos.getContentPane().add(b8);		
		
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b9.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b9.setBounds(12, 128, 50, 50);
		frmCazandoACarlos.getContentPane().add(b9);		
		
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b10.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b10.setBounds(65, 128, 50, 50);
		frmCazandoACarlos.getContentPane().add(b10);		
		
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b11.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b11.setBounds(119, 128, 50, 50);
		frmCazandoACarlos.getContentPane().add(b11);		
		
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b12.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b12.setBounds(173, 128, 50, 50);
		frmCazandoACarlos.getContentPane().add(b12);		
		
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b13.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b13.setBounds(12, 186, 50, 50);
		frmCazandoACarlos.getContentPane().add(b13);		
		
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b14.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b14.setBounds(65, 186, 50, 50);
		frmCazandoACarlos.getContentPane().add(b14);		
		
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b15.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b15.setBounds(119, 186, 50, 50);
		frmCazandoACarlos.getContentPane().add(b15);		
		
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				texto.setText(b16.getText());
				objetivo=(int) (Math.random()*17);
				if(Integer.parseInt(texto.getText())==objetivo)
				{
					pantalla.setText("¡¡¡Has cazado a Carlos!!!");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					b10.setVisible(false);
					b11.setVisible(false);
					b12.setVisible(false);
					b13.setVisible(false);
					b14.setVisible(false);
					b15.setVisible(false);
					b16.setVisible(false);
					texto.setVisible(true);
					restart.setVisible(true);
				}
				else
				{
					pantalla.setText("Has fallado...");
				}
			}
		});
		b16.setBounds(173, 186, 50, 50);
		frmCazandoACarlos.getContentPane().add(b16);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(332, 12, 186, 224);
		frmCazandoACarlos.getContentPane().add(panel);
		panel.setLayout(null);
		
		texto = new JTextField();
		texto.setBackground(Color.WHITE);
		texto.setEditable(false);
		texto.setBounds(10, 7, 124, 19);
		panel.add(texto);
		texto.setColumns(10);
		
		pantalla = new JTextField();
		pantalla.setBackground(Color.WHITE);
		pantalla.setEditable(false);
		pantalla.setBounds(10, 91, 164, 19);
		panel.add(pantalla);
		pantalla.setColumns(10);
		
		restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				b1.setVisible(true);
				b2.setVisible(true);
				b3.setVisible(true);
				b4.setVisible(true);
				b5.setVisible(true);
				b6.setVisible(true);
				b7.setVisible(true);
				b8.setVisible(true);
				b9.setVisible(true);
				b10.setVisible(true);
				b11.setVisible(true);
				b12.setVisible(true);
				b13.setVisible(true);
				b14.setVisible(true);
				b15.setVisible(true);
				b16.setVisible(true);
				texto.setVisible(false);
				pantalla.setText("");
				restart.setVisible(false);
			}
		});
		restart.setBounds(232, 167, 94, 35);
		frmCazandoACarlos.getContentPane().add(restart);
		texto.setVisible(false);
		restart.setVisible(false);
	}
}