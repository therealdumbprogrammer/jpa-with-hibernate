package com.thecodealchemist.jpawithhibernate;

import com.thecodealchemist.jpawithhibernate.dao.AuditRepository;
import com.thecodealchemist.jpawithhibernate.dao.UserRepository;
import com.thecodealchemist.jpawithhibernate.entity.Address;
import com.thecodealchemist.jpawithhibernate.entity.Audit;
import com.thecodealchemist.jpawithhibernate.entity.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpawithhibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpawithhibernateApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner(UserRepository userRepository,
											   AuditRepository auditRepository) {
		return args -> {
			User u1 = new User();
			u1.setName("Demo");
			u1.setEmail("demo@demo.com");
			Address uadd = new Address();
			uadd.setCity("C");
			uadd.setState("S");
			uadd.setCountry("CN");
			uadd.setAddress("Address");
			u1.setAddress(uadd);

			userRepository.save(u1);

			System.out.println("==================");

			Audit a1 = new Audit();
			a1.setTitle("Demo-A");
			a1.setCode(101);
			Address aadd = new Address();
			aadd.setCity("AC");
			aadd.setState("AS");
			aadd.setCountry("ACN");
			aadd.setAddress("A-Address");
			a1.setAddress(aadd);

			auditRepository.save(a1);
		};
	}

}
