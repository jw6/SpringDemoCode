package com.code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// add new fields for emailedAddress and team
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: insided setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String email) {
		System.out.println("CricketCoach: inside setTeam");
		this.team = email;
	}

	public CricketCoach() {
		System.out.println("CricketCoach: inside no-args constructor");
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	// setter method 
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
