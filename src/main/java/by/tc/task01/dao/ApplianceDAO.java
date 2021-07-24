package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.sql.SQLException;
import java.util.List;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria) throws SQLException, ClassNotFoundException;
}
