package br.edu.unicid.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.edu.unicid.dao.AlunoDAO;
import br.edu.unicid.dao.CursoDAO;
import br.edu.unicid.model.Aluno;
import br.edu.unicid.model.Curso;


public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_9;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JSeparator separator_6;
	private JTabbedPane tabbedPane;
	private JPanel panelDadosPessoais;
	private JLabel lblNewLabel;
	private JLabel lblDataDeNascimento;
	private JLabel lblEmail;
	private JLabel lblEndereo;
	private JLabel lblMunicpio;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JLabel lblUf;
	private JLabel lblCelular;
	private JFormattedTextField txtRgm;
	private JFormattedTextField txtNome;
	private JFormattedTextField txtCpf;
	private JFormattedTextField txtDataNascimento;
	private JFormattedTextField txtEmail;
	private JFormattedTextField txtEndereco;
	private JFormattedTextField txtMunicipio;
	private JFormattedTextField txtCelular;
	private JComboBox cmbUf;
	private JPanel panelCurso;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JComboBox cmbCurso;
	private JComboBox cmbCampus;
	private JRadioButton rdbtnMatutino;
	private JRadioButton rdbtnVespertino;
	private JRadioButton rdbtnNoturno;
	private final ButtonGroup PeriodoBotao = new ButtonGroup();
	private JPanel panelNotasEFaltas;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JComboBox comboBox_3;
	private JLabel lblNewLabel_7;
	private JComboBox comboBox_4;
	private JLabel lblNewLabel_8;
	private JTextPane textPane;
	private JLabel lblNewLabel_9;
	private JTextPane textPane_1;
	private JFormattedTextField formattedTextField_8;
	private JTextPane textPane_2;
	private JTextPane textPane_3;
	private JPanel panelBoletim;
	private JButton btnSalvar;
	private JButton btnAtualizar;
	private JButton btnExcluir;
	private JButton btnLimparTela;
	private Aluno aluno;
	private AlunoDAO dao;
	private JLabel lblMensagemErro;
	private JButton btnSalvarCurso;
	private JButton btnAtualizarCurso;
	private JButton btnExcluirCurso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 833, 22);
		contentPane.add(menuBar);
		
		mnNewMenu = new JMenu("Aluno");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Salvar");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem);
		
		separator = new JSeparator();
		mnNewMenu.add(separator);
		
		mntmNewMenuItem_1 = new JMenuItem("Alterar");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Consultar");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		separator_2 = new JSeparator();
		mnNewMenu.add(separator_2);
		
		mntmNewMenuItem_3 = new JMenuItem("Excluir");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		separator_3 = new JSeparator();
		mnNewMenu.add(separator_3);
		
		mntmNewMenuItem_4 = new JMenuItem("Sair");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		mnNewMenu_1 = new JMenu("Notas e Faltas");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_6 = new JMenuItem("Alterar");
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		separator_4 = new JSeparator();
		mnNewMenu_1.add(separator_4);
		
		mntmNewMenuItem_5 = new JMenuItem("Salvar");
		mntmNewMenuItem_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		separator_5 = new JSeparator();
		mnNewMenu_1.add(separator_5);
		
		mntmNewMenuItem_7 = new JMenuItem("Excluir");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		separator_6 = new JSeparator();
		mnNewMenu_1.add(separator_6);
		
		mntmNewMenuItem_8 = new JMenuItem("Consultar");
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		mnNewMenu_2 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_9 = new JMenuItem("Sobre");
		mnNewMenu_2.add(mntmNewMenuItem_9);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(23, 77, 635, 389);
		contentPane.add(tabbedPane);
		
		panelDadosPessoais = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, panelDadosPessoais, null);
		panelDadosPessoais.setLayout(null);
		
		lblNewLabel = new JLabel("RGM");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panelDadosPessoais.add(lblNewLabel);
		
		lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(10, 44, 113, 14);
		panelDadosPessoais.add(lblDataDeNascimento);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 79, 46, 14);
		panelDadosPessoais.add(lblEmail);
		
		lblEndereo = new JLabel("Endereço");
		lblEndereo.setBounds(10, 117, 46, 14);
		panelDadosPessoais.add(lblEndereo);
		
		lblMunicpio = new JLabel("Município");
		lblMunicpio.setBounds(10, 160, 46, 14);
		panelDadosPessoais.add(lblMunicpio);
		
		lblNome = new JLabel("Nome");
		lblNome.setBounds(352, 11, 46, 14);
		panelDadosPessoais.add(lblNome);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setBounds(352, 44, 46, 14);
		panelDadosPessoais.add(lblCpf);
		
		lblUf = new JLabel("UF");
		lblUf.setBounds(262, 160, 20, 14);
		panelDadosPessoais.add(lblUf);
		
		lblCelular = new JLabel("Celular");
		lblCelular.setBounds(401, 160, 46, 14);
		panelDadosPessoais.add(lblCelular);
		
		txtRgm = new JFormattedTextField();
		txtRgm.setBounds(46, 8, 125, 20);
		panelDadosPessoais.add(txtRgm);
		
		txtNome = new JFormattedTextField();
		txtNome.setBounds(401, 8, 125, 20);
		panelDadosPessoais.add(txtNome);
		
		txtCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		txtCpf.setBounds(389, 41, 125, 20);
		panelDadosPessoais.add(txtCpf);
		
		txtDataNascimento = new JFormattedTextField(new MaskFormatter("##/##/####"));
		txtDataNascimento.setBounds(122, 41, 125, 20);
		panelDadosPessoais.add(txtDataNascimento);
		
		txtEmail = new JFormattedTextField();
		txtEmail.setBounds(46, 76, 238, 20);
		panelDadosPessoais.add(txtEmail);
		
		txtEndereco = new JFormattedTextField();
		txtEndereco.setBounds(56, 114, 228, 20);
		panelDadosPessoais.add(txtEndereco);
		
		txtMunicipio = new JFormattedTextField();
		txtMunicipio.setBounds(66, 157, 125, 20);
		panelDadosPessoais.add(txtMunicipio);
		
		txtCelular = new JFormattedTextField();
		txtCelular.setBounds(445, 157, 125, 20);
		panelDadosPessoais.add(txtCelular);
		
		cmbUf = new JComboBox();
		cmbUf.setModel(new DefaultComboBoxModel(new String[] {"", "SP", "RJ", "MG"}));
		cmbUf.setBounds(283, 156, 46, 22);
		panelDadosPessoais.add(cmbUf);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					//Cria o objeto aluno para pegar os dados da tela
					aluno = new Aluno();
					aluno.setRGM(ABORT);(txtRgm.getText());
					aluno.setNOME_ALUNO(txtNome.getText());
					aluno.setDTA_NASCIMENTO(txtDataNascimento.getText());
					aluno.setEMAIL(txtEmail.getText());
					aluno.setENDERECO(txtEndereco.getText());
					aluno.setMUNICIPIO(txtMunicipio.getText());
					aluno.setUF((String) cmbUf.getSelectedItem());
					aluno.setTELEFONE(txtCelular.getText());
				
					
					//Abrir conexão
					dao = new AlunoDAO();
					
					//Salvar
					dao.salvar(aluno);
					lblMensagemErro.setText("Salvo com Sucesso!");
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					lblMensagemErro.setText("Erro ao Salvar");
				}
				
				
			}
		});
		btnSalvar.setBounds(10, 220, 89, 23);
		panelDadosPessoais.add(btnSalvar);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					//Cria o objeto aluno para pegar os dados da tela
					aluno = new Aluno();
					aluno.setRGM(ABORT);(txtRgm.getText());
					aluno.setNOME_ALUNO(txtNome.getText());
					aluno.setDTA_NASCIMENTO(txtDataNascimento.getText());
					aluno.setEMAIL(txtEmail.getText());
					aluno.setENDERECO(txtEndereco.getText());
					aluno.setMUNICIPIO(txtMunicipio.getText());
					aluno.setUF((String) cmbUf.getSelectedItem());
					aluno.setTELEFONE(txtCelular.getText());
					
					//Abrir conexão
					dao = new AlunoDAO();
					
					//Atualizar
					dao.alterar(aluno);
					lblMensagemErro.setText("Alterado com Sucesso!");
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					lblMensagemErro.setText("Erro ao Alterar");
				}
			}
		});
		btnAtualizar.setBounds(122, 220, 89, 23);
		panelDadosPessoais.add(btnAtualizar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					//Abrir conexão
					dao = new AlunoDAO();
					
					//Excluir
					String codigoRgm = txtRgm.getText();
					dao.excluir(codigoRgm);
					lblMensagemErro.setText("Excluido com Sucesso!");
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					lblMensagemErro.setText("Erro ao Excluir");
				}
			}
		});
		btnExcluir.setBounds(240, 220, 89, 23);
		panelDadosPessoais.add(btnExcluir);
		
		btnLimparTela = new JButton("Limpar Tela");
		btnLimparTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRgm.setText(null);
				txtNome.setText(null);
				txtDataNascimento.setText(null);
				txtCpf.setText(null);
				txtEmail.setText(null);
				txtEndereco.setText(null);
				txtMunicipio.setText(null);
				txtCelular.setText(null);
				cmbUf.setSelectedIndex(0);
				lblMensagemErro.setText(null);
			}
		});
		btnLimparTela.setBounds(352, 220, 89, 23);
		panelDadosPessoais.add(btnLimparTela);
		
		lblMensagemErro = new JLabel("New label");
		lblMensagemErro.setBounds(98, 306, 494, 14);
		panelDadosPessoais.add(lblMensagemErro);
		
		panelCurso = new JPanel();
		tabbedPane.addTab("Curso", null, panelCurso, null);
		panelCurso.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Curso");
		lblNewLabel_1.setBounds(10, 11, 46, 14);
		panelCurso.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Campus");
		lblNewLabel_2.setBounds(10, 53, 46, 14);
		panelCurso.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Período");
		lblNewLabel_3.setBounds(10, 94, 46, 14);
		panelCurso.add(lblNewLabel_3);
		
		cmbCurso = new JComboBox();
		cmbCurso.setModel(new DefaultComboBoxModel(new String[] {"Selecione um Curso", "Analise e Desenvolvimento de Sistemas", "Ciências da Computação"}));
		cmbCurso.setBounds(57, 11, 328, 22);
		panelCurso.add(cmbCurso);
		
		cmbCampus = new JComboBox();
		cmbCampus.setModel(new DefaultComboBoxModel(new String[] {"Selecione um Campus", "Tatuapé", "Itaquera", "Penha"}));
		cmbCampus.setBounds(57, 49, 328, 22);
		panelCurso.add(cmbCampus);
		
		rdbtnMatutino = new JRadioButton("Matutino");
		PeriodoBotao.add(rdbtnMatutino);
		rdbtnMatutino.setBounds(62, 90, 86, 23);
		panelCurso.add(rdbtnMatutino);
		
		rdbtnVespertino = new JRadioButton("Vespertino");
		PeriodoBotao.add(rdbtnVespertino);
		rdbtnVespertino.setBounds(149, 90, 98, 23);
		panelCurso.add(rdbtnVespertino);
		
		rdbtnNoturno = new JRadioButton("Noturno");
		PeriodoBotao.add(rdbtnNoturno);
		rdbtnNoturno.setBounds(246, 90, 109, 23);
		panelCurso.add(rdbtnNoturno);
		
		btnSalvarCurso = new JButton("Salvar");
		btnSalvarCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					//Cria o objeto aluno para pegar os dados da tela
					Curso curso = new Curso();
					curso.setNomeCurso((String) cmbCurso.getSelectedItem());
					curso.setCampus((String) cmbCampus.getSelectedItem());
					
					if (rdbtnMatutino.isSelected()) {
						curso.setPeriodo(rdbtnMatutino.getText());
					}
					
					if (rdbtnVespertino.isSelected()) {
						curso.setPeriodo(rdbtnVespertino.getText());
					}
					
					if (rdbtnMatutino.isSelected()) {
						curso.setPeriodo(rdbtnMatutino.getText());
					}
					
					//Abrir conexão
					dao = new CursoDAO();
					
					//Salvar
					dao.salvar(curso);
					lblMensagemErro.setText("Salvo com Sucesso!");
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					lblMensagemErro.setText("Erro ao Salvar");
				}
				
			}
		});
		btnSalvarCurso.setBounds(33, 210, 89, 23);
		panelCurso.add(btnSalvarCurso);
		
		btnAtualizarCurso = new JButton("Atualizar");
		btnAtualizarCurso.setBounds(170, 210, 89, 23);
		panelCurso.add(btnAtualizarCurso);
		
		btnExcluirCurso = new JButton("Excluir");
		btnExcluirCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExcluirCurso.setBounds(296, 210, 89, 23);
		panelCurso.add(btnExcluirCurso);
		
		panelNotasEFaltas = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, panelNotasEFaltas, null);
		panelNotasEFaltas.setLayout(null);
		
		lblNewLabel_4 = new JLabel("RGM");
		lblNewLabel_4.setBounds(10, 11, 46, 14);
		panelNotasEFaltas.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Curso");
		lblNewLabel_5.setBounds(10, 47, 46, 14);
		panelNotasEFaltas.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Disciplina");
		lblNewLabel_6.setBounds(10, 83, 46, 14);
		panelNotasEFaltas.add(lblNewLabel_6);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Selecione a Disciplina", "Programação Orientada a Objetos", "Programação Web"}));
		comboBox_3.setBounds(66, 79, 225, 22);
		panelNotasEFaltas.add(comboBox_3);
		
		lblNewLabel_7 = new JLabel("Semestre");
		lblNewLabel_7.setBounds(10, 123, 46, 14);
		panelNotasEFaltas.add(lblNewLabel_7);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Selecione o Semestre", "2023-1", "2023-2"}));
		comboBox_4.setBounds(66, 119, 151, 22);
		panelNotasEFaltas.add(comboBox_4);
		
		lblNewLabel_8 = new JLabel("Nota");
		lblNewLabel_8.setBounds(227, 123, 46, 14);
		panelNotasEFaltas.add(lblNewLabel_8);
		
		textPane = new JTextPane();
		textPane.setBounds(267, 121, 77, 20);
		panelNotasEFaltas.add(textPane);
		
		lblNewLabel_9 = new JLabel("Faltas");
		lblNewLabel_9.setBounds(358, 123, 46, 14);
		panelNotasEFaltas.add(lblNewLabel_9);
		
		textPane_1 = new JTextPane();
		textPane_1.setBounds(404, 123, 77, 20);
		panelNotasEFaltas.add(textPane_1);
		
		formattedTextField_8 = new JFormattedTextField();
		formattedTextField_8.setBounds(46, 8, 132, 20);
		panelNotasEFaltas.add(formattedTextField_8);
		
		textPane_2 = new JTextPane();
		textPane_2.setBounds(214, 8, 237, 20);
		panelNotasEFaltas.add(textPane_2);
		
		textPane_3 = new JTextPane();
		textPane_3.setBounds(56, 47, 237, 20);
		panelNotasEFaltas.add(textPane_3);
		
		panelBoletim = new JPanel();
		tabbedPane.addTab("Boletim", null, panelBoletim, null);
		panelBoletim.setLayout(null);
	}
}
