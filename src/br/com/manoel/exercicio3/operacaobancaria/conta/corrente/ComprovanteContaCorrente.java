package br.com.manoel.exercicio3.operacaobancaria.conta.corrente;

import br.com.manoel.exercicio3.operacaobancaria.conta.Conta;
import br.com.manoel.exercicio3.operacaobancaria.conta.interfaces.ComprovanteContaInterface;

public class ComprovanteContaCorrente implements ComprovanteContaInterface {

	@Override
	public void extrato(Conta conta) {
		System.out.println("O saldo da conta " + conta.getTipoConta() + " do Sr(a) " + conta.getDonoDaConta() + " é de R$: " + conta.getSaldo());
	}
	
}
