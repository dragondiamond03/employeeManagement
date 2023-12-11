package bo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import constant.IConstant;
import entity.Employee;
import util.Validate;

/**
 * This is the business object class for the {@link Employee} entity.
 * It implements the {@link IMethod} interface to provide CRUD operations
 * on a list of employees.
 * 
 * @author Bui Tuan Son
 * @version 0.0.1
 * @see IMethod
 * @see Employee
 * @see Validate
 * @see IConstant
 */

public class EmployeeBo implements IMethod<Employee> {
    private List<Employee> list;

    /**
     * Constructs an instance of the EmployeeBo class
     * 
     * @param list a list of employees
     */
    public EmployeeBo(List<Employee> list) {
        this.list = list;
    }

    /**
     * Gets the list of employees
     * 
     * @return the list of employees
     */
    public List<Employee> getList() {
        return list;
    }

    /**
     * Set the list of employees
     * 
     * @param list the list of employees to set
     */
    public void setList(List<Employee> list) {
        this.list = list;
    }

    /**
     * Get the index of an employee in the list based on its id
     * 
     * @param id the id of the employee
     * @return the index of the employee in the list, or -1 if not found
     */
    public int getIndex(String id) {
        for (int i = 0; i < this.list.size(); ++i) {
            if (this.list.get(i).getid().equalsIgnoreCase(id.trim())) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Adds a new employee to the list
     * 
     * @return true if the operation is successful, false otherwise
     * @see Validate#getString(String, String, String)
     * @see IConstant#CODE
     * @see Employee#input()
     */
    @Override
    public boolean add() {
        String id;
        do {
            id = Validate.getString("Enter id: ", "Invalid value", IConstant.CODE);
        } while (getIndex(id) != -1);
        Employee employee = new Employee();
        employee.setid(id);
        employee.input();
        return this.list.add(employee);
    }

    /**
     * Displays all employees in the list
     * 
     * @see Employee#display()
     */
    @Override
    public void display() {
        this.list.forEach(student -> student.display());
    }

    /**
     * Removes an employee from the list based on its id
     * 
     * @param id the id of the employee to remove
     * @return true if the operation is successful, false otherwise
     */
    @Override
    public boolean remove(String id) {
        int index = getIndex(id);
        if (index >= 0) {
            return list.remove(index) != null;
        }
        return false;
    }

    /**
     * Search for employees with given name.
     * @param name the name of the employee to search for.
     * @return a list of employees with the given name.
     */
    public List<Employee> search(String name) {
        List<Employee> listSearch = new ArrayList<>();
        for (Employee employee : this.list) {
            String temp = employee.getfirstName().toLowerCase() + " " + employee.getLastName().toLowerCase();
            if (temp.contains(name.toLowerCase()))
                listSearch.add(employee);
        }
        return listSearch;
    }

    /**
     * Sort the list of employees by salary in ascending order.
     */
    public void sort() {
        this.list.sort(Comparator.comparing(Employee::getSalary));
    }

    /**
     * Update the employee's information with the given id.
     * 
     * @param id the id of the employee to update.
     * @return true if the update was successful, false otherwise.
     */
    @Override
    public boolean update(String id) {
        int index = getIndex(id);
        if (index != -1) {
            this.list.get(index).input();
            return true;
        } else {
            return false;
        }
    }

}
