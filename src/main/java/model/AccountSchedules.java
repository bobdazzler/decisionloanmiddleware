package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cltb_account_schedules")
public class AccountSchedules {
	@Column(name ="ACCOUNT_GL")
	String accountGl;
	@Column(name ="ACCOUNT_NUMBER")
	String accountNumber;
	@Column(name ="ACCRUED_AMOUNT")
	int accruedAmount;
	@Column(name ="ADJ_AMOUNT")
	int adjAmount;
	@Column(name ="ADJ_SETTLED")
	int adjSettled;
	@Column(name ="AMOUNT_DUE")
	int amountDue;
	@Column(name ="AMOUNT_OVERDUE")
	int amountOverdue;
	@Column(name ="AMOUNT_READJUSTED")
	int amountReadjusted;
	@Column(name ="AMOUNT_SETTLED")
	int amountSettled;
	@Column(name ="AMOUNT_WAIVED")
	int amountWaived;
	@Column(name ="BRANCH_CODE")
	String branchCode;
	@Column(name ="CAPITALIZED")
	String capitalized;
	@Column(name ="COMPONENT_NAME")
	String componentName;
	@Column(name ="DLY_AVG_AMT")
	int dlyAvgAmt;
	@Column(name ="EMI_AMOUNT")
	int emiAmount;
	@Column(name ="EVENT_SEQ_NO")
	int eventSeqNo;
	@Column(name ="FORMULA_NAME")
	String formulaName;
	@Column(name ="GRACE_DAYS")
	int graceDays;
	@Column(name ="IRR_APPLICABLE")
	String irrApplicable;
	@Column(name ="LAST_PMNT_VALUE_DATE")
	Date lastPmntValueDate;
	@Column(name ="LAST_READJ_XRATE")
	int lastReadJXrate;
	@Column(name ="LAST_SUSP_XRATE")
	int lastSuspXrate;
	@Column(name ="LCY_EQUIVALENT")
	int lcyEquivalent;
	@Column(name ="LIST_AVG_AMT")
	String listAvgAmt;
	@Column(name ="LIST_DAYS")
	String listDays;
	public String getAccountGl() {
		return accountGl;
	}
	public void setAccountGl(String accountGl) {
		this.accountGl = accountGl;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccruedAmount() {
		return accruedAmount;
	}
	public void setAccruedAmount(int accruedAmount) {
		this.accruedAmount = accruedAmount;
	}
	public int getAdjAmount() {
		return adjAmount;
	}
	public void setAdjAmount(int adjAmount) {
		this.adjAmount = adjAmount;
	}
	public int getAdjSettled() {
		return adjSettled;
	}
	public void setAdjSettled(int adjSettled) {
		this.adjSettled = adjSettled;
	}
	public int getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(int amountDue) {
		this.amountDue = amountDue;
	}
	public int getAmountOverdue() {
		return amountOverdue;
	}
	public void setAmountOverdue(int amountOverdue) {
		this.amountOverdue = amountOverdue;
	}
	public int getAmountReadjusted() {
		return amountReadjusted;
	}
	public void setAmountReadjusted(int amountReadjusted) {
		this.amountReadjusted = amountReadjusted;
	}
	public int getAmountSettled() {
		return amountSettled;
	}
	public void setAmountSettled(int amountSettled) {
		this.amountSettled = amountSettled;
	}
	public int getAmountWaived() {
		return amountWaived;
	}
	public void setAmountWaived(int amountWaived) {
		this.amountWaived = amountWaived;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getCapitalized() {
		return capitalized;
	}
	public void setCapitalized(String capitalized) {
		this.capitalized = capitalized;
	}
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public int getDlyAvgAmt() {
		return dlyAvgAmt;
	}
	public void setDlyAvgAmt(int dlyAvgAmt) {
		this.dlyAvgAmt = dlyAvgAmt;
	}
	public int getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(int emiAmount) {
		this.emiAmount = emiAmount;
	}
	public int getEventSeqNo() {
		return eventSeqNo;
	}
	public void setEventSeqNo(int eventSeqNo) {
		this.eventSeqNo = eventSeqNo;
	}
	public String getFormulaName() {
		return formulaName;
	}
	public void setFormulaName(String formulaName) {
		this.formulaName = formulaName;
	}
	public int getGraceDays() {
		return graceDays;
	}
	public void setGraceDays(int graceDays) {
		this.graceDays = graceDays;
	}
	public String getIrrApplicable() {
		return irrApplicable;
	}
	public void setIrrApplicable(String irrApplicable) {
		this.irrApplicable = irrApplicable;
	}
	public Date getLastPmntValueDate() {
		return lastPmntValueDate;
	}
	public void setLastPmntValueDate(Date lastPmntValueDate) {
		this.lastPmntValueDate = lastPmntValueDate;
	}
	public int getLastReadJXrate() {
		return lastReadJXrate;
	}
	public void setLastReadJXrate(int lastReadJXrate) {
		this.lastReadJXrate = lastReadJXrate;
	}
	public int getLastSuspXrate() {
		return lastSuspXrate;
	}
	public void setLastSuspXrate(int lastSuspXrate) {
		this.lastSuspXrate = lastSuspXrate;
	}
	public int getLcyEquivalent() {
		return lcyEquivalent;
	}
	public void setLcyEquivalent(int lcyEquivalent) {
		this.lcyEquivalent = lcyEquivalent;
	}
	public String getListAvgAmt() {
		return listAvgAmt;
	}
	public void setListAvgAmt(String listAvgAmt) {
		this.listAvgAmt = listAvgAmt;
	}
	public String getListDays() {
		return listDays;
	}
	public void setListDays(String listDays) {
		this.listDays = listDays;
	}
	
	
	

}
