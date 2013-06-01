package br.leonardoz.com.model;

import java.io.InputStream;

public class EnderecoPaginas {

	private final static String trabalho1 = "/T1.html";

	private final static String trabalho2 = "/T2.html";

	private final static String trabalho3 = "/T3.html";

	private final static String trabalho4 = "/T4.html";

	public static InputStream getTrabalho1() {
		return resourceAsStream(trabalho1);
	}

	public static InputStream getTrabalho2() {
		return resourceAsStream(trabalho2);
	}

	private static InputStream resourceAsStream(String endereco) {
		return System.getProperties().getClass().getResourceAsStream(endereco);
	}

	public static InputStream getTrabalho3() {
		return resourceAsStream(trabalho3);
	}

	public static InputStream getTrabalho4() {
		return resourceAsStream(trabalho4);
	}

}
