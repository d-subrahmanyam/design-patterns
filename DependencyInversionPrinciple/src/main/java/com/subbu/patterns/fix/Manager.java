package com.subbu.patterns.fix;

/**
 * Created by devsu04 on 08/12/16.
 */
public class Manager {

    private IEmployee employee;

    public Manager(){

    }

    public Manager(IEmployee employee) {
        this.employee = employee;
    }

    public String manage(String task) {
        return employee.work(task);
    }

    public IEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(IEmployee employee) {
        this.employee = employee;
    }
}
