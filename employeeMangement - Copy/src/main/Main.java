package main;

import java.util.LinkedList;

import bo.EmployeeBo;
import constant.IConstant;
import entity.Employee;
import util.Validate;

/**
 * Main class is the starting point of the application,
 * it provides a menu for the user to perform operations
 * on the employees such as adding, displaying, updating,
 * deleting, and searching employees.
 * 
 * @see EmployeeBo
 * @see IConstant
 * @see Employee
 * @see Validate
 */
public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        EmployeeBo employeeBo = new EmployeeBo(new LinkedList<>());
        employeeBo.setList(test.getTest());
        do {
            System.out.println("\n------ Employee MANAGE -----");
            System.out.println("1. Add new employee");
            System.out.println("2. Display all employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search");
            System.out.println("6. Exit");

            int choice = Validate.getInt("Your choice: ", "Number is out of range", "Invalid number", 1, 9);
            System.out.println("------------------------------");

            switch (choice) {
                case 1:
                    employeeBo.add();
                    break;

                case 2:
                    employeeBo.display();
                    break;

                case 3:
                    String idUpdate = Validate.getString("Enter id of the employee you want to update: ",
                            "Invalid value", IConstant.CODE);
                    if (employeeBo.update(idUpdate))
                        System.out.println("Update successful");
                    else
                        System.out.println("Id does not exit");
                    break;

                case 4:
                    String id = Validate.getString("Enter id of the employee you want to remove: ?", "Invalid value",
                            IConstant.CODE);
                    if (employeeBo.remove(id))
                        System.out.println("Remove successfully!");
                    else 
                        System.out.println("Remove unsuccessfully!");
                    break;

                case 5:
                    String name = Validate.getString("Enter the name of the employee you want to search: ");
                    employeeBo.search(name).forEach(Employee::display);
                    break;

                case 6:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
