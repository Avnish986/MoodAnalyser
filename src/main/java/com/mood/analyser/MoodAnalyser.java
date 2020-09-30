package com.mood.analyser;

public class MoodAnalyser {
	public String analyseMood(String msg){
		if(msg.contains("Sad")) {
			System.out.println("SAD");
			return "SAD";
			}
		else {
			System.out.println("HAPPY");
			return "HAPPY";
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Mood analyser");
		MoodAnalyser moodAnalyse = new MoodAnalyser();
		//System.out.println(moodAnalyse.analyseMood("i am Happy"));
	}
}
