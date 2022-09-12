package aplicativo;

import java.util.List;
import java.util.Scanner;
import dao.FabricaDao;
import dao.DepartamentoDao;
import entidades.Departamento;

public class Programa2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartamentoDao departamentoDao = FabricaDao.criarDepartamentoDao();
		
		System.out.println("***   Teste 01 : Departamento buscarId   ***");
		Departamento departamento = departamentoDao.buscarId(1);
		System.out.println(departamento);
		
		System.out.println("\n***   Teste 02 : Departamento buscarTodos   ***");
		List<Departamento> lista = departamentoDao.buscarTodos();
		for (Departamento obj : lista) {
			System.out.println(obj);
		}
		
		System.out.println("\n***   Teste 03 : Departamento Inserir   ***");
		Departamento novo = new Departamento(null, "Musica");
		departamentoDao.inserir(novo);
		System.out.println("Inserido novo Id : " + novo.getId());
		
		System.out.println("\n***   Teste 04 : Departamento Alterar   ***");
		Departamento dep = departamentoDao.buscarId(1);
		dep.setNome("Alimentação");
		departamentoDao.alterar(dep);
		System.out.println("Alteração realidada com sucesso");
		
		System.out.println("\n***   Teste 04: Departamento Deletar Id   ***");
		System.out.print("Informe o Id do departamento para deleção : ");
		int dp = sc.nextInt();
		departamentoDao.deletarId(dp);
		System.out.println("Deleção efetuada com sucesso : ");
		sc.close();			
	}

}
