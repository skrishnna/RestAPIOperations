package com.springboot.rest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.rest.entity.Patient;
import com.springboot.rest.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	public Patient savePatient(Patient patient){
		return patientRepository.save(patient);
	}
	
	public List<Patient> savePatients(List<Patient> Patients){
		return patientRepository.saveAll(Patients);
	}
	
	public List<Patient> getPatients(){
		return patientRepository.findAll();
	}
	
	public Patient getPatientById(int id){
		return patientRepository.findById(id).orElse(null);
	}
	
	public String deletePatient(int id) {
		patientRepository.deleteById(id);
		return "Patient Removed !"+id;
	}
	
	public Patient updatePatient(Patient patient) {
		Patient existingPatient=patientRepository.findById(patient.getPatientId()).orElse(null);
		existingPatient.setPatientName(patient.getPatientName());
		existingPatient.setContactNumber(patient.getContactNumber());
		return patientRepository.save(existingPatient);
	}
}
