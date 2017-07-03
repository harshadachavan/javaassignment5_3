package abstractdemoin;

public abstract class Employee {
	//These are parent class members
	int empid;
	String empName;
	int total_leaves;
	double total_salary;
	
	//we declare abstract functions which will be defined in subclass
	abstract void calculate_balance_leaves();
	
	abstract boolean avail_leave(int no_of_leaves, char type_of_leave);
	
	abstract void calculate_salary();

}
