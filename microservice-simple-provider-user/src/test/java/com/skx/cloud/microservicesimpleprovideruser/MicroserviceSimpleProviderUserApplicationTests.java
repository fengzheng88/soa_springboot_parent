package com.skx.cloud.microservicesimpleprovideruser;

import com.skx.cloud.microservicesimpleprovideruser.dao.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ServiceLoader;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroserviceSimpleProviderUserApplicationTests {

	@Test
	public void contextLoads() {

		ServiceLoader<UserRepository> loader= ServiceLoader.load(UserRepository.class);
		System.out.println("hha");

	}

}
