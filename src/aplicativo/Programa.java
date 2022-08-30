package aplicativo;

import dao.FabricaDao;
import dao.VendedorDao;
import entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		VendedorDao vendedorDao = FabricaDao.criarVendedorDao();
		
		System.out.println("***   Teste 01 : Vendedor findById   ***");
		Vendedor vendedor = vendedorDao.findById(3);
		
		System.out.println(vendedor);

	}

}
