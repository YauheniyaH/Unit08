package com.epam.unit08.task01;



public class CustomerListInspector {

	public static void main(String[] args) {
		CustomerList buyers = new CustomerList();

		buyers.add(new Customer("firstName", "lastName", "middleNmae", 834232424, 998774848));
		buyers.add(new Customer("afirstName2", "lastName2", "middleNmae2", 2134232424, 298774848));
		buyers.add(new Customer("cfirstName3", "lastName3", "middleNmae3", 334232424, 398774848));
		buyers.add(new Customer("zfirstName4", "lastName4", "middleNmae4", 434232424, 498774848));
		buyers.add(new Customer("hfirstName5", "lastName5", "middleNmae5", 534232424, 598774848));

		System.out.println(buyers.getCustomer(0).toString());

		//System.out.println(buyers.findByCardNumber(23, 444444444).toString());

		buyers.sortCustomers();

		for (int i = 0;i< buyers.size(); i++) {
			System.out.println(buyers.getCustomer(i).toString());
		}
		

	}

}
