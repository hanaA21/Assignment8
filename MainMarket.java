package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class MainMarket {
    public static void main(String[] args) {

        List<Marketing> marketingList = new ArrayList<>();
        marketingList.add(new Marketing("John", "ProductA", 1200));
        marketingList.add(new Marketing("Kelly", "ProductB", 900));
        marketingList.add(new Marketing("Bob", "ProductC", 1500));

        remove(marketingList, new Marketing("Jane", "ProductB", 900));

        System.out.println("Size of the list: " + marketingList.size());

        System.out.println("Contents of the list:");
        System.out.println(marketingList);


        Collections.sort(marketingList, Comparator.comparing(Marketing::getSalesAmount));

        List<Marketing> highSalesEmployees = listMoreThan1000(marketingList);
        Collections.sort(highSalesEmployees, Comparator.comparing(Marketing::getEmployeeName));

        System.out.println("Sorted list by sales amount:");
        System.out.println(marketingList);

        System.out.println("Sorted list by employee name for sales > $1000:");
        System.out.println(highSalesEmployees);
    }
    public static void remove(List<Marketing> list, Marketing marketing) {
        list.remove(marketing);
    }

   public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesAmount() > 1000) {
                result.add(marketing);
            }
        }
        return result;
    }
}
