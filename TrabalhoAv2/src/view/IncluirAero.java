package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AeroportoController;
import model.Aeroporto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IncluirAero extends JFrame {

	private JPanel contentPane;
	private JTextField txtCod;
	private JTextField txtCdd;
	private JTextField txtNome;
	private JTextField txtSit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IncluirAero frame = new IncluirAero();
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
	public IncluirAero() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 246, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("C\u00F3digo:");
		label.setBounds(10, 14, 46, 14);
		contentPane.add(label);
		
		txtCod = new JTextField();
		txtCod.setColumns(10);
		txtCod.setBounds(72, 11, 96, 20);
		contentPane.add(txtCod);
		
		JLabel label_1 = new JLabel("Cidade:");
		label_1.setBounds(10, 39, 46, 14);
		contentPane.add(label_1);
		
		txtCdd = new JTextField();
		txtCdd.setColumns(10);
		txtCdd.setBounds(72, 36, 96, 20);
		contentPane.add(txtCdd);
		
		JLabel label_2 = new JLabel("Nome:");
		label_2.setBounds(10, 64, 46, 14);
		contentPane.add(label_2);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(72, 61, 96, 20);
		contentPane.add(txtNome);
		
		JLabel label_3 = new JLabel("Situa\u00E7\u00E3o:");
		label_3.setBounds(10, 91, 56, 14);
		contentPane.add(label_3);
		
		txtSit = new JTextField();
		txtSit.setColumns(10);
		txtSit.setBounds(72, 88, 96, 20);
		contentPane.add(txtSit);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Aeroporto aero = new Aeroporto();
				AeroportoController control = new AeroportoController();
				
				aero.setIdAeroporto(txtCod.getText());
				aero.setCidade(txtCdd.getText());
				aero.setNome(txtNome.getText());
				aero.setSituacao(txtSit.getText());
				
				if(control.create(aero) == 1) {
					
					JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
				}
				else
					JOptionPane.showMessageDialog(null, "Erro ao adicionar!");
				
				setVisible(false);
			}
		});
		btnSalvar.setBounds(131, 148, 89, 23);
		contentPane.add(btnSalvar);
	}

}
