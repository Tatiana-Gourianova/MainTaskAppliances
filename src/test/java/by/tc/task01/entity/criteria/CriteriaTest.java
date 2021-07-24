package by.tc.task01.entity.criteria;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CriteriaTest {
    private final Map<String,  Object> CriteriaFindData = new HashMap<String, Object>();
    private  String foundedString;
    //  private final String searchCriteria =SearchCriteria.Oven.DEPTH.toString();
    private final float value=60;
    @BeforeEach
    void setUp() {
        Criteria criteriaOven = new Criteria("Oven");

        criteriaOven.add("POWER_CONSUMPTION", 1000);

        criteriaOven.add("WEIGHT", 10);

        criteriaOven.add("CAPACITY", 32);

        criteriaOven.add("DEPTH", 60);

        criteriaOven.add("HEIGHT", 45.5);
        criteriaOven.add("WIDTH", 59.5);

        this.foundedString=criteriaOven.find(SearchCriteria.Oven.DEPTH.toString(),this.value);
    }

    @AfterEach
    void tearDown() {
        CriteriaFindData.clear();
        foundedString="";
    }

    @Test
    void find() {
        String searchCriteria=SearchCriteria.Oven.DEPTH.toString();
        float value=60;

        for (Map.Entry<String, Object> entry: CriteriaFindData.entrySet()) {

            final String testData =(entry.getValue() + "," + entry.getKey());

            final boolean expected =(foundedString==testData);

            final boolean actual = (entry.getKey()==searchCriteria)&&((float)entry.getValue()==value);


            assertEquals(expected, actual);
        }

    }
}