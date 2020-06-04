package br.com.fk.cpfvalidator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CPFValidatorJUnitTest {

	@Test
	public void validCpfTest() {
		assertEquals(true, CPFValidator.isCPF("39203191844"));
	}
	
	@Test
	public void notValidCpfTest() {
		assertEquals(false, CPFValidator.isCPF("39203191842"));
	}
	
	@Test
	public void sameSequenceNumberCpfTest() {
		assertEquals(false, CPFValidator.isCPF("11111111111"));
	}

}
