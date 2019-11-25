package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.VooController;
import model.Voo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExcluirVoo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcluirVoo frame = new ExcluirVoo();
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
	public ExcluirVoo() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 198, 172);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo:");
		lblNewLabel.setBounds(10, 22, 54, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(59, 19, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VooController control = new VooController();
				Voo voo = new Voo();
				
				voo.setIdVoo(textField.getText());
				
                if(control.delete(voo) == 1) {
					
					JOptionPane.showMessageDialog(null,"Cancelado com Sucesso!");
				}
				else
					JOptionPane.showMessageDialog(null,"Erro ao cancelar!");
				
				setVisible(false);
			}
		});
		btnNewButton.setBounds(93, 109, 89, 23);
		contentPane.add(btnNewButton);
	}

}
