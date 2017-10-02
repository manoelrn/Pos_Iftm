package br.com.manoel.exercicio3.operacaobancaria.conta.interfaces;

import br.com.manoel.exercicio3.operacaobancaria.conta.Conta;

public interface DebitoContaInterface {

	public void debitar(Conta conta, double valor);
	
}
