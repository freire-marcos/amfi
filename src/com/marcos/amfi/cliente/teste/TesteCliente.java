package com.marcos.amfi.cliente.teste;

import com.marcos.amfi.cliente.Cliente;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente higor = new Cliente("Higor", "(85)99999-9999","email@email.com", "Invista", "Desenvolvedor", "30/03/1996");
		
		System.out.println(higor.getEmpresa());
		
	}

}
