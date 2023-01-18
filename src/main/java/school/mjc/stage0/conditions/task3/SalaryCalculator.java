package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        //Basic Salary > 20000 : taxes - 20% Basic salary < 0 -> "wrong input!"
        double salary1;
        if(salary > 0) {
            if (salary <= 10000){
                salary1 = salary - ((salary * 15) / 100);
                System.out.println(salary1);
            }
            else if (salary > 10000 && salary <= 20000){
                salary1 = salary - ((salary * 18) / 100);
                System.out.println(salary1);
            }
            else if (salary > 20000){
                salary1 = salary - ((salary * 20) / 100);
                System.out.println(salary1);
            }
        }
        else {
            System.out.println("wrong input");
        }
    }
}
