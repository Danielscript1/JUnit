package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;



import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService bonusFuncionario = new BonusService();
		BigDecimal bonus = bonusFuncionario.calcularBonus(new Funcionario("daniel",LocalDate.now(),new BigDecimal("250000")));
		assertEquals(new BigDecimal("0.00"), bonus);
	}

	@Test
	void bonusDeveriaSer10Salario() {
		BonusService bonusFuncionario = new BonusService();
		BigDecimal bonus = bonusFuncionario.calcularBonus(new Funcionario("daniel",LocalDate.now(),new BigDecimal("2500.00")));
		assertEquals(new BigDecimal("250.00"), bonus);
	}

	
}
