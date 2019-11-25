package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AviaoController;
import model.Aviao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlterarAviao extends JFrame {

	private JPanel contentPane;
	private JTextField txtCod;
	private JTextField txtQtdV;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarAviao frame = new AlterarAviao();
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
	public AlterarAviao() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 215, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("C\u00F3digo:");
		label.setBounds(10, 14, 46, 14);
		contentPane.add(label);
		
		txtCod = new JTextField();
		txtCod.setColumns(10);
		txtCod.setBounds(82, 11, 86, 20);
		contentPane.add(txtCod);
		
		JLabel label_1 = new JLabel("Qtd Vagas:");
		label_1.setBounds(10, 39, 68, 14);
		contentPane.add(label_1);
		
		txtQtdV = new JTextField();
		txtQtdV.setColumns(10);
		txtQtdV.setBounds(82, 36, 86, 20);
		contentPane.add(txtQtdV);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Aviao aviao = new Aviao();
				AviaoController control = new AviaoController();
				
				aviao.setIdAviao(txtCod.getText());
				aviao.setQtd_vagas(txtQtdV.getText());
				
				if(control.update(aviao) == 1) {
					
					JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
				}
				else
					JOptionPane.showMessageDialog(null,"Erro ao alterar");
					
				setVisible(false);
			}
		});
		btnSalvar.setBounds(110, 87, 89, 23);
		contentPane.add(btnSalvar);
	}

}
