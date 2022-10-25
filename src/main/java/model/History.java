package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="actb_history")
public class History {
	@Column(name ="AC_BRANCH")
	String acBranch;
	@Column(name ="AC_CCY")
	String acCCY;
	@Column(name ="AC_ENTRY_SR_NO")
	int acEntrySrNo;
	@Column(name ="AC_NO")
	String accountNumber;
	@Column(name ="AML_EXCEPTION")
	String amlException;
	@Column(name ="AMOUNT_TAG")
	String amountTag;
	@Column(name ="AUTH_ID")
	String authId;
	@Column(name ="BANK_CODE")
	String bankCode;
	@Column(name ="BATCH_NO")
	String batchNo;
	@Column(name ="CATEGORY")
	String category;
	@Column(name ="CURR_NO")
	int currNo;
	@Column(name ="CUST_GL")
	String custGl;
	@Column(name ="DONT_SHOWIN_STMT")
	String dontShowinStmt;
	@Column(name ="DRCR_IND")
	String drcrInd;
	@Column(name ="ENTRY_SEQ_NO")
	int entrySeqNo;
	@Column(name ="EVENT")
	String event;
	@Column(name ="EVENT_SR_NO")
	int eventSrNo;
	@Column(name ="EXCH_RATE")
	int exchRate;
	@Column(name ="EXTERNAL_REF_NO")
	String externalRefNo;
	@Column(name ="FCY_AMOUNT")
	int fcyAmount;
	@Column(name ="FINANCIAL_CYCLE")
	String financialCycle;
	@Column(name ="FLG_POSITION_STATUS")
	String flgPositionStatus;
	@Column(name ="GLMIS_UPDATE_FLAG")
	String glmisUpdateFlag;
	@Column(name ="GLMIS_VAL_UPD_FLAG")
	String glmisVAlUpdFlag;
	@Column(name ="IB")
	String ib;
	public String getAcBranch() {
		return acBranch;
	}
	public void setAcBranch(String acBranch) {
		this.acBranch = acBranch;
	}
	public String getAcCCY() {
		return acCCY;
	}
	public void setAcCCY(String acCCY) {
		this.acCCY = acCCY;
	}
	public int getAcEntrySrNo() {
		return acEntrySrNo;
	}
	public void setAcEntrySrNo(int acEntrySrNo) {
		this.acEntrySrNo = acEntrySrNo;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAmlException() {
		return amlException;
	}
	public void setAmlException(String amlException) {
		this.amlException = amlException;
	}
	public String getAmountTag() {
		return amountTag;
	}
	public void setAmountTag(String amountTag) {
		this.amountTag = amountTag;
	}
	public String getAuthId() {
		return authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getCurrNo() {
		return currNo;
	}
	public void setCurrNo(int currNo) {
		this.currNo = currNo;
	}
	public String getCustGl() {
		return custGl;
	}
	public void setCustGl(String custGl) {
		this.custGl = custGl;
	}
	public String getDontShowinStmt() {
		return dontShowinStmt;
	}
	public void setDontShowinStmt(String dontShowinStmt) {
		this.dontShowinStmt = dontShowinStmt;
	}
	public String getDrcrInd() {
		return drcrInd;
	}
	public void setDrcrInd(String drcrInd) {
		this.drcrInd = drcrInd;
	}
	public int getEntrySeqNo() {
		return entrySeqNo;
	}
	public void setEntrySeqNo(int entrySeqNo) {
		this.entrySeqNo = entrySeqNo;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public int getEventSrNo() {
		return eventSrNo;
	}
	public void setEventSrNo(int eventSrNo) {
		this.eventSrNo = eventSrNo;
	}
	public int getExchRate() {
		return exchRate;
	}
	public void setExchRate(int exchRate) {
		this.exchRate = exchRate;
	}
	public String getExternalRefNo() {
		return externalRefNo;
	}
	public void setExternalRefNo(String externalRefNo) {
		this.externalRefNo = externalRefNo;
	}
	public int getFcyAmount() {
		return fcyAmount;
	}
	public void setFcyAmount(int fcyAmount) {
		this.fcyAmount = fcyAmount;
	}
	public String getFinancialCycle() {
		return financialCycle;
	}
	public void setFinancialCycle(String financialCycle) {
		this.financialCycle = financialCycle;
	}
	public String getFlgPositionStatus() {
		return flgPositionStatus;
	}
	public void setFlgPositionStatus(String flgPositionStatus) {
		this.flgPositionStatus = flgPositionStatus;
	}
	public String getGlmisUpdateFlag() {
		return glmisUpdateFlag;
	}
	public void setGlmisUpdateFlag(String glmisUpdateFlag) {
		this.glmisUpdateFlag = glmisUpdateFlag;
	}
	public String getGlmisVAlUpdFlag() {
		return glmisVAlUpdFlag;
	}
	public void setGlmisVAlUpdFlag(String glmisVAlUpdFlag) {
		this.glmisVAlUpdFlag = glmisVAlUpdFlag;
	}
	public String getIb() {
		return ib;
	}
	public void setIb(String ib) {
		this.ib = ib;
	}
	
	
}
