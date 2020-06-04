package br.com.fk.cpfvalidator;

public class CPFValidatorTest {
	public static void main(String[] args) {
		boolean cpf = CPFValidator.isCPF("39021071894");
		System.out.println("CPF é válido: " + cpf);
	}
}
