package com.fis.employee1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface Employee1Repository extends JpaRepository<Employee1, Long>  {

}
