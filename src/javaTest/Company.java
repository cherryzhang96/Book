package javaTest;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: zhangchen
 * Date: 2015/12/21
 * Time: 13:38
 * To change this template use File | Settings | File Templates.
 */
public class Company {
        // IMPORTANT: DO NOT MODIFY THIS CLASS
        public static class Employee {
            private final int id;
            private final String name;
            private List<Employee> reports;
            public Employee(int id, String
                    name) {
                this.id = id;
                this.name = name;
                this.reports = new ArrayList<Employee>();
            }
            public int getId() {
                return id;
            }
            public String getName() {
                return name;
            }
            public List<Employee> getReports() {
                return reports;
            }
            public void addReport(Employee employee) {
                reports.add(employee);
            }
        }
//        public static Employee result = null;
//        public static Employee closestCommonManager(Employee ceo, Employee firstEmployee, Employee secondEmployee) {
//            if (null == ceo) {
//                return null;
//            }
//            if (ceo == firstEmployee || ceo == secondEmployee) {
//                result = ceo;
//            }
//            List<Employee> reports = ceo.getReports();
//            if (null != reports && reports.size() > 0) {
//                for (Employee e : reports) {
//                    result = closestCommonManager(e, firstEmployee, secondEmployee);
//                }
//            }
////            System.out.println(result != null ? ceo.getName() : result);
////            System.out.println("---------------"+result != null ? ceo.getName() : result);
//            return result;
//        }


    public static boolean first = false;
    public static boolean second = false;
    public static Employee employee;

    public static Employee closestCommonManager(Employee ceo, Employee firstEmployee, Employee secondEmployee) {
        if (ceo == null || firstEmployee == null || secondEmployee == null) {
            return null;
        }
        if (ceo.getId() == firstEmployee.getId()) {
            first = true;
        }
        if (ceo.getId() == secondEmployee.getId()) {
            second = true;
        }
        if (first && second) {
            return ceo;
        } else {
            List<Employee> reports = ceo.getReports();
            for (Employee e : reports) {
                if (employee == null) {
                    Employee r = closestCommonManager(e, firstEmployee, secondEmployee);
                    if (r != null && employee == null) {
                        employee = ceo;
                    }
                } else {
                    return employee;
                }
            }
            return employee;
        }
    }

    public static void main(String[] args){
        Employee bill = new Employee(1, "bill");
        Employee dom = new Employee(2, "dom");
        Employee samir = new Employee(3, "samir");
        Employee michael = new Employee(4, "michael");
        Employee bob = new Employee(5, "bob");
        Employee peter = new Employee(6, "peter");
        Employee porter = new Employee(7, "porter");
        Employee milton = new Employee(8, "milton");
        Employee nina = new Employee(9, "nina");
        bill.addReport(dom);
        bill.addReport(samir);
        bill.addReport(michael);
        dom.addReport(bob);
        dom.addReport(peter);
        dom.addReport(porter);
        peter.addReport(milton);
        peter.addReport(nina);
        Employee result = closestCommonManager(bill, porter, nina);
    }
}


