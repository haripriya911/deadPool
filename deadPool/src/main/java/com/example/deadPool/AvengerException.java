package com.example.deadPool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController

	public class AvengerException {
		@GetMapping(path="/go")
		public String check() {
			return "i am immortal";
		}
		

	}


