package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.enums.Desempenho;

public class Reajuste {
	
	
	
	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal percentual = desempenho.percentualReajuste();
		BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
		funcionario.reajustarSalario(reajuste);
		
	}
	
	
	
}
