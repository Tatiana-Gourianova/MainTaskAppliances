package by.tc.task01.service.impl;

import by.tc.task01.dao.impl.*;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

	public static final Comparator<Appliance> COMPARE_BY_COUNT = new Comparator<Appliance>() {

		@Override
		public int compare(Appliance lA, Appliance rA) {
			return (int) (lA.getId() - rA.getId());
		}


		public int compare(List<String> o1, List<String> o2) {

			//
			return 0;
		}
	};

	@Override
	public Appliance find (Criteria criteria)throws SQLException, ClassNotFoundException {

		Appliance appliance = null;
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		} else {


			ApplianceReader applianceReader = new ApplianceReader();


			String path = "E:\\Java\\jwd-task01-template_v2\\src\\main\\resources\\";
			String file = "appliances_db.txt";

			ApplianceReader readFromFile = new ApplianceReader(path, file);
		//	SetDataBase A_DB = new SetDataBase(readFromFile); Дописать заполнение sql таблиц и поиск с помощью sql запросов
			List<String> applianceData = applianceReader.takeAll();

			//List<Appliance> findedAppliances=new ArrayList<>();
   			//findedAppliances.add(new Oven());

			applianceData = new ApplianceParse().parse(applianceData);


			ApplianceFilter applianceFilter = new ApplianceFilter();
			List<String> filtredApplianceData = applianceFilter.filter(applianceData, criteria.getGroupSearchName());
			ApplianceBuilder applianceBuilder = new ApplianceBuilder();


			applianceBuilder.build(new ApplianceParse().parse(filtredApplianceData, criteria.getGroupSearchName()), criteria);

			ArrayList<String> foundAppliances = new ArrayList<String>();


		//	public static final Comparator<Appliance> COMPARE_BY_COUNT = new Comparator<Appliance>() {
 	    //ArrayList<String> foundAppliance

			String[] Appliances = applianceData.toArray(new String[filtredApplianceData.size()]);
			System.out.println("found: "+Appliances[applianceBuilder.getApplianceNumberinGroup()]);
			foundAppliances.add(Appliances[applianceBuilder.getApplianceNumberinGroup()]);
		}
				return appliance;
		}


	}
