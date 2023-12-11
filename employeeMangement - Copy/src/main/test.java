package main;

import java.util.LinkedList;
import java.util.List;

import entity.Employee;

public class test {
    public static List<Employee> getTest() {
        List<Employee> list = new LinkedList<>();
        list.add(new Employee("1", "John", "Doe", true, "01/01/2000", "john.doe@email.com", "1234567890", "123 Main St",
                50000, "Agency A"));
        list.add(new Employee("2", "Jane", "Doe", false, "02/01/2000", "jane.doe@email.com", "2345678901",
                "456 Main St", 60000, "Agency B"));
        list.add(new Employee("3", "Bob", "Smith", true, "03/01/2000", "bob.smith@email.com", "3456789012",
                "789 Main St", 70000, "Agency C"));
        list.add(new Employee("4", "Alice", "Johnson", false, "04/01/2000", "alice.johnson@email.com", "4567890123",
                "111 Main St", 80000, "Agency D"));
        list.add(new Employee("5", "Tom", "Williams", true, "05/01/2000", "tom.williams@email.com", "5678901234",
                "222 Main St", 90000, "Agency E"));
        list.add(new Employee("6", "Sarah", "Jones", false, "06/01/2000", "sarah.jones@email.com", "6789012345",
                "333 Main St", 100000, "Agency F"));
        list.add(new Employee("7", "Mike", "Brown", true, "07/01/2000", "mike.brown@email.com", "7890123456",
                "444 Main St", 110000, "Agency G"));
        list.add(new Employee("8", "Emily", "Davis", false, "08/01/2000", "emily.davis@email.com", "8901234567",
                "555 Main St", 120000, "Agency H"));
        list.add(new Employee("9", "David", "Garcia", true, "09/01/2000", "david.garcia@email.com", "9012345678",
                "666 Main St", 130000, "Agency I"));
        list.add(new Employee("10", "Laura", "Wilson", false, "10/01/2000", "laura.wilson@email.com", "0123456789",
                "777 Main St", 140000, "Agency J"));

        return list;
    }
}
