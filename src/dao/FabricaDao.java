package dao;

import dao.impl.VendedorDaoJDBC;

public class FabricaDao {
	
	public static VendedorDao criarVendedorDao() {
		return new VendedorDaoJDBC();
	}

}
