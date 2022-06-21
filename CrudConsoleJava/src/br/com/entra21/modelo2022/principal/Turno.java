package br.com.entra21.modelo2022.principal;

import java.text.SimpleDateFormat;

public enum Turno {

	MANHA("08:30"), MANHAFINAL("12:50"), TARDE("12:51"), TARDEFINAL("18:50"), NOITE("18:51"), NOITEFINAL("23:50");

	private final String TURNO;

	private Turno(String TURNO) {
		this.TURNO = TURNO;
	}

	public String getTURNO() {
		return this.TURNO;
	}

}
