package com.mood.analyser;
import org.junit.*;
import org.junit.rules.ExpectedException;
public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am Sad in mood");
			String mood = null;
			try {
				mood = moodAnalyser.analyseMood();
			} catch (MoodAnalysisException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertEquals("SAD", mood);
		}
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am Happy in mood");
			String mood = null;
			try {
				mood = moodAnalyser.analyseMood();
			} catch (MoodAnalysisException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertEquals("HAPPY", mood);
		}
	@Test
	public void givenMessage_WhenNULL_ShouldReturnHappy() {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			String mood=null;
			try {
				ExpectedException exceptionRule = ExpectedException.none();
				exceptionRule.expect(MoodAnalysisException.class);
				mood = moodAnalyser.analyseMood();
				Assert.assertEquals("HAPPY", mood); // won't get executed
			} catch (MoodAnalysisException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	@Test
	public void givenMessage_WhenNULL_ShouldThrowsException() {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			String mood=null;
			try {
				mood = moodAnalyser.analyseMood();
			} catch (MoodAnalysisException e) {
				e.printStackTrace();
			}
		}
		
}


