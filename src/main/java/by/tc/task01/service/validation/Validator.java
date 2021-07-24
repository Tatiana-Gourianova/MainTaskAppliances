package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		// you may add your own code here
		boolean isValid=true;
		if ((criteria.getGroupSearchName()==null)&&(criteria.getCritaria()==null))
			isValid=false;

		return isValid;
	}

}


