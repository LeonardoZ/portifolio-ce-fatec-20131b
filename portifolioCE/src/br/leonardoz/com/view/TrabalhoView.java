package br.leonardoz.com.view;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JEditorPane;

import br.leonardoz.com.model.Trabalho;

public class TrabalhoView extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JEditorPane pnVisualisador;

	public TrabalhoView() {
		organizar();
	}

	public void iniciar() {
		configurar();
	}

	private void configurar() {
		setModal(true);
		setResizable(false);
		pack();
		setVisible(true);
	}

	private void organizar() {
		pnVisualisador = new JEditorPane();
		pnVisualisador.setFont(Font.getFont("VERDANA"));
		pnVisualisador.setContentType("text/html");
		pnVisualisador.setEditable(false);
		pnVisualisador.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
		add(pnVisualisador);
	}

	public void setConteudoLabel(Trabalho t) {
		pnVisualisador.setText(t.getTexto());
		setTitle(t.getTitulo());
		repaint();
	}

}
