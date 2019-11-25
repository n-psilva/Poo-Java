package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AeroportoController;
import model.Aeroporto;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExcluirAero extends JFrame {

	private JPanel contentPane;
	private JTextField txtCod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcluirAero frame = new ExcluirAero();
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
	public ExcluirAero() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 205, 165);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCod = new JTextField();
		txtCod.setColumns(10);
		txtCod.setBounds(60, 11, 86, 20);
		contentPane.add(txtCod);
		
		JLabel label = new JLabel("C\u00F3digo:");
		label.setBounds(10, 14, 46, 14);
		contentPane.add(label);
		
		JButton btnDel = new JButton("Deletar");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Aeroporto aero = new Aeroporto();
				AeroportoController control = new AeroportoController();
				
				aero.setIdAeroporto(txtCod.getText());

				if(control.delete(aero) == 1) {
					
					JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
				}
				else
					JOptionPane.showMessageDialog(null, "Erro ao deletar!");
				
				setVisible(false);
			}
		});
		btnDel.setBounds(103, 92, 76, 23);
		contentPane.add(btnDel);
	}

}
