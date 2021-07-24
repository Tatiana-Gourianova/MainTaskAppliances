package by.tc.task01.main;




import by.tc.task01.dao.impl.ApplianceReader;
import by.tc.task01.dao.impl.SetDataBase;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

import by.tc.task01.entity.TabletPC;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.sql.*;




public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {


		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"


		//System.out.println(MySQLQueryGenerator.generateCreateTableQuery(Person.class));
		Appliance appliance;
		criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 32);
		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 60);

		/************************************/
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 45.5);
		criteriaOven.add(SearchCriteria.Oven.POWER_CONSUMPTION.toString(), 1000);
		criteriaOven.print();
		criteriaOven.delete(SearchCriteria.Oven.CAPACITY.toString(), 32);




		criteriaOven.print();
		/************************************/
		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		/////////////////////////////////////////////////////////////////*/

		 criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 40);
		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 60);

		 appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		/////////////////////////////////////////////////////////////////
		//


		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 8000);

		appliance = service.find(criteriaOven);// find(Object...obj)

		PrintApplianceInfo.print(appliance);



		}





	}



