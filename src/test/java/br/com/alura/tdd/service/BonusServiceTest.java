package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService bonusFuncionario = new BonusService();
		/*assertThrows(IllegalArgumentException.class,()->
		bonusFuncionario.calcularBonus(new Funcionario("daniel",LocalDate.now(),new BigDecimal("250000")))
		);*/
		try {
			bonusFuncionario.calcularBonus(new Funcionario("daniel",LocalDate.now(),new BigDecimal("250000")));
			fail("não deu a exception!!");
		}catch (Exception e) {
			assertEquals("funcionario que receber $1000 ou acima , não tem direito a bonus", e.getMessage());
		}
	}

	@Test
	void bonusDeveriaSer10Salario() {
		BonusService bonusFuncionario = new BonusService();
		BigDecimal bonus = bonusFuncionario.calcularBonus(new Funcionario("daniel",LocalDate.now(),new BigDecimal("2500.00")));
		assertEquals(new BigDecimal("250.00"), bonus);
	}

	
}
