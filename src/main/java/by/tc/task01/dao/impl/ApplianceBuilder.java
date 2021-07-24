package by.tc.task01.dao.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import java.util.List;

public class ApplianceBuilder {
private int   applianceNumberinGroup;

public void setApplianceNumberinGroup(int aN) {this.applianceNumberinGroup=aN;}
public int getApplianceNumberinGroup(){ return applianceNumberinGroup;}
    public List<Appliance> ApplianceBuilder() {

        return null;
    }



    public void build(List<String> parsedFiltredApplianceData, Criteria criteria) {

        String[] words;

        String[] s2;
        String st2;

        //int[] index = new int[10];
        int count = 0;

        int amountOfCriterias = criteria.getCritaria().values().toArray().length;

        int countApplianceElements = 0;


        for (int j = 0; j < parsedFiltredApplianceData.toArray().length; j++) {

            words = parsedFiltredApplianceData.toArray()[j].toString().split(",");


            for (int k = 0; k < words.length; k++) {

                String st = words[k].replace("= =", " =");
                s2 = st.split("=");//`//("(?<== )(\\f+)(?<=})");
                String criteriaGroupName = s2[1].toString() + s2[2].replace(" }}", "");

                if (criteriaGroupName.equals(criteria.getCritariagroupSearchName())) {
                    amountOfCriterias = criteria.getCritaria().values().toArray().length;
                    countApplianceElements++;
                }
                //считаем количество единиц товара в номенклатуре определенного типа

                st2 = s2[2].replace("}", "");


                //if (isNumber(st2)||float) {
                //if (criteria.getCritariagroupSearchName()!=criteriaGroupName){

                if (criteria.find(s2[1], st2)) {
                    //index.add((Integer) j);//сохраняем индексы тех элементов, которые совпадают с критерием поиска
                    // делаем проверку, относятся ли критерии к одному и тому же элементу
                    //
                    //
                    amountOfCriterias--;
                    if (amountOfCriterias <= 0) {
                       // index[count] = j;
                       // count++;
                        this.setApplianceNumberinGroup(j);
                        amountOfCriterias = criteria.getCritaria().values().toArray().length;
                    }


                }
            }
        }





        int sections = parsedFiltredApplianceData.toArray().length / countApplianceElements;


            this.setApplianceNumberinGroup(getApplianceNumberinGroup()/sections);

              }

}


