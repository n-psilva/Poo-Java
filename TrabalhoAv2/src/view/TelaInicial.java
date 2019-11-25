package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.VooController;
import dao.AeroportoDAO;
import dao.AviaoDAO;
import dao.VooDAO;
import model.Voo;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class TelaInicial extends JFrame {

	private JPanel contentPane;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 441, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Controle de V\u00F4o");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(158, 21, 158, 23);
		contentPane.add(lblNewLabel);
		
		
		
		JButton btnSair = new JButton("Sair do Sistema");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login log= new Login();
				log.setVisible(true);
				setVisible(false);
			}
		});
		btnSair.setBounds(279, 279, 136, 23);
		contentPane.add(btnSair);
		
		
		JPanel panelVoo = new JPanel();
		panelVoo.setBounds(10, 90, 111, 152);
		contentPane.add(panelVoo);
		panelVoo.setLayout(null);
		panelVoo.setVisible(false);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				IncluirVoo inc = new IncluirVoo();
				inc.setVisible(true);
			}
		});
		btnNovo.setBounds(10, 11, 91, 23);
		panelVoo.add(btnNovo);
		
		JButton btnAlter = new JButton("Alterar");
		btnAlter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarVoo alt = new AlterarVoo();
				alt.setVisible(true);
			}
		});
		btnAlter.setBounds(10, 46, 91, 23);
		panelVoo.add(btnAlter);
		
		JButton btnCancelVoo = new JButton("Cancelar");
		btnCancelVoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExcluirVoo esc = new ExcluirVoo();
				esc.setVisible(true);
			}
		});
		btnCancelVoo.setBounds(10, 80, 91, 23);
		panelVoo.add(btnCancelVoo);
		
		JButton btnImpVoo = new JButton("Imprimir");
		btnImpVoo.setBounds(10, 114, 89, 23);
		panelVoo.add(btnImpVoo);
		btnImpVoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				VooDAO voo = new VooDAO();
				voo.readAll();
				
				
			}
		});
		
		JPanel panelAero = new JPanel();
		panelAero.setLayout(null);
		panelAero.setBounds(158, 90, 105, 152);
		contentPane.add(panelAero);
		panelAero.setVisible(false);
		
		JButton btnCancelAero = new JButton("Remover");
		btnCancelAero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ExcluirAero esc = new ExcluirAero();
				esc.setVisible(true);
			}
		});
		btnCancelAero.setBounds(10, 80, 91, 23);
		panelAero.add(btnCancelAero);
		
		JButton btnAlterAero = new JButton("Alterar");
		btnAlterAero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AlterarAero alt = new AlterarAero();
				alt.setVisible(true);
			}
			
		});
		btnAlterAero.setBounds(10, 46, 91, 23);
		panelAero.add(btnAlterAero);
		
		JButton btnNovoAero = new JButton("Novo");
		btnNovoAero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				IncluirAero inc = new IncluirAero();
				inc.setVisible(true);
			}
		});
		btnNovoAero.setBounds(10, 11, 91, 23);
		panelAero.add(btnNovoAero);
		
		JButton btnImpAero = new JButton("Imprimir");
		btnImpAero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AeroportoDAO aero = new AeroportoDAO();
				aero.readAll();
			}
		});
		btnImpAero.setBounds(10, 114, 89, 23);
		panelAero.add(btnImpAero);
		
		JPanel panelAviao = new JPanel();
		panelAviao.setLayout(null);
		panelAviao.setBounds(303, 90, 105, 152);
		contentPane.add(panelAviao);
		panelAviao.setVisible(false);
		
		JButton btnCancelAviao = new JButton("Remover");
		btnCancelAviao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ExcluirAviao esc =  new ExcluirAviao();
				esc.setVisible(true);
			}
		});
		btnCancelAviao.setBounds(10, 80, 91, 23);
		panelAviao.add(btnCancelAviao);
		
		JButton btnAlterAvio = new JButton("Alterar");
		btnAlterAvio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AlterarAviao alt = new AlterarAviao();
				alt.setVisible(true);
			}
		});
		btnAlterAvio.setBounds(10, 46, 91, 23);
		panelAviao.add(btnAlterAvio);
		
		JButton btnNovoAviao = new JButton("Novo");
		btnNovoAviao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				IncluirAviao inc = new IncluirAviao();
				inc.setVisible(true);
			}
		});
		btnNovoAviao.setBounds(10, 11, 91, 23);
		panelAviao.add(btnNovoAviao);
		
		JButton btnImpAvio = new JButton("Imprimir");
		btnImpAvio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AviaoDAO aviao = new AviaoDAO();
				aviao.readAll();
				
			}
		});
		btnImpAvio.setBounds(10, 114, 89, 23);
		panelAviao.add(btnImpAvio);
		
		
		JButton btnVoo = new JButton("V\u00F4o");
		btnVoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelVoo.setVisible(true);
				panelAero.setVisible(false);
				panelAviao.setVisible(false);
			}
		});
		btnVoo.setBounds(10, 56, 105, 23);
		contentPane.add(btnVoo);
		
		JButton btnAero = new JButton("Aeroporto");
		btnAero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelAero.setVisible(true);
				panelVoo.setVisible(false);
				panelAviao.setVisible(false);
			}
		});
		btnAero.setBounds(158, 55, 105, 23);
		contentPane.add(btnAero);
		
		JButton btnNewButton = new JButton("Avi\u00E3o");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelAviao.setVisible(true);
				panelAero.setVisible(false);
				panelVoo.setVisible(false);
			}
		});
		btnNewButton.setBounds(303, 55, 105, 23);
		contentPane.add(btnNewButton);
		
	}
}
