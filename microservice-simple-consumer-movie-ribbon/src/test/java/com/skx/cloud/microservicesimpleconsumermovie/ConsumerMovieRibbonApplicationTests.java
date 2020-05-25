package com.skx.cloud.microservicesimpleconsumermovie;

import com.netflix.client.config.IClientConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ServiceLoader;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerMovieRibbonApplicationTests {

	@Test
	public void contextLoads() {

		ServiceLoader<IClientConfig>  load=ServiceLoader.load(IClientConfig.class);

		System.out.println(load.iterator());
	}

}
