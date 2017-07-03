package abstractdemoin;

public class AbstractoOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em  = new PermanentEmp();
		em.empid = 1;
		em.empName = "Harshada";
		em.calculate_salary();
		if(em.avail_leave(4, 'c') == true)
		{
		em.calculate_balance_leaves();
		}
		else
		{
			System.out.println("Invalid leaves assigned");
		}
		
		Employee emtemp = new TemporaryEmp();
		emtemp.empid = 2;
		emtemp.empName = "Jayesh";
		emtemp.calculate_salary();
		if(emtemp.avail_leave(4, 'c') == true)
		{
			emtemp.calculate_balance_leaves();
		}
		else
		{
			System.out.println("Invalid leaves assigned");
		}

	}

}
