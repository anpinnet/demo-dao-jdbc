package aplicativo;


import java.util.List;

import dao.FabricaDao;
import dao.VendedorDao;
import entidades.Departamento;
import entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		VendedorDao vendedorDao = FabricaDao.criarVendedorDao();
		
		System.out.println("***   Teste 01 : Vendedor findById   ***");
		Vendedor vendedor = vendedorDao.findById(3);		
		System.out.println(vendedor);
		
		System.out.println("\n***   Teste 02 : Vendedor produraDepartamento   ***");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> lista = vendedorDao.procuraDepartamento(departamento);
		for (Vendedor obj : lista) {
			System.out.println(obj);
		}
	}

}
