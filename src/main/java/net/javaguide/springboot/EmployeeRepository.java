package net.javaguide.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

//long type of ID in the angle brackets due to the primary key being the ID and the data type of that being a long
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
