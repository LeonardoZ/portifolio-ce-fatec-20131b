package br.leonardoz.com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;

import br.leonardoz.com.model.EnderecoPaginas;
import br.leonardoz.com.model.LeitorHTML;
import br.leonardoz.com.model.Trabalho;
import br.leonardoz.com.view.MainGUI;
import br.leonardoz.com.view.TrabalhoView;

public class MainController {

	private MainGUI view;
	private TrabalhoView trabalhoVIew;
	private LeitorHTML leitor = new LeitorHTML(new TratamentoImagem());

	public MainController() {
		iniciar();
	}

	private void iniciar() {
		view = new MainGUI();
		configurarListeners();
	}

	private void configurarListeners() {
		view.getBtTrabalho1().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				iniciarPagina(EnderecoPaginas.getTrabalho1(), "Ditado popular");
			}

		});

		view.getBtTrabalho2().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				iniciarPagina(EnderecoPaginas.getTrabalho2(),
						"Fluxograma e resumo");
			}
		});

		view.getBtTrabalho3().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				iniciarPagina(EnderecoPaginas.getTrabalho3(),
						"Coerência e coesão");
			}
		});

		view.getBtTrabalho4().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				iniciarPagina(EnderecoPaginas.getTrabalho4(), "Argumentação");
			}
		});

	}

	private void iniciarPagina(InputStream input, String titulo) {
		trabalhoVIew = new TrabalhoView();
		Trabalho trabalhoModel = leituraDeArquivo(input, titulo);
		trabalhoVIew.setConteudoLabel(trabalhoModel);
		trabalhoVIew.iniciar();

	}

	private Trabalho leituraDeArquivo(InputStream in, String titulo) {
		String lerPagina = leitor.lerPagina(in);
		Trabalho trabalhoModel = new Trabalho();
		trabalhoModel.setTexto(lerPagina);
		trabalhoModel.setTitulo(titulo);
		return trabalhoModel;
	}

}
