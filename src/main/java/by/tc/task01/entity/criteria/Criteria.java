package by.tc.task01.entity.criteria;

import by.tc.task01.entity.Appliance;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

	private final String groupSearchName;
	private final Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	public String getCritariagroupSearchName(){
		return this.groupSearchName;
	}
	public Map<String, Object> getCritaria(){
		return this.criteria;

}




	public String getGroupSearchName() {
		return groupSearchName;
	}
	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);


	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void delete(String searchCriteria, Object value) {
		criteria.remove(searchCriteria, value);
	}


	public String find (String searchCriteria, float value ) {

		String mapEntryWithID = null;

		if (criteria.containsKey(searchCriteria)) {

			for (Map.Entry entry : criteria.entrySet()) {
				if ((entry.getKey() == searchCriteria)&&criteria.containsValue(value)) mapEntryWithID = entry.toString();
			}
		}
		return mapEntryWithID;
	}
	public boolean find (String searchCriteria, String value ) {


boolean isfound=false;
		if (criteria.containsKey(searchCriteria)) {

			for (Map.Entry entry : criteria.entrySet()) {
				if ((entry.getKey().toString().equals(searchCriteria))&&(entry.getValue().toString().equals(value)))
				{isfound=true;}
			}
		}
		return isfound;
	}

	public String find (String searchCriteria, int value ) {

		String mapEntryWithID = null;

		if (criteria.containsKey(searchCriteria)) {

			for (Map.Entry entry : criteria.entrySet()) {
				if ((entry.getKey() == searchCriteria)&&criteria.containsValue(value)) mapEntryWithID = entry.toString();
			}
		}
		return mapEntryWithID;
	}

	public void print() {
		for (Map.Entry entry : criteria.entrySet()) {
			System.out.print(entry);
		}
		System.out.print("\n");
	}


}

