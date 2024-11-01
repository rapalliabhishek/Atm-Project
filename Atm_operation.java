package com.atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Atm_operation implements AtmInterface {
ClassAtm atm=new ClassAtm();
Map<Double,String> ministmnt=new HashMap<>();
	@Override
	public void viewBalence() {
		System.out.println("AvailableBalence :"+atm.getBalence());
		
	}

	@Override
	public void depositeAmount(double depositeAmount) {
		
		System.out.println("depositeAmount :"+depositeAmount);
		atm.setBalence(atm.getBalence()+depositeAmount);
		ministmnt.put(depositeAmount, "Deposited Sucessfully");
		viewBalence();
	}

	@Override
	public void withdrawAmounnt(double withdrawAmounnt) {
	if(withdrawAmounnt%100==0) {
		if(withdrawAmounnt<=atm.getBalence()) {
			System.out.println("Collect your Cash: "+withdrawAmounnt);
			atm.setBalence(atm.getBalence()-withdrawAmounnt);
			ministmnt.put(withdrawAmounnt, "Amoutn Withrawn");
			viewBalence();
		}
		else {
			System.out.println("Insufficient Balence");
		}
	}
	else {
		System.out.println("Enter the Ammount in terms of 100");
	}
		
	}

	@Override
	public void viewMiniStatement() {
		Set<Double> set=ministmnt.keySet();
		for(Double d:set) {
			System.out.println(d+"="+ministmnt.get(d));
		}
		
		
	}

	

}
