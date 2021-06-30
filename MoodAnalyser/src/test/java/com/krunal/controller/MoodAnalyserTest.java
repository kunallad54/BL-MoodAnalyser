/**
 * Purpose : To perform JUnit Testing on Mood Analyzer program
 */

package com.krunal.controller;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    // Returns SAD if message is "I am in sad mood"
    @Test
    public void givenMessage_ToMoodAnalyser_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String message = moodAnalyser.analyseMood();
        Assert.assertThat(message, CoreMatchers.is("SAD"));
    }

    // Returns Happy if message is "I am in any mood"
    @Test
    public void givenMessage_ToMoodAnalyser_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String message = moodAnalyser.analyseMood();
        Assert.assertThat(message,CoreMatchers.is("HAPPY"));
    }

    // Handles Exception
    @Test
    public void givenMessageNull_ToMoodAnalyser_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        String message = moodAnalyser.analyseMood();
        Assert.assertThat(message,CoreMatchers.is("HAPPY"));
    }
}
