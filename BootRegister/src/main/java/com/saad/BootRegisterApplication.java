package com.saad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.saad.model.Register;
import com.saad.service.RegisterService;

@SpringBootApplication
public class BootRegisterApplication implements CommandLineRunner {
@Autowired
RegisterService rser;
	public static void main(String[] args) {
		SpringApplication.run(BootRegisterApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Register r = new Register("USER2","7816","SAAD", "564546", "tzsaad6@gmail.com");
//		rser.addData(r);
//		 
//		//rser.updateData("USER1");
//		rser.deleteData("USER1");
		List<Register>lst=rser.getData();
		lst.stream().forEach(System.out::println);
	}

}
