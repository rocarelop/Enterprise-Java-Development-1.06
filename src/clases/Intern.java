package clases;

public class Intern extends Employee{

    private final int SALARY_MAX = 20000;

    public Intern(String name, String email, String department, int salary) {
        super(name, email, department, salary);

        if(salary<=SALARY_MAX){
            this.setSalary(salary);
        }else{
            this.setSalary(SALARY_MAX);
        }
    }

    @Override
    public void setSalary(int salary) {

        if(salary<=SALARY_MAX){
            super.setSalary(salary);
        }else{
            super.setSalary(SALARY_MAX);
        }
    }

    public int getSALARY_MAX() {
        return SALARY_MAX;
    }


}
