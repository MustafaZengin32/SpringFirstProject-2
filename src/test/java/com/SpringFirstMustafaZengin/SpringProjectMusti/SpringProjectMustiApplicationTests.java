package com.SpringFirstMustafaZengin.SpringProjectMusti;

import com.mustafazengin.dto.DtoCustomer;
import com.mustafazengin.services.ICustomerService;
import com.mustafazengin.services.IEmployeeService;
import com.mustafazengin.starter.SpringProjectMustiApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {SpringProjectMustiApplication.class})
class SpringProjectMustiApplicationTests {

	@Autowired
	private ICustomerService iCustomerService;


	@Test //test ler hep void doner
	public void testFindCustomerById() {

		DtoCustomer customer = iCustomerService.findCustomerById(1L);

		if (customer!=null){

			System.out.println("Isim "+customer.getName());
		}

		Assertions.assertEquals("Enes",customer.getName());




	}

}
