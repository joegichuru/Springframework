package com.joseph;

/**
 * Created by joseph on 7/2/17.
 */
public class Employee {
    private String name;
    private int id;
    private Manager manager;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
