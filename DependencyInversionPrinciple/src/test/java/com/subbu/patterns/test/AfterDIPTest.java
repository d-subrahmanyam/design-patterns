package com.subbu.patterns.test;

import com.subbu.patterns.fix.Contractor;
import com.subbu.patterns.fix.Employee;
import com.subbu.patterns.fix.Manager;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by devsu04 on 08/12/16.
 */
public class AfterDIPTest {

    private Manager manager = new Manager();
    private Employee employee;
    private Contractor contractor;

    @Test
    public void testEmployee() {
        employee = new Employee("Subbu","IMAG");
        manager.setEmployee(employee);
        Assert.assertEquals("Assigned T12345 to the employee - Subbu...",manager.manage("T12345"));
    }

    @Test
    public void testContractor() {
        contractor = new Contractor("Subbu","IMAG");
        manager.setEmployee(contractor);
        Assert.assertEquals("Assigned T12345 to the contractor - Subbu...",manager.manage("T12345"));
    }
}
