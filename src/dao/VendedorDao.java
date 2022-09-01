package dao;

import java.util.List;
import entidades.Vendedor;
import entidades.Departamento;

public interface VendedorDao {
	
	void insert(Vendedor obj);
	void update(Vendedor obj);
	void deleteById(Integer id);
	Vendedor findById(Integer id);
	List<Vendedor> findAll();
	List<Vendedor> procuraDepartamento(Departamento departamento);
}
