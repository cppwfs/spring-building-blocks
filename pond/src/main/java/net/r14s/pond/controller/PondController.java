package net.r14s.pond.controller;

import java.util.Random;
import java.util.random.RandomGenerator;

import net.r14s.pond.record.Fish;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pond")
public class PondController {

	private static final Random RANDOM = new Random();

	private static final Integer CATCH_PROBABILITY = 60;

	private static Logger logger = LoggerFactory.getLogger(PondController.class);

	@GetMapping("/fish")
	public Fish goFish() {
		int catchResult = RANDOM.nextInt(100);
		logger.info("fish number = " + catchResult);
		if(catchResult < CATCH_PROBABILITY) {
			return new Fish("Catfish", 2.4);
		}
		return null;
	}

}

