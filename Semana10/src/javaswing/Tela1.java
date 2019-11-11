package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField pasSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTelaDeLogin = new JLabel("Tela de Login");
		lblTelaDeLogin.setBounds(196, 27, 86, 25);
		contentPane.add(lblTelaDeLogin);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setBounds(10, 79, 59, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 118, 46, 14);
		contentPane.add(lblSenha);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(90, 76, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		pasSenha = new JPasswordField();
		pasSenha.setBounds(90, 115, 86, 20);
		contentPane.add(pasSenha);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtUsuario.getText().equals("Alex") && 
						pasSenha.getText().equals("1234"))
				{
					Tela2 tela2 = new Tela2();
					tela2.setVisible(true);
				}
				else
				{
					System.out.println("Erro Usuário / senha!!");
				}
			}
		});
		btnLogin.setBounds(56, 190, 86, 23);
		contentPane.add(btnLogin);
	}
}
