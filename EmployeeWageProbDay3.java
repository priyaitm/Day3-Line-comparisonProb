package java_program;
public class EmployeeWageProbDay3 {
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Program");
        int Full_Time =1;
        double empCheck = Math.floor(Math.random() * 10)%2 ;
        if(empCheck == Full_Time) {
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }
}
