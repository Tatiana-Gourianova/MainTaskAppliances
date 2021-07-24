package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.sql.SQLException;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) {

//	public List<Appliance> find(Criteria criteria) throws SQLException, ClassNotFoundException {

/*			ApplianceReader applianceReader=new ApplianceReader();


			String path = "E:\\new_doc\\Java\\JavaWebDeveloper\\ElectronicsFactory\\src\\by\\epam\\task02\\electronics\\controllers\\";
			String file="appliances_db.txt";

			ApplianceReader  readFromFile=new ApplianceReader(path,file);
			SetDataBase A_DB =new SetDataBase(readFromFile);
			List<String> applianceData=applianceReader.takeAll();

			///*	List<String> applianceData=A_DB.GetDataBase();
			for (java.lang.String line : applianceData) {
				System.out.println(line+"!!!");
			}
			ApplianceFilter applianceFilter = new ApplianceFilter();
			List<String> filtredApplianceData = applianceFilter.filter();
			ApplianceBuilder applianceBuilder=new ApplianceBuilder();
			List<Appliance>appliances=applianceBuilder.build(new ApplianceParse().parse(filtredApplianceData));




			return appliances;
		*/
		return  null;}






}




