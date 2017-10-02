package br.com.manoel.exercicio3.operacaobancaria.conta.corrente;

import br.com.manoel.exercicio3.operacaobancaria.conta.Conta;
import br.com.manoel.exercicio3.operacaobancaria.conta.interfaces.ValidarSaldoContaInterface;

public class ValidarSaldoContaCorrente implements ValidarSaldoContaInterface{

	@Override
	public boolean validarSaldo(Conta conta, double valor) {
		
		if(conta.getSaldo() < valor) {
			return false;
		}
		
		return true;
	}
}
