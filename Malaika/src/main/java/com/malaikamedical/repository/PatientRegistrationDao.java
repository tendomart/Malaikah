package com.malaikamedical.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.malaikamedical.model.PatientRegistration;

public interface PatientRegistrationDao extends CrudRepository<PatientRegistration, Integer>,
		PagingAndSortingRepository<PatientRegistration, Integer> {

}
