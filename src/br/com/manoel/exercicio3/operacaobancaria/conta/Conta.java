package br.com.manoel.exercicio3.operacaobancaria.conta;

public class Conta {
	
	private long agencia;
	
	private long conta;
	
	private String tipoConta;
	
	private String donoDaConta;
	
	private double saldo;

	public Conta() {
		this.saldo = 1000.0;
	}
	
	
	public long getAgencia() {
		return agencia;
	}

	public void setAgencia(long agencia) {
		this.agencia = agencia;
	}

	public long getConta() {
		return conta;
	}

	public void setConta(long conta) {
		this.conta = conta;
	}

	public String getDonoDaConta() {
		return donoDaConta;
	}

	public void setDonoDaConta(String donoDaConta) {
		this.donoDaConta = donoDaConta;
	}


	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getTipoConta() {
		return tipoConta;
	}


	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
}
