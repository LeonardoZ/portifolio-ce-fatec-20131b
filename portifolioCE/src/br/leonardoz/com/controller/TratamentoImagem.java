package br.leonardoz.com.controller;

import java.net.URISyntaxException;
import java.net.URL;

import br.leonardoz.com.model.TratamentoHTML;

public class TratamentoImagem implements TratamentoHTML {

	private static final String FLUXOGRAMA_PNG = "/fluxograma.PNG";
	private String link;

	public TratamentoImagem() {
		URL resource = System.getProperties().getClass().getResource(FLUXOGRAMA_PNG);
		try {
			
			System.err.println(resource);
			link = resource.toURI().toString();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String tratar(String input) {
		if (input.contains("#tag#")) {
			String replaceFirst = input.replaceFirst("#tag#", link);
			return replaceFirst;
		}

		return null;
	}

}
