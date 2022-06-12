package br.com.entra21.modelo2022.principal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import br.com.entra21.modelo2022.principal.modelobase.Medico;
import br.com.entra21.modelo2022.principal.modelobase.Paciente;

public class BancoFicticio {

	public static HashMap<String, Paciente> pacientes = new HashMap<>();

	public static HashMap<String, Medico> medicos = new HashMap<>();

	public static void gerarBancoDados() {
		inicializarMedicos();
		inicializarPacientes();
	}

	private static void inicializarMedicos() {
		// medico Imbituba
		medicos.put("916.149.670-75",
				new Medico("Robin Pereira", (byte) 18, "Outro", "916.149.670-75", "Robina Pereira", "Robin Wood",
						"robin_batata123@yahoo.com", "49 98874-6352", "Rua Wood", "100", "88780-000", "Imbituba", "SC",
						"BR", "Dentista", "CRM/SC 698547", LocalDate.of(2022, 03, 04)));

		// medico Smallville
		medicos.put("023.236.896-45",
				new Medico("Clark Kent", (byte) 35, "Masculino", "023.236.896-45", "Martha Kent", "Jonathan Kent",
						"clarkinho_56@gmail.com", " 47 98852-9633", "Rua dos El", "1569", "56600-006", "Smallville",
						"SC", "BR", "Oftalmologista", "CRM/SC 698512", LocalDate.of(2022, 01, 03)));

		// medico Joa�aba
		medicos.put("897.123.489-63",
				new Medico("Diana Prince", (byte) 35, "Feminino", "897.123.489-63", "Hipolita Prince", "Zeus Prince",
						"diana_prince@gmail.com", " 48 98854-7888", "Av das Pedras", "78", "89600-000", "Joa�aba", "SC",
						"BR", "Neurologista", "CRM/SC 123489", LocalDate.of(2022, 12, 30)));

	}

	private static void inicializarPacientes() {
		// pacientes de Imbituba
		pacientes.put("897.123.489-63",
				new Paciente("Steve Rogers", (byte) 29, "Masculino", "897.123.489-63", "Sarah Rogers", "Joseph Rogers",
						"steve.rogers@yahoo.com", "47 98965-5263", "Av das Americas", "407", "88780-000", "Imbituba",
						"SC", "BR", "Remo��o dos dentes do siso", LocalDateTime.of(2022 - 04 - 05, 11, 05, 59, 23),
						LocalDateTime.now()));

		pacientes.put("023.156.159-62",
				new Paciente("Peter Parker", (byte) 21, "Masculino", "023.156.159-62", "Mary Parker", "Richard Parker",
						"peter.parker@gmail.com", " 47 98563-4541", "Rua dos Limoeiros", "569", "88780-000", "Imbituba",
						"SC", "BR", "Limpeza dent�ria", LocalDateTime.of(2022 - 06 - 05, 13, 07, 59, 23),
						LocalDateTime.now()));

		// pacientes de Smallville
		pacientes.put("123.563.159-85",
				new Paciente("Anthony Stark", (byte) 58, "Masculino", "123.563.159-85", "Maria Stark", "Howard Stark",
						"iron_man@gmail.com", " 48 98845-2274", "Av da F�", "123", "56600-006", "Smallville", "SC",
						"BR", "Troca de lentes", LocalDateTime.of(2022 - 05 - 31, 19, 8, 53, 23), LocalDateTime.now()));

		pacientes.put("123.456.789-96",
				new Paciente("Natasha Romanoff", (byte) 32, "Feminino", "123.456.789-96", "Melina Vostokoff",
						"Alexei Shostakov", "black_widowahoo.com", " 47 99656-8987", "Rua das Flores", "99",
						"56600-006", "Smallville", "SC", "BR", "Dores fortes de cabe�a",
						LocalDateTime.of(2022 - 05 - 23, 19, 03, 42, 23), LocalDateTime.now()));

		// pacientes de Joa�aba
		pacientes.put("023.563.698.96",
				new Paciente("Thor Odinson", (byte) 33, "Masculino", "023.563.698.96", "Joro", "Odin",
						"thunder_god@gmail.com", " 47 98874-6323", "Av Mjolnir", "1903", "89600-000", "Joa�aba", "SC",
						"BR", "Enxaqueca", LocalDateTime.of(2021 - 9 - 02, 15, 00, 42, 23), LocalDateTime.now()));

		pacientes.put("023.102.558-85",
				new Paciente("Wanda Maximoff", (byte) 28, "Feminino", "023.102.558-85", "Magda Maximoff",
						"Erik Lehnsherr", "scarlet_witch@gmail.com", "49 98847-1002", "Av Vis�o", "456", "89600-000",
						"Joa�aba", "SC", "BR", "Exames de rotina", LocalDateTime.of(2021 - 03 - 12, 05, 33, 42, 23),
						LocalDateTime.now()));

	}
}
