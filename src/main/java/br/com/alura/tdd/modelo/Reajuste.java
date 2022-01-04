package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.enums.Desempenho;

public class Reajuste {
	
	
	
	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		if(desempenho == Desempenho.A_DESEJAR) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
			funcionario.reajustarSalario(reajuste);
		}
		
	}
	
	
	
}
