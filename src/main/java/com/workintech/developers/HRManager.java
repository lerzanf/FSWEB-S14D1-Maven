package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary,
                     JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public HRManager(long id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper){
        if (index >= 0 && index < juniorDevelopers.length) {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = juniorDeveloper;
            } else {
                System.out.println("Index " + index + " is already occupied by " + juniorDevelopers[index]);
            }
        } else {
            System.out.println("Invalid index: " + index);
        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper){
        if (index >= 0 && index < midDevelopers.length) {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = midDeveloper;
            } else {
                System.out.println("Index " + index + " is already occupied by " + midDevelopers[index]);
            }
        } else {
            System.out.println("Invalid index: " + index);
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper){
        if (index >= 0 && index < seniorDevelopers.length) {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = seniorDeveloper;
            } else {
                System.out.println("Index " + index + " is already occupied by " + seniorDevelopers[index]);
            }
        } else {
            System.out.println("Invalid index: " + index);
        }
    }

}
