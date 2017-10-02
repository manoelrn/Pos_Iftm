package br.com.manoel.exercicio3.operacaobancaria.conta.interfaces;

import br.com.manoel.exercicio3.operacaobancaria.conta.Conta;

public interface ValidarSaldoContaInterface {

	public boolean validarSaldo(Conta conta, double valor);
	
}
