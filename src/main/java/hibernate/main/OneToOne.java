package hibernate.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hibernate.entity.Department;
import hibernate.entity.Employee;

public class OneToOne 
{
   public static void main(String[] args) 
   {
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JavaHelps" );
      EntityManager entitymanager = emfactory.createEntityManager( );
      entitymanager.getTransaction( ).begin( );

      //Create Department Entity
      Department department = new Department();
      department.setNameDeparment("Development");

      //Store Department
      entitymanager.persist(department);

      //Create Employee Entity
      Employee employee = new Employee();
      employee.setNameEmployee("Satish");
      employee.setSalaryEmployee(45000.0);
      employee.setDegEmployee("Technical Writer");
      employee.setDepartment(department);
      
    //Create Employee Entity
      Employee employee1 = new Employee();
      employee1.setNameEmployee("Satish1");
      employee1.setSalaryEmployee(45000.0);
      employee1.setDegEmployee("Technical Writer1");
      employee1.setDepartment(department);

      //Store Employee
      entitymanager.persist(employee);
      entitymanager.persist(employee1);

      entitymanager.getTransaction().commit();
      entitymanager.close();
      emfactory.close();
   }
}