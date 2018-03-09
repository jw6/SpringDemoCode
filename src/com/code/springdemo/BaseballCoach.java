package com.code.springdemo;

public class BaseballCoach implements Coach {
	// define a private field for the dependency 
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneSerivce) {
		this.fortuneService = theFortuneSerivce;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune;
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("BaseballCoach: inside method doMyStartupStuff");
	}
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("BaseballCoach: inside method doMyCleanupStuff");
	}
}
