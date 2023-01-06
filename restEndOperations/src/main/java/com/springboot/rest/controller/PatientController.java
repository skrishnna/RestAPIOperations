package com.springboot.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.entity.Patient;
import com.springboot.rest.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
//	http://localhost:8080/Patient
	@PostMapping("/Patient")
	public Patient addPet(@RequestBody Patient patient)
	{
		return patientService.savePatient(patient);
	}
	
//	http://localhost:8080/Patients
	@PostMapping("/Patients")
	public List<Patient> addPatients(@RequestBody List<Patient> patients){
		return patientService.savePatients(patients);
	}
	
//	http://localhost:8080/getPatients
	@GetMapping("/getPatients")
	public List<Patient> findAllPatients(){
		return patientService.getPatients();
	}
	
//	http://localhost:8080/getPatientById/4
	@GetMapping("/getPatientById/{id}")
	public Patient getPetById(@PathVariable int id) {
		return patientService.getPatientById(id);
	}

//	
//	http://localhost:8080/updatePatient
	@PutMapping("/updatePatient")
	public Patient updatePatient(@RequestBody Patient patient) {
		return patientService.updatePatient(patient);
	}
	
//	http://localhost:8080/deletePatient/1
	@DeleteMapping("/deletePatient/{id}")
	public String deletePatient(@PathVariable int id) {
		return patientService.deletePatient(id);
	}
	
}
