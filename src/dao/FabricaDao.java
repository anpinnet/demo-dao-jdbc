package dao;

import dao.impl.VendedorDaoJDBC;
import db.DB;

public class FabricaDao {
	
	public static VendedorDao criarVendedorDao() {
		return new VendedorDaoJDBC(DB.getConnection());
	}

}
