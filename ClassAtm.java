package com.atm;

public class ClassAtm {
	 private double depositeAmount;
	  private double withdrawAmount;
	  private double balence;
	public ClassAtm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double getDepositeAmount() {
		return depositeAmount;
	}

	public void setDepositeAmount(double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public double getBalence() {
		return balence;
	}

	public void setBalence(double balence) {
		this.balence = balence;
	}

	@Override
	public String toString() {
		return "ClassAtm [depositeAmount=" + depositeAmount + ", withdrawAmount=" + withdrawAmount + ", balence="
				+ balence + "]";
	}
	


}
