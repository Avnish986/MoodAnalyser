package com.mood.analyser;
import org.junit.*;
import org.junit.rules.ExpectedException;
public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am Sad in mood");
			String mood;
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("SAD", mood);
		}
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am Happy in mood");
			String mood;
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		}
	@Test
	public void givenMessage_WhenNULL_ShouldReturnHappy() {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			String mood=null;
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		}
		
}


