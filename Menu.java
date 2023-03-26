package pruebasPamFood;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Controlador.Methods;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;

@SuppressWarnings("serial")
public class Menu extends JFrame {

	private JPanel contentPane;
	private Methods controlador = new Methods();  

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\roman\\eclipse-workspace\\pruebasPamFood\\src\\imagenes\\huevo.png"));
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/imagenes/huevo.png")));
		setTitle("PAMFOOD");
		setBackground(new Color(235, 69, 95));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(938,684);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 69, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jpanel = new JPanel();
		jpanel.setForeground(new Color(75, 0, 130));
		jpanel.setBackground(Color.WHITE);
		

		jpanel.setBounds(0, 92, 937, 568);
		contentPane.add(jpanel);
		jpanel.setLayout(null);
		
		JLabel bebida1 = new JLabel("Sodas de la casa");
		bebida1.setHorizontalAlignment(SwingConstants.CENTER);
		bebida1.setForeground(Color.BLACK);
		bebida1.setFont(new Font("Coco Gothic", Font.PLAIN, 24));
		bebida1.setBounds(40, 370, 396, 34);
		jpanel.add(bebida1);
		
		JLabel bebida2 = new JLabel("Gaseosas");
		bebida2.setHorizontalAlignment(SwingConstants.CENTER);
		bebida2.setForeground(Color.BLACK);
		bebida2.setFont(new Font("Coco Gothic", Font.PLAIN, 24));
		bebida2.setBounds(485, 370, 396, 34);
		jpanel.add(bebida2);
		
		JLabel bebida3 = new JLabel("Agua sin gas");
		bebida3.setHorizontalAlignment(SwingConstants.CENTER);
		bebida3.setForeground(Color.BLACK);
		bebida3.setFont(new Font("Coco Gothic", Font.PLAIN, 24));
		bebida3.setBounds(40, 422, 396, 34);
		jpanel.add(bebida3);
		
		JLabel bebida4 = new JLabel("Agua con gas");
		bebida4.setHorizontalAlignment(SwingConstants.CENTER);
		bebida4.setForeground(Color.BLACK);
		bebida4.setFont(new Font("Coco Gothic", Font.PLAIN, 24));
		bebida4.setBounds(485, 422, 396, 34);
		jpanel.add(bebida4);
		
		JLabel bebida5 = new JLabel("Jugos naturales");
		bebida5.setHorizontalAlignment(SwingConstants.CENTER);
		bebida5.setForeground(Color.BLACK);
		bebida5.setFont(new Font("Coco Gothic", Font.PLAIN, 24));
		bebida5.setBounds(40, 476, 396, 34);
		jpanel.add(bebida5);
		
		JLabel bebida6 = new JLabel("Té negro frío");
		bebida6.setHorizontalAlignment(SwingConstants.CENTER);
		bebida6.setForeground(Color.BLACK);
		bebida6.setFont(new Font("Coco Gothic", Font.PLAIN, 24));
		bebida6.setBounds(485, 476, 396, 34);
		jpanel.add(bebida6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setBounds(29, 28, 434, 288);
		jpanel.add(panel_1);
		
		JLabel bowl1_1_1 = new JLabel("Bowl marino");
		bowl1_1_1.setBounds(10, 176, 414, 34);
		panel_1.add(bowl1_1_1);
		bowl1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		bowl1_1_1.setForeground(Color.BLACK);
		bowl1_1_1.setFont(new Font("Coco Gothic", Font.PLAIN, 24));
		
		JLabel bowl1_1_1_1 = new JLabel("Bowl vegan");
		bowl1_1_1_1.setBounds(10, 229, 414, 34);
		panel_1.add(bowl1_1_1_1);
		bowl1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		bowl1_1_1_1.setForeground(Color.BLACK);
		bowl1_1_1_1.setFont(new Font("Coco Gothic", Font.PLAIN, 24));
		
		JLabel bowl1 = new JLabel("Bowl pollito\r\n");
		bowl1.setBounds(10, 69, 414, 34);
		panel_1.add(bowl1);
		bowl1.setHorizontalAlignment(SwingConstants.CENTER);
		bowl1.setForeground(Color.BLACK);
		bowl1.setFont(new Font("Coco Gothic", Font.PLAIN, 24));
		
		JLabel lblBowlMexicano = new JLabel("Bowl mexicano");
		lblBowlMexicano.setBounds(10, 121, 414, 34);
		panel_1.add(lblBowlMexicano);
		lblBowlMexicano.setHorizontalAlignment(SwingConstants.CENTER);
		lblBowlMexicano.setForeground(Color.BLACK);
		lblBowlMexicano.setFont(new Font("Coco Gothic", Font.PLAIN, 24));
		
		JLabel bowls = new JLabel("Bowls (15k)");
		bowls.setBounds(10, 25, 414, 34);
		panel_1.add(bowls);
		bowls.setForeground(new Color(30, 144, 255));
		bowls.setHorizontalAlignment(SwingConstants.CENTER);
		bowls.setFont(new Font("d Diam", Font.PLAIN, 24));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(240, 230, 140));
		panel_1_1.setBounds(469, 28, 428, 288);
		jpanel.add(panel_1_1);
		
		JLabel antojitos = new JLabel("Antojitos (5k)");
		antojitos.setBounds(10, 22, 408, 34);
		panel_1_1.add(antojitos);
		antojitos.setHorizontalAlignment(SwingConstants.CENTER);
		antojitos.setForeground(new Color(30, 144, 255));
		antojitos.setFont(new Font("d Diam", Font.PLAIN, 24));
		
		JLabel antojito1 = new JLabel("Papas fritas");
		antojito1.setBounds(10, 66, 408, 34);
		panel_1_1.add(antojito1);
		antojito1.setHorizontalAlignment(SwingConstants.CENTER);
		antojito1.setForeground(Color.BLACK);
		antojito1.setFont(new Font("Coco Gothic", Font.PLAIN, 24));
		
		JLabel antojito3 = new JLabel("Papas de carita");
		antojito3.setBounds(10, 122, 408, 34);
		panel_1_1.add(antojito3);
		antojito3.setHorizontalAlignment(SwingConstants.CENTER);
		antojito3.setForeground(Color.BLACK);
		antojito3.setFont(new Font("Coco Gothic", Font.PLAIN, 24));
		
		JLabel antojito4 = new JLabel("Yuquitas");
		antojito4.setBounds(10, 229, 408, 34);
		panel_1_1.add(antojito4);
		antojito4.setHorizontalAlignment(SwingConstants.CENTER);
		antojito4.setForeground(Color.BLACK);
		antojito4.setFont(new Font("Coco Gothic", Font.PLAIN, 24));
		
		JLabel antojito2 = new JLabel("Papas en casco");
		antojito2.setBounds(10, 178, 408, 34);
		panel_1_1.add(antojito2);
		antojito2.setHorizontalAlignment(SwingConstants.CENTER);
		antojito2.setForeground(Color.BLACK);
		antojito2.setFont(new Font("Coco Gothic", Font.PLAIN, 24));
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(240, 230, 140));
		panel_1_1_1.setBounds(29, 322, 868, 203);
		jpanel.add(panel_1_1_1);
		
		JLabel bebidas = new JLabel("Bedidas (3k)");
		bebidas.setBounds(10, 10, 848, 34);
		panel_1_1_1.add(bebidas);
		bebidas.setHorizontalAlignment(SwingConstants.CENTER);
		bebidas.setForeground(new Color(30, 144, 255));
		bebidas.setFont(new Font("d Diam", Font.PLAIN, 24));
		
		JLabel titulo = new JLabel("PAMFOOD");
		titulo.setBounds(31, 10, 355, 77);
		contentPane.add(titulo);
		titulo.setForeground(new Color(255, 240, 245));
		titulo.setFont(new Font("The Bold Font", Font.PLAIN, 48));
		
		JButton btnAtras = new JButton("Atrás");
		btnAtras.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Inicio().setVisible(true);		
				dispose();
			}
			public void mouseEntered(MouseEvent e) {
				btnAtras.setForeground(new Color(235, 69, 95));
				btnAtras.setBackground(Color.WHITE);
			}
			
			public void mouseExited(MouseEvent e) {
				btnAtras.setForeground(Color.WHITE);
				btnAtras.setBackground(new Color(235, 69, 95));
			}
		});
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setFont(new Font("Cocogoose", Font.PLAIN, 18));
		btnAtras.setFocusable(false);
		btnAtras.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		btnAtras.setBackground(new Color(235, 69, 95));
		btnAtras.setBounds(762, 35, 134, 39);
		contentPane.add(btnAtras);
	}	
}