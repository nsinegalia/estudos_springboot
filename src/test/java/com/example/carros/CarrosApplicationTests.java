package com.example.carros;

import com.example.carros.controller.CarroController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarrosApplicationTests {
	@Autowired
	private CarroController carroController;

	@Test
	void contextLoads() {
	}

	@Test
	void testeHelloWord(){


	}
}
