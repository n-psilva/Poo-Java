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

public class AlterarVoo extends JFrame {

	private JPanel contentPane;
	private JTextField txtCod;
	private JTextField txtDataP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarVoo frame = new AlterarVoo();
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
	public AlterarVoo() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 220, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("C\u00F3digo:");
		label.setBounds(10, 14, 46, 14);
		contentPane.add(label);
		
		txtCod = new JTextField();
		txtCod.setColumns(10);
		txtCod.setBounds(99, 11, 86, 20);
		contentPane.add(txtCod);
		
		JLabel label_1 = new JLabel("Data Partida:");
		label_1.setBounds(10, 39, 79, 14);
		contentPane.add(label_1);
		
		txtDataP = new JTextField();
		txtDataP.setColumns(10);
		txtDataP.setBounds(99, 36, 86, 20);
		contentPane.add(txtDataP);
		
		JButton button = new JButton("Salvar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VooController control = new VooController();
				Voo voo = new Voo();
				
				voo.setIdVoo(txtCod.getText());
				voo.setData_Ini_Ag(txtDataP.getText());
                
				if(control.update(voo) == 1) {
					
					JOptionPane.showMessageDialog(null,"Modificado com Sucesso!");
				}
				else
					JOptionPane.showMessageDialog(null,"Erro ao modificar!");
				
				setVisible(false);
				
			}
		});
		button.setBounds(115, 112, 89, 23);
		contentPane.add(button);
	}

}
