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
		try {
		if(msg.contains("Sad")) {
			System.out.println("SAD");
			return "SAD";
			}
		else {
			System.out.println("HAPPY");
			return "HAPPY";
		}
		}
		catch(NullPointerException e){
			System.out.println("NULL Exception thrown");
			return "HAPPY";
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Mood analyser");
		//MoodAnalyser moodAnalyse = new MoodAnalyser("I am Sad in mood");
		//System.out.println(moodAnalyse.analyseMood());
		
	}
}
