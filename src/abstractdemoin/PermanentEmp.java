package abstractdemoin;

public class PermanentEmp extends Employee{
	//defined set value for type of leaves
	int paid_leave = 10, sick_leave = 10, casual_leave = 10;
	
	double basic, hra,pfa;
	
	//This function displays the number of leaves of the employee
	void print_leave_details() {
		System.out.println("Paid leaves :"+paid_leave);
		System.out.println("Sick leaves :"+sick_leave);
		System.out.println("Casual leaves :"+casual_leave);
		System.out.println("Total leaves :"+total_leaves);
	}
	
	@Override
	void calculate_balance_leaves() {
		// TODO Auto-generated method stub
		//we calculate the leaves and call print function
		
		total_leaves  = paid_leave+sick_leave+casual_leave;
		print_leave_details();
	}

	//check type and number of leave available
	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		// TODO Auto-generated method stub
		if(type_of_leave == 'p')
		{
			if((paid_leave - no_of_leaves) > 0)
			{
				paid_leave = paid_leave - no_of_leaves;
				return true;
			}
		}
		if(type_of_leave == 's')
		{
			if((sick_leave - no_of_leaves) > 0)
			{
				sick_leave = sick_leave - no_of_leaves;
				return true;}
		}
		
		if(type_of_leave == 'c')
		{
			if((casual_leave - no_of_leaves) > 0)
			{
				casual_leave = casual_leave - no_of_leaves;
				return true;}
		}
		
		
		return false;
	}

	//Take employee details and calculate and display their salaries
	@Override
	void calculate_salary() {
		// TODO Auto-generated method stub
		System.out.println("Employee ID "+empid);
		System.out.println("Employee Name "+empName);
		basic = 50000;
		hra = (0.5)*basic;
		pfa = (0.12)*basic;
		total_salary = (basic+hra)-pfa;
		
		System.out.println("Total Salary is : "+total_salary);
	}

}
