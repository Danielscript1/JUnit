package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.enums.Desempenho;

class ReajusteTestService {
	//teste TDD
	@Test
	public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
		Reajuste service = new Reajuste();
		Funcionario funcionario = new Funcionario("jakcson",LocalDate.now(),new BigDecimal("1000.00"));
		service.concederReajuste(funcionario,Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"),funcionario.getSalario());
	}

}
