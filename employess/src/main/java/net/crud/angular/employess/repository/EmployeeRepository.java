package net.crud.angular.employess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.crud.angular.employess.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}