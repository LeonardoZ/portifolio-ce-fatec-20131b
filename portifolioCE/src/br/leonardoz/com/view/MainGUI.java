package br.leonardoz.com.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btTrabalho1;
	private JButton btTrabalho2;
	private JButton btTrabalho3;
	private JButton btTrabalho4;

	public MainGUI() {
		organizar();
		configurar();
	}

	private void configurar() {
		setLocationByPlatform(true);
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("PORTIFÓLIO FATEC INFO NOTURNO -CE- LEONARDO ZAPPAROLI");
		setVisible(true);
	}

	private void organizar() {
		setLayout(new GridLayout(2, 2));

		btTrabalho1 = new JButton("Ditado popular");
		btTrabalho2 = new JButton("Fluxograma e resumo");
		btTrabalho3 = new JButton("Coesão e coerência");
		btTrabalho4 = new JButton("Argumentação");

		add(btTrabalho1);

		add(btTrabalho2);

		add(btTrabalho3);

		add(btTrabalho4);
	}

	public JButton getBtTrabalho1() {
		return btTrabalho1;
	}

	public void setBtTrabalho1(JButton btTrabalho1) {
		this.btTrabalho1 = btTrabalho1;
	}

	public JButton getBtTrabalho2() {
		return btTrabalho2;
	}

	public void setBtTrabalho2(JButton btTrabalho2) {
		this.btTrabalho2 = btTrabalho2;
	}

	public JButton getBtTrabalho3() {
		return btTrabalho3;
	}

	public void setBtTrabalho3(JButton btTrabalho3) {
		this.btTrabalho3 = btTrabalho3;
	}

	public JButton getBtTrabalho4() {
		return btTrabalho4;
	}

	public void setBtTrabalho4(JButton btTrabalho4) {
		this.btTrabalho4 = btTrabalho4;
	}
}
