package com.mood.analyser;
import org.junit.*;
import org.junit.rules.ExpectedException;
public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			String mood;
			mood = moodAnalyser.analyseMood("I am in Sad Mood");
			Assert.assertEquals("SAD", mood);
		}
		
}


