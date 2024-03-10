package zad6;

public class Employee {
    String profession;
    WorkBehavior workBehavior;
    SpendFreeTimeBehavior spendFreeTimeBehavior;
    CommuteBehavior commuteBehavior;

    public Employee(){};

    public Employee(String profession, WorkBehavior workBehavior, SpendFreeTimeBehavior spendFreeTimeBehavior, CommuteBehavior commuteBehavior) {
        this.profession = profession;
        this.workBehavior = workBehavior;
        this.spendFreeTimeBehavior = spendFreeTimeBehavior;
        this.commuteBehavior = commuteBehavior;
    }

    public void commute() {
       commuteBehavior.commute();
    }

    public void work() {
        workBehavior.work();
    }

    public void spendFreeTime() {
        spendFreeTimeBehavior.spendFreeTime();
    }
}
