package com.company;

import com.test.Test;

public class Company {
public void EmpNamne() {
	System.out.println("Employe name is Sharp");
}
public void EmpID() {
	System.out.println("Employe ID is 10123654");
}
	public static void main(String[] args) {
		Company good= new Company();
		good.EmpID();
		good.EmpNamne();
		
	}

}
