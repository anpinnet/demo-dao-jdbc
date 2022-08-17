package aplicativo;

import java.util.Date;

import dao.FabricaDao;
import dao.VendedorDao;
import entidades.Departamento;
import entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		Departamento obj = new Departamento(1, "Livro");
		
		Vendedor vendedor = new Vendedor(21, "Bob", "Bob@gmail.com", new Date(), 3000.00, obj);
		
		VendedorDao vendedorDao = FabricaDao.criarVendedorDao();
		
		System.out.println(vendedor);

	}

}
