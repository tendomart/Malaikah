package com.malaikamedical.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "patient_registration")
public class PatientRegistration implements Serializable {
	public PatientRegistration(Integer id, String patient_id, String honorific, String patient_name,
			String hasMedicalInsurance, String gender, String marital_status, Date date_of_birth, String age,
			String occupation, String religion, String language, String address_and_pin, String contact_no,
			String mobile_no, String email, String names_list_left, String names_list_right, String doc_departmt,
			String referred_by_doc, String medical_hist, String signature_of, String signature,
			String relationship_with_patient, Date date, String zip) {
		super();
		this.id = id;
		this.patient_id = patient_id;
		this.honorific = honorific;
		this.patient_name = patient_name;
		this.hasMedicalInsurance = hasMedicalInsurance;
		this.gender = gender;
		this.marital_status = marital_status;
		this.date_of_birth = date_of_birth;
		this.age = age;
		this.occupation = occupation;
		this.religion = religion;
		this.language = language;
		this.address_and_pin = address_and_pin;
		this.contact_no = contact_no;
		this.mobile_no = mobile_no;
		this.email = email;
		this.names_list_left = names_list_left;
		this.names_list_right = names_list_right;
		this.doc_departmt = doc_departmt;
		this.referred_by_doc = referred_by_doc;
		this.medical_hist = medical_hist;
		this.signature_of = signature_of;
		this.signature = signature;
		this.relationship_with_patient = relationship_with_patient;
		this.date = date;
//		this.datetime = datetime;
		this.zip = zip;
	}

	public PatientRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7297680856489744172L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "student_id")
	public String patient_id;
	
	@Column(name = "honorific")
	public String honorific;
	
	@Column(name = "patient_name", unique = true)
	private String patient_name;
	
	@Column(name = "hasMedicalInsurance")
	private String hasMedicalInsurance;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "marital_status")
	private String marital_status;
	
	@Column(name = "date_of_birth")
	private Date date_of_birth;
	
	@Column(name = "age")
	private String age;
	
	@Column(name = "occupation")
	private String occupation;
	
	@Column(name = "religion")
	private String religion;
	
	@Column(name = "language")
	private String language;
	
	
	@Column(name = "address_and_pin")
	private String address_and_pin;
	
	@Column(name = "contact_no")
	private String contact_no;
	
	@Column(name = "mobile_no")
	private String mobile_no;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "names_list_left")
	private String names_list_left;
	
	@Column(name = "names_list_right")
	private String names_list_right;
	
	@Column(name = "doc_departmt")
	private String doc_departmt;
	
	@Column(name = "referred_by_doc")
	private String referred_by_doc;
	
	@Column(name = "medical_hist")
	private String medical_hist;
	
	@Column(name = "signature_of")
	private String signature_of;
	
	@Column(name = "signature")
	private String signature;
	
	@Column(name = "relationship_with_patient")
	private String relationship_with_patient;
	
	@Column(name = "date")
	private Date date;
	
//	@Column(name = "datetime")
//	private DateTimeFormat datetime;
//	
	@Column(name = "zip")
	private String zip;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}

	public String getHonorific() {
		return honorific;
	}

	public void setHonorific(String honorific) {
		this.honorific = honorific;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getHasMedicalInsurance() {
		return hasMedicalInsurance;
	}

	public void setHasMedicalInsurance(String hasMedicalInsurance) {
		this.hasMedicalInsurance = hasMedicalInsurance;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getAddress_and_pin() {
		return address_and_pin;
	}

	public void setAddress_and_pin(String address_and_pin) {
		this.address_and_pin = address_and_pin;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNames_list_left() {
		return names_list_left;
	}

	public void setNames_list_left(String names_list_left) {
		this.names_list_left = names_list_left;
	}

	public String getNames_list_right() {
		return names_list_right;
	}

	public void setNames_list_right(String names_list_right) {
		this.names_list_right = names_list_right;
	}

	public String getDoc_departmt() {
		return doc_departmt;
	}

	public void setDoc_departmt(String doc_departmt) {
		this.doc_departmt = doc_departmt;
	}

	public String getReferred_by_doc() {
		return referred_by_doc;
	}

	public void setReferred_by_doc(String referred_by_doc) {
		this.referred_by_doc = referred_by_doc;
	}

	public String getMedical_hist() {
		return medical_hist;
	}

	public void setMedical_hist(String medical_hist) {
		this.medical_hist = medical_hist;
	}

	public String getSignature_of() {
		return signature_of;
	}

	public void setSignature_of(String signature_of) {
		this.signature_of = signature_of;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getRelationship_with_patient() {
		return relationship_with_patient;
	}

	public void setRelationship_with_patient(String relationship_with_patient) {
		this.relationship_with_patient = relationship_with_patient;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

//	public DateTimeFormat getDatetime() {
//		return datetime;
//	}
//
//	public void setDatetime(DateTimeFormat datetime) {
//		this.datetime = datetime;
//	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
