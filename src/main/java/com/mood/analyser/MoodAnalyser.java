package com.mood.analyser;

import com.mood.analyser.MoodAnalysisException.ExceptionType;

public class MoodAnalyser {
	public String msg;
	public MoodAnalyser()
	{
		
	}
	public MoodAnalyser(String msg)
	{
		this.msg=msg;
	}
	public String analyseMood() throws MoodAnalysisException{
		try {
		if(msg.length()==0)
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please enter valid mood");
			
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
			//System.out.println("NULL Exception thrown");
			//return "HAPPY";
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please enter valid mood");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Mood analyser");
		//MoodAnalyser moodAnalyse = new MoodAnalyser("I am Sad in mood");
		//System.out.println(moodAnalyse.analyseMood());
		
	}
}
