package com.mood.analyser;

public class MoodAnalyser {
	public String msg;
	public MoodAnalyser()
	{
		
	}
	public MoodAnalyser(String msg)
	{
		this.msg=msg;
	}
	public String analyseMood(){
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
		//MoodAnalyser moodAnalyse = new MoodAnalyser("I am Sad in mood");
		//System.out.println(moodAnalyse.analyseMood());
		
	}
}
