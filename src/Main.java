import com.workintech.Employee.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("****************");

        List <Employee> employees= new LinkedList<>();
        employees.add(new Employee(1,"Beren","Ateş"));
        employees.add(new Employee(1,"Beren","Ateş"));
        employees.add(new Employee(2,"Buse","Kaplan"));
        employees.add(new Employee(2,"Buse","Kaplan"));
        employees.add(new Employee(3,"Ali","Yıldırım"));
        employees.add(new Employee(3,"Ali","Yıldırım"));
        employees.add(new Employee(4,"Zeynep","Özkan"));
        employees.add(new Employee(4,"Zeynep","Özkan"));
        employees.add(new Employee(5,"Sema","Deniz"));


        Map<Integer,Employee> employeeMap=new HashMap<>();
        List<Employee> removeEmployee= new ArrayList<>();

        Iterator<Employee> iterator= employees.iterator();
        while (iterator.hasNext()){
            Employee employee=iterator.next();
            if (employee==null){
                System.out.println("Null olan bir data bulunmuştur");
                continue;
            }
            if (employeeMap.containsKey(employee.getId())){
                removeEmployee.add(employee);
                iterator.remove();
            } else {
                employeeMap.put(employee.getId(), employee);
            }

        }
        System.out.println("Mevcut olanlar:");
        System.out.println(employees);
        System.out.println("Tek olanlar:");
        System.out.println(employeeMap);
        System.out.println("Silinenler:");
        System.out.println(removeEmployee);



    }
}