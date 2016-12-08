package com.subbu.patterns.fix;

/**
 * Created by devsu04 on 08/12/16.
 */
public class Contractor implements IEmployee {

    private String name;
    private String department;

    public Contractor(){

    }

    public Contractor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String work(String task) {
        return "Assigned " + task + " to the contractor - " + this.name + "...";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
