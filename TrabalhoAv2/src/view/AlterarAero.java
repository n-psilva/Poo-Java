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

public class AlterarAero extends JFrame {

	private JPanel contentPane;
	private JTextField txtCod;
	private JTextField txtSit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarAero frame = new AlterarAero();
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
	public AlterarAero() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 207, 171);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("C\u00F3digo:");
		label.setBounds(10, 14, 46, 14);
		contentPane.add(label);
		
		txtCod = new JTextField();
		txtCod.setColumns(10);
		txtCod.setBounds(60, 11, 86, 20);
		contentPane.add(txtCod);
		
		JLabel label_1 = new JLabel("Situa\u00E7\u00E3o:");
		label_1.setBounds(10, 42, 56, 14);
		contentPane.add(label_1);
		
		txtSit = new JTextField();
		txtSit.setColumns(10);
		txtSit.setBounds(60, 39, 86, 20);
		contentPane.add(txtSit);
		
		JButton btnAlter = new JButton("Alterar");
		btnAlter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Aeroporto aero = new Aeroporto();
				AeroportoController control = new AeroportoController();
				
				aero.setIdAeroporto(txtCod.getText());
				aero.setSituacao(txtSit.getText());
				
				if(control.update(aero) == 1) {
					
					JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
				}
				else
					JOptionPane.showMessageDialog(null, "Erro ao altear!");
				
				setVisible(false);
			}
		});
		btnAlter.setBounds(105, 98, 76, 23);
		contentPane.add(btnAlter);
	}

}
