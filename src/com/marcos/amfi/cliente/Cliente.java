package com.marcos.amfi.cliente;

import java.util.Date;

public class Cliente {
	
	private String nome;
	private String telefone;
	private String email;
	private String empresa;
	private String cargo;
	private String dataDeAniversario;
	
	
	public Cliente(String nome, String telefone, String email, String empresa, String cargo, String aniversario){
		
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.empresa = empresa;
		this.cargo = cargo;
		this.dataDeAniversario = aniversario;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDataDeAniversario() {
		return dataDeAniversario;
	}

	public void setDataDeAniversario(String dataDeAniversario) {
		this.dataDeAniversario = dataDeAniversario;
	}


	


}
