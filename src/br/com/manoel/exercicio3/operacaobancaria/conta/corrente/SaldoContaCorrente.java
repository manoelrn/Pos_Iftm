package br.com.manoel.exercicio3.operacaobancaria.conta.corrente;

import br.com.manoel.exercicio3.operacaobancaria.conta.Conta;
import br.com.manoel.exercicio3.operacaobancaria.conta.interfaces.SaldoContaInterface;

public class SaldoContaCorrente implements SaldoContaInterface{

	@Override
	public double saldo(Conta conta) {
		double saldoConta = conta.getSaldo();
		
		return saldoConta;
	}
	
}
