package dao;

import java.util.List;
import entidades.Departamento;

public interface DepartamentoDao {
	
	void inserir(Departamento obj);
	void alterar(Departamento obj);
	void deletarId(Integer id);
	Departamento buscarId(Integer id);
	List<Departamento> buscarTodos();

}
