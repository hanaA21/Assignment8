package Assignments;
import java.util.ArrayList;
import java.util.List;

public class Statistics {
    public static double computeSumOfSalaries(List<? extends EmployeeData> aList) {
        double sum = 0.0;
        for (EmployeeData employee : aList) {
            if (employee instanceof Staff) {
                sum += ((Staff) employee).getSalary();
            } else if (employee instanceof Teacher) {
                sum += ((Teacher) employee).getSalary();
            }
        }
        return sum;
    }

    public static void main(String[] args) {

            List<Staff> staff = new ArrayList<>();
            staff.add(new Staff("John", 110000, 2));
            staff.add(new Staff("Tom", 110000, 4));
            staff.add(new Staff("Edward", 120000, 1));
            staff.add(new Staff("Rich", 90000, 3));
            staff.add(new Staff("Kevin", 100000, 1));

            List<Teacher> teachers = new ArrayList<>();
            teachers.add(new Teacher("Andrew", 110000, 10000));
            teachers.add(new Teacher("Rabelais", 130000, 5500));
            teachers.add(new Teacher("Phil", 135000, 12000));
            teachers.add(new Teacher("Tony", 95000, 8000));

            // Step 1: Implement the combine method, to combine the two lists
            List<EmployeeData> combined = combine(staff, teachers);

            // Step 2: Pass the combined list to computeSumOfSalaries
            double salarySum = Statistics.computeSumOfSalaries(combined);
            System.out.println(salarySum);
        }

        // Step 1: Implement the combine method
        public static List<EmployeeData> combine (List < Staff > staff, List < Teacher > teachers){
            List<EmployeeData> combinedList = new ArrayList<>();
            combinedList.addAll(staff);
            combinedList.addAll(teachers);
            return combinedList;
        }
    }




