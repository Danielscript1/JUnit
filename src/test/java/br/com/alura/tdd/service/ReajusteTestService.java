package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.Reajuste;
import br.com.alura.tdd.modelo.enums.Desempenho;

class ReajusteTestService {
	
	private Reajuste service;
	private Funcionario funcionario;
	@BeforeEach //anotação JUnit que faz a chamada do metodo antes
	public void Inicializar() {
		this.funcionario = new Funcionario("jakcson",LocalDate.now(),new BigDecimal("1000.00"));
		this.service = new Reajuste();
	}

	//teste TDD
	@Test
	public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
		
		service.concederReajuste(funcionario,Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"),funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForBom() {
		
		service.concederReajuste(funcionario,Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"),funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo() {
		
		service.concederReajuste(funcionario,Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"),funcionario.getSalario());
	}
	
	/* --algumas anotaçoes----
	 * @AfterEach -> rodar apos a execução dos teste
	 * @BeforeAll -> roda apenas uma vez antes de todos os metodos, esse metodo tem que ser static
	 * @AfterAll -> roda depois, obs esse metodo que roda apenas uma vez, tem que ser static
	 * */

}
