package com.krunal.controller;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_ToMoodAnalyser_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String message = moodAnalyser.analyseMood("I am in sad mood");
        Assert.assertThat(message, CoreMatchers.is("SAD"));
    }

    @Test
    public void givenMessage_ToMoodAnalyser_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String message = moodAnalyser.analyseMood("I am in any mood");
        Assert.assertThat(message,CoreMatchers.is("HAPPY"));
    }

}
