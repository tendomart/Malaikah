package com.malaikamedical.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.malaikamedical.model.PatientRegistration;
import com.malaikamedical.repository.PatientRegistrationDao;

@Service
@Qualifier("patientRegistrationServiceImpl")
public class PatientRegistrationServiceImpl implements Mservice<PatientRegistration>{

	PatientRegistrationDao reg;
	@Override
	public Iterable<PatientRegistration> getAllItems() {
		return reg.findAll();
	}

	@Override
	public void addItem(PatientRegistration fm) {
	reg.save(fm);
	}

	@Override
	public Optional<PatientRegistration> getItemById(int id) {
		return reg.findById(id);
	}

	@Override
	public PatientRegistration findAllById(Iterable<Integer> ids) {
		return (PatientRegistration) reg.findAllById(ids);
	}


	@Override
	public void removeItem(int id) {
		reg.deleteById(id);
	}

	@Override
	public void removeItemByName(PatientRegistration bio) {
		reg.delete(bio);
	}

	@Override
	public void removeAllItems() {
		reg.deleteAll();
	}

}
