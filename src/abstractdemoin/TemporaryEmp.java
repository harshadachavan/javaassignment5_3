package abstractdemoin;

public class TemporaryEmp extends Employee{
	int paid_leave = 5, sick_leave = 5, casual_leave = 5;
	
	double basic, hra,pfa;
	@Override
	void calculate_balance_leaves() {
		// TODO Auto-generated method stub
		total_leaves  = paid_leave+sick_leave+casual_leave;
		System.out.println("Paid leaves :"+paid_leave);
		System.out.println("Sick leaves :"+sick_leave);
		System.out.println("Casual leaves :"+casual_leave);
		System.out.println("Total leaves :"+total_leaves);
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
		basic = 30000;
		hra = (0.5)*basic;
		pfa = (0.12)*basic;
		total_salary = (basic+hra)-pfa;
		System.out.println("Total Salary is : "+total_salary);
	}

}
