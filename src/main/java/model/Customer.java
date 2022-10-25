package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sttm_customer")
public class Customer {
	@Column(name ="ADDRESS_LINE1")
	String addressLine1;
	@Column(name ="ADDRESS_LINE2")
	String addressLine2;
	@Column(name ="ADDRESS_LINE3")
	String addressLine3;
	@Column(name ="ADDRESS_LINE4")
	String addressLine4;
	@Column(name ="ALG_ID")
	String algID;
	@Column(name ="AML_CUSTOMER_GRP")
	String amlCustomer_Grp;
	@Column(name ="AML_REQUIRED")
	String amlRequired;
	@Column(name ="AR_AP_TRACKING")
	String arApTracking;
	@Column(name ="AUTH_STAT")
	String authStat;
	@Column(name ="AUTOGEN_STMTPLAN")
	String autogenStmtplan;
	@Column(name ="AUTO_CREATE_ACCOUNT")
	String autoCreateAccount;
	@Column(name ="AUTO_CUST_AC_NO")
	String autoCustAcNo;
	@Column(name ="CAS_CUST")
	String casCust;
	@Column(name ="CHARGE_GROUP")
	String chargeGroup;
	@Column(name ="CHECKER_DT_STAMP")
	Date checkerDtStamp;
	@Column(name ="CHECKER_ID")
	String checkerId;
	@Column(name ="CHK_DIGIT_VALID_REQD")
	String chkDigitValidReqd;
	@Column(name ="CIF_CREATION_DATE")
	String cifCreationDate;
	@Column(name ="CIF_STATUS")
	String cifStatus;
	@Column(name ="CIF_STATUS_SINCE")
	Date cifStatusSince;
	@Column(name ="CLS_CCY_ALLOWED")
	String clsCCYAllowed;
	@Column(name ="CLS_PARTICIPANT")
	String clsParticipant;
	@Column(name ="CONSOL_TAX_CERT_REQD")
	String consolTaxCertReqd;
	@Column(name ="COUNTRY")
	String country;
	@Column(name ="CREDIT_RATING")
	String creditRating;
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine3() {
		return addressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	public String getAddressLine4() {
		return addressLine4;
	}
	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}
	public String getAlgID() {
		return algID;
	}
	public void setAlgID(String algID) {
		this.algID = algID;
	}
	public String getAmlCustomer_Grp() {
		return amlCustomer_Grp;
	}
	public void setAmlCustomer_Grp(String amlCustomer_Grp) {
		this.amlCustomer_Grp = amlCustomer_Grp;
	}
	public String getAmlRequired() {
		return amlRequired;
	}
	public void setAmlRequired(String amlRequired) {
		this.amlRequired = amlRequired;
	}
	public String getArApTracking() {
		return arApTracking;
	}
	public void setArApTracking(String arApTracking) {
		this.arApTracking = arApTracking;
	}
	public String getAuthStat() {
		return authStat;
	}
	public void setAuthStat(String authStat) {
		this.authStat = authStat;
	}
	public String getAutogenStmtplan() {
		return autogenStmtplan;
	}
	public void setAutogenStmtplan(String autogenStmtplan) {
		this.autogenStmtplan = autogenStmtplan;
	}
	public String getAutoCreateAccount() {
		return autoCreateAccount;
	}
	public void setAutoCreateAccount(String autoCreateAccount) {
		this.autoCreateAccount = autoCreateAccount;
	}
	public String getAutoCustAcNo() {
		return autoCustAcNo;
	}
	public void setAutoCustAcNo(String autoCustAcNo) {
		this.autoCustAcNo = autoCustAcNo;
	}
	public String getCasCust() {
		return casCust;
	}
	public void setCasCust(String casCust) {
		this.casCust = casCust;
	}
	public String getChargeGroup() {
		return chargeGroup;
	}
	public void setChargeGroup(String chargeGroup) {
		this.chargeGroup = chargeGroup;
	}
	public Date getCheckerDtStamp() {
		return checkerDtStamp;
	}
	public void setCheckerDtStamp(Date checkerDtStamp) {
		this.checkerDtStamp = checkerDtStamp;
	}
	public String getCheckerId() {
		return checkerId;
	}
	public void setCheckerId(String checkerId) {
		this.checkerId = checkerId;
	}
	public String getChkDigitValidReqd() {
		return chkDigitValidReqd;
	}
	public void setChkDigitValidReqd(String chkDigitValidReqd) {
		this.chkDigitValidReqd = chkDigitValidReqd;
	}
	public String getCifCreationDate() {
		return cifCreationDate;
	}
	public void setCifCreationDate(String cifCreationDate) {
		this.cifCreationDate = cifCreationDate;
	}
	public String getCifStatus() {
		return cifStatus;
	}
	public void setCifStatus(String cifStatus) {
		this.cifStatus = cifStatus;
	}
	public Date getCifStatusSince() {
		return cifStatusSince;
	}
	public void setCifStatusSince(Date cifStatusSince) {
		this.cifStatusSince = cifStatusSince;
	}
	public String getClsCCYAllowed() {
		return clsCCYAllowed;
	}
	public void setClsCCYAllowed(String clsCCYAllowed) {
		this.clsCCYAllowed = clsCCYAllowed;
	}
	public String getClsParticipant() {
		return clsParticipant;
	}
	public void setClsParticipant(String clsParticipant) {
		this.clsParticipant = clsParticipant;
	}
	public String getConsolTaxCertReqd() {
		return consolTaxCertReqd;
	}
	public void setConsolTaxCertReqd(String consolTaxCertReqd) {
		this.consolTaxCertReqd = consolTaxCertReqd;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCreditRating() {
		return creditRating;
	}
	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}
	
	
}
