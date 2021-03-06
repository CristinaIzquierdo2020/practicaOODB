package DAO;

import java.util.ArrayList;
import java.util.List;

import org.neodatis.odb.ODB;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

import objetos.Centro;

public class CentroDAO implements IDAO<Centro>{

//	private ODB odb;

	@Override
	public Centro get(String id) {
		return null;
	}
	
	
		
	@Override
	public List<Centro> getAll(ODB odb) {
		List<Centro> centros = new ArrayList();
		IQuery query = new CriteriaQuery(Centro.class);
		Objects<Centro> objectsCentros = odb.getObjects(query);
		
		while (objectsCentros.hasNext()) {
			centros.add(objectsCentros.next());
		}
		
		return centros;
	}
	
	
	@Override
	public void save(Centro centro, ODB odb) {
		odb.store(centro);
	}
	
	

	@Override
	public void update(Centro centro, String nombreDocumento) {}
	
	

	@Override
	public void delete(ODB odb, int codigo) {}
	
}
