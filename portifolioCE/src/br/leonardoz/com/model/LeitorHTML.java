package br.leonardoz.com.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class LeitorHTML {

	private TratamentoHTML tratamento;

	public LeitorHTML(TratamentoHTML tratamento) {
		super();
		this.tratamento = tratamento;
	}

	public void setTratamento(TratamentoHTML tratamento) {
		this.tratamento = tratamento;
	}

	public String lerPagina(InputStream endereco) {
		InputStreamReader isr = null;
		BufferedReader br = null;
		Charset cs = Charset.forName("UTF-8");
		isr = new InputStreamReader(endereco, cs);
		br = new BufferedReader(isr);
		String todo = processoLeituraArquivo(br);
		return todo;
	}

	private String processoLeituraArquivo(BufferedReader br) {
		StringBuffer x = new StringBuffer();
		String linha = "";
		try {
			while ((linha = br.readLine()) != null) {

				if (linha.contains("#tag#"))
					linha = tratamento.tratar(linha);
				x.append(linha);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return x.toString();
	}
}
