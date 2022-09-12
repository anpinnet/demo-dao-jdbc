package dao;

import dao.impl.VendedorDaoJDBC;
import dao.impl.DepartamentoDaoJDBC;
import db.DB;

public class FabricaDao {
	
	public static VendedorDao criarVendedorDao() {
		return new VendedorDaoJDBC(DB.getConnection());
	}
	
	public static DepartamentoDao criarDepartamentoDao() {
		return new DepartamentoDaoJDBC(DB.getConnection());
	}

}
