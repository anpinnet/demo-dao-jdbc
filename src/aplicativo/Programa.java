package aplicativo;

import java.util.List;
import java.util.Date;
import java.util.Scanner;

import dao.FabricaDao;
import dao.VendedorDao;
import entidades.Departamento;
import entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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
		
		System.out.println("\n***   Teste 03 : Vendedor FindAll   ***");
		List<Vendedor> list = vendedorDao.findAll();
		for (Vendedor obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n***   Teste 04 : Vendedor Inserir   ***");
		Vendedor novo = new Vendedor(null, "Greg", "greg@gmail.com", new Date(), 4000.0, departamento);
		vendedorDao.insert(novo);
		System.out.println("Inserido! Novo Id : " + novo.getId());
		
		System.out.println("\n***   Teste 05 : Vendedor Update   ***");
		vendedor = vendedorDao.findById(1);
		vendedor.setNome("Martha Waine");		
		vendedorDao.update(vendedor);
		System.out.println("Alteração finalizada!");
		
		System.out.println("\n***   Teste 06 : Vendedor Delete  ***");
		System.out.print("Entre com Id para deleção : ");
		int id = sc.nextInt();
		vendedorDao.deleteById(id);
		System.out.println("Deleção finalizada");
		sc.close();
	}

}
