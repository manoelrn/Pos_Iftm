package br.com.manoel.exercicio3.operacaobancaria.conta.testes;

import br.com.manoel.exercicio3.operacaobancaria.conta.Conta;
import br.com.manoel.exercicio3.operacaobancaria.conta.corrente.ComprovanteContaCorrente;
import br.com.manoel.exercicio3.operacaobancaria.conta.corrente.DebitoContaCorrente;
import br.com.manoel.exercicio3.operacaobancaria.conta.corrente.SaldoContaCorrente;
import br.com.manoel.exercicio3.operacaobancaria.conta.corrente.ValidarSaldoContaCorrente;
import br.com.manoel.exercicio3.operacaobancaria.conta.interfaces.ComprovanteContaInterface;
import br.com.manoel.exercicio3.operacaobancaria.conta.interfaces.DebitoContaInterface;
import br.com.manoel.exercicio3.operacaobancaria.conta.interfaces.SaldoContaInterface;
import br.com.manoel.exercicio3.operacaobancaria.conta.interfaces.ValidarSaldoContaInterface;

public class TestaOperacaoConta {
	
	public static void main(String[] args) {
		Conta contaManoel = new Conta();
		
		contaManoel.setTipoConta("Corrente");
		contaManoel.setAgencia(001);
		contaManoel.setConta(100);
		contaManoel.setDonoDaConta("Manoel Nascimento");
		
		double valorADebitar = 500.0;
		/*AQUI OCORREU O COMPORTAMENTO SRP POIS AS CLASSES NÃO ESTAO ACOPLADAS. ESTÃO VOLTADAS A ABSTRAÇÃO
		 * E NÃO A IMPLEMENTAÇÃO - INÍCIO*/
		ValidarSaldoContaInterface validarSaldoConta = new ValidarSaldoContaCorrente();
		
		DebitoContaInterface debitoConta = new DebitoContaCorrente();
		
		SaldoContaInterface saldoConta = new SaldoContaCorrente();
		
		ComprovanteContaInterface comprovanteConta = new ComprovanteContaCorrente();
		
		/*AQUI OCORREU O COMPORTAMENTO DIP POIS AS CLASSES NÃO ESTAO ACOPLADAS. ESTÃO VOLTADAS A ABSTRAÇÃO
		 * E NÃO A IMPLEMENTAÇÃO - FIM*/
		
		/*AQUI OCORREU O COMPORTAMENTO SRP POIS O MECANISMO DE VALIDAÇÃO DE CONTA FOI SEPARADO
		DO MECANISMO DE DEBITAR CONTA*/
		boolean contaValida = validarSaldoConta.validarSaldo(contaManoel, valorADebitar);
		
		if(contaValida == false) {
			System.out.println("Valor do saldo menor que o valor a ser debitado!");
		} else {
			debitoConta.debitar(contaManoel, valorADebitar);
			saldoConta.saldo(contaManoel);
			comprovanteConta.extrato(contaManoel);
		}
		
	}
	
}
