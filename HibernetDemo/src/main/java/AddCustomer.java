import java.util.List;

public class AddCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust =  new Customer();
		cust.setName("yogesh");
		cust.setEmail("yogesh@gmail.com");
		cust.setCity("latur");
		cust.setDateOfBirth("2001-01-17");
		CustomerDao dao = new CustomerDao();
		dao.add(cust);
		
//		 Fetch Using the single dao
//		CustomerDao dao1 = new CustomerDao();
//		Customer customer = dao1.fetch(3);
//		System.out.println(customer.getName());
//		System.out.println(customer.getEmail());
//		System.out.println(customer.getDateOfBirth());
//		System.out.println(customer.getCity());
		
		
		
		// fetch USng Multiple Dao's
		CustomerDao dao3 = new CustomerDao();
		List<Customer> list = dao3.fetchAll();
		list.forEach(Customer -> {
			System.out.println("-----------------");
			System.out.println(Customer.getName());
			System.out.println(Customer.getEmail());
			System.out.println(Customer.getDateOfBirth());
			System.out.println(Customer.getCity());
		});
		
		
		///fetch by cities
		
		CustomerDao dao4 = new CustomerDao();
		List<Customer> list1 = dao4.fetchByCity("latur");
		list1.forEach(Customer ->{
			System.out.println(Customer.getId());
			System.out.println(Customer.getName());
		});
		
		/// Delete by id
//		int idd =11;
//		CustomerDao dao5 = new CustomerDao();
//		 Customer deletedCustomer= dao5.Delete(idd);
//		System.out.println("Deleted Sucesssfully"+ deletedCustomer.getName());
//		
		
		
		
		
	}


}
