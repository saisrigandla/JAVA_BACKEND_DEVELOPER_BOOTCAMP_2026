public class EmployeeSalary {
    public static void main(String[] args) {
        String employeeName="Saisri Gandla";
       double basicSalary=50000;
        double hra=(20.0/100.0)*basicSalary;
        double da=(10.0/100.0)*basicSalary;
        double grossSalary = basicSalary+hra+da;
        System.out.println("=========== EMPLOYEE SALARY ===========");
        System.out.println("Employee Name : "+employeeName);
        System.out.println();
        System.out.println("Basic Salary  : "+basicSalary);
        System.out.println("HRA(20%)      : "+hra ); 
        System.out.println("DA (10%)      : "+da);
        System.out.println();
        System.out.println("Gross Salary  : "+grossSalary);
        System.out.println("=======================================");
            }
}
