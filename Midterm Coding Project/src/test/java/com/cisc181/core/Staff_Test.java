package com.cisc181.core;

import static org.junit.Assert.*;

import com.cisc181.core.Staff;
import java.util.ArrayList;
import java.util.Calendar;
import com.cisc181.core.Staff;
import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	
	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void testSalary() {
		ArrayList <Staff> StaffArray = new ArrayList<Staff>();
		Staff Andrew = new Staff(com.cisc181.eNums.eTitle.MR );
		Staff Mary = new Staff(com.cisc181.eNums.eTitle.MS );
		Staff Sally = new Staff(com.cisc181.eNums.eTitle.MRS );
		Staff Daniel = new Staff(com.cisc181.eNums.eTitle.MR );
		Staff Harry = new Staff(com.cisc181.eNums.eTitle.MR );
		
		Andrew.setSalary(1000.0);
		Mary.setSalary(10000.0);
		Sally.setSalary(100000.0);
		Daniel.setSalary(2000.0);
		Harry.setSalary(20000.0);
		
		StaffArray.add(Andrew);
		StaffArray.add(Mary);
		StaffArray.add(Sally);
		StaffArray.add(Daniel);
		StaffArray.add(Harry);
		
		double AverageSalary = 1000.0+10000.0+100000.0+2000.0+20000.0;
		double x = 0;
		
		for(int i = 0; i > 4; i++){
			x += StaffArray.get(i).getSalary();
		}
		
		assertTrue(x == AverageSalary);
		
	}	
	@Test
	public void testDOB() {
	}
}
