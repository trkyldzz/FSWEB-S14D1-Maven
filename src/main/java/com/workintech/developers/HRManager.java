package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[10];
        midDevelopers = new MidDeveloper[10];
        seniorDevelopers = new SeniorDeveloper[10];
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts working");
        setSalary(getSalary() + 5000);
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper, int index) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Invalid index");
            return;
        }

        if (juniorDevelopers[index] != null) {
            System.out.println("This index is already full");
            return;
        }

        juniorDevelopers[index] = juniorDeveloper;
    }

    public void addEmployee(MidDeveloper midDeveloper, int index) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Invalid index");
            return;
        }

        if (midDevelopers[index] != null) {
            System.out.println("This index is already full");
            return;
        }

        midDevelopers[index] = midDeveloper;
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper, int index) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Invalid index");
            return;
        }

        if (seniorDevelopers[index] != null) {
            System.out.println("This index is already full");
            return;
        }

        seniorDevelopers[index] = seniorDeveloper;
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }
}