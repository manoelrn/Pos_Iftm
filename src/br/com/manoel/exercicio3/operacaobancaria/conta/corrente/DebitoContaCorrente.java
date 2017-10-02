package br.com.manoel.exercicio3.operacaobancaria.conta.corrente;

import br.com.manoel.exercicio3.operacaobancaria.conta.Conta;
import br.com.manoel.exercicio3.operacaobancaria.conta.interfaces.DebitoContaInterface;

public class DebitoContaCorrente implements DebitoContaInterface{

	@Override
	public void debitar(Conta conta, double valor) {
		double novoValorSaldo = conta.getSaldo() - valor;
		conta.setSaldo(novoValorSaldo);
	}

}
