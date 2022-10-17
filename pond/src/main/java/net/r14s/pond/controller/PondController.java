package net.r14s.pond.controller;

import java.util.Random;
import java.util.random.RandomGenerator;

import net.r14s.pond.record.Fish;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pond")
public class PondController {

	private static final Random RANDOM = new Random();

	@Value("${fishing.catch.probability}")
	private Integer catchProbability;

	private static Logger logger = LoggerFactory.getLogger(PondController.class);

	@GetMapping("/fish")
	public Fish goFish() {
		int catchResult = RANDOM.nextInt(100);
		logger.info("fish number = " + catchResult);
		if(catchResult < catchProbability) {
			return new Fish("Catfish", catchResult/10D);
		}
		return null;
	}

}

