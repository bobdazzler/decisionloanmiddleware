package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="sttm_cust_personal")
public class Cust_Personal {
	@Column(name ="AGE_PROOF_SUBMITTED")
	String ageProofSubmittted;
	@Column(name="BIRTH_COUNTRY")
	String birthCountry;
	@Column(name="CUSTOMER_NO")
	String customerNo;
	@Column(name="CUSTOMER_PREFIX")
	String customerPrefix;
	@Column(name="CUSTOMER_PREFIX1")
	String customerPrefix1;
	@Column(name="CUSTOMER_PREFIX2")
	String customerPrefix2;
	@Column(name="CUST_COMM_MODE")
	String custCommMode;
	@Column(name="DATE_OF_BIRTH")
	Date dateOfBirth;
	@Column(name="D_ADDRESS1")
	String dAddress1;
	@Column(name="D_ADDRESS2")
	String dAddress2;
	@Column(name="D_ADDRESS3")
	String dAddress3;
	@Column(name="D_ADDRESS4")
	String dAddress4;
	@Column(name="D_COUNTRY")
	String dCountry;
	@Column(name="D_PINCODE")
	String dPincode;
	@Column(name="E_MAIL")
	String eMail;
	@Column(name="FAX")
	String fax;
	@Column(name="FAX_ISD_NO")
	int fax_ISD_No;
	@Column(name="FIRST_NAME")
	String firstName;
	@Column(name="HOME_TEL_ISD")
	int homeTelISD;
	@Column(name="HOME_TEL_NO")
	String homeTelNo;
	@Column(name="LAST_NAME")
	String lastName;
	@Column(name="LEGAL_GUARDIAN")
	String legalGuardian;
	@Column(name="MIDDLE_NAME")
	String middleName;
	@Column(name="MINOR")
	String minor;
	@Column(name="MOBILE_NUMBER")
	String mobileNumber;
	public String getAgeProofSubmittted() {
		return ageProofSubmittted;
	}
	public void setAgeProofSubmittted(String ageProofSubmittted) {
		this.ageProofSubmittted = ageProofSubmittted;
	}
	public String getBirthCountry() {
		return birthCountry;
	}
	public void setBirthCountry(String birthCountry) {
		this.birthCountry = birthCountry;
	}
	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	public String getCustomerPrefix() {
		return customerPrefix;
	}
	public void setCustomerPrefix(String customerPrefix) {
		this.customerPrefix = customerPrefix;
	}
	public String getCustomerPrefix1() {
		return customerPrefix1;
	}
	public void setCustomerPrefix1(String customerPrefix1) {
		this.customerPrefix1 = customerPrefix1;
	}
	public String getCustomerPrefix2() {
		return customerPrefix2;
	}
	public void setCustomerPrefix2(String customerPrefix2) {
		this.customerPrefix2 = customerPrefix2;
	}
	public String getCustCommMode() {
		return custCommMode;
	}
	public void setCustCommMode(String custCommMode) {
		this.custCommMode = custCommMode;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getdAddress1() {
		return dAddress1;
	}
	public void setdAddress1(String dAddress1) {
		this.dAddress1 = dAddress1;
	}
	public String getdAddress2() {
		return dAddress2;
	}
	public void setdAddress2(String dAddress2) {
		this.dAddress2 = dAddress2;
	}
	public String getdAddress3() {
		return dAddress3;
	}
	public void setdAddress3(String dAddress3) {
		this.dAddress3 = dAddress3;
	}
	public String getdAddress4() {
		return dAddress4;
	}
	public void setdAddress4(String dAddress4) {
		this.dAddress4 = dAddress4;
	}
	public String getdCountry() {
		return dCountry;
	}
	public void setdCountry(String dCountry) {
		this.dCountry = dCountry;
	}
	public String getdPincode() {
		return dPincode;
	}
	public void setdPincode(String dPincode) {
		this.dPincode = dPincode;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public int getFax_ISD_No() {
		return fax_ISD_No;
	}
	public void setFax_ISD_No(int fax_ISD_No) {
		this.fax_ISD_No = fax_ISD_No;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getHomeTelISD() {
		return homeTelISD;
	}
	public void setHomeTelISD(int homeTelISD) {
		this.homeTelISD = homeTelISD;
	}
	public String getHomeTelNo() {
		return homeTelNo;
	}
	public void setHomeTelNo(String homeTelNo) {
		this.homeTelNo = homeTelNo;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLegalGuardian() {
		return legalGuardian;
	}
	public void setLegalGuardian(String legalGuardian) {
		this.legalGuardian = legalGuardian;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getMinor() {
		return minor;
	}
	public void setMinor(String minor) {
		this.minor = minor;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
