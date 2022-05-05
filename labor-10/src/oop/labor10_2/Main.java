package oop.labor10_2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company company=new Company("Sapi");
        company.hireAll("employees.csv");
        company.printAll();
        System.out.println("Alphabetically: ");
        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if(stringCompare(e1.getFirstName(), e2.getFirstName())==0)
                    if(stringCompare(e1.getLastName(),e2.getLastName())>0)
                        return 1;
                    else return -1;
                else if(stringCompare(e1.getFirstName(), e2.getFirstName())>0)
                    return 1;
                else return -1;

            }
        });
        company.printAll();
        System.out.println("Decreasing salary order: ");
        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1.getSalary()>e2.getSalary())
                    return -1;
                else return 1;
            }
        });
        company.printAll();
    }
    public static int stringCompare(String str1, String str2)
    {

        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        if (l1 != l2) {
            return l1 - l2;
        }
        else {
            return 0;
        }
    }
}
