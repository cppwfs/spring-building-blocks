package net.r14s.pond.controller;

import net.r14s.pond.record.Fish;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pond")
public class PondController {

	@GetMapping("/fish")
	public Fish goFish() {
		return new Fish("Catfish", 2.4);
	}

}

