package com.subbu.patterns.problem;

/**
 * Created by devsu04 on 08/12/16.
 */
public class Manager {

    private Employee employee;

    private Contractor contractor;

    public Manager(){}

    public String manageEmployee(String task){
        return employee.work(task);
    }

    public String manageContractor(String task){
        return contractor.work(task);
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }
}
