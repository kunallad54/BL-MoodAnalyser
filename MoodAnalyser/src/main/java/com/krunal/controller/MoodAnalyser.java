/***********************************************************************************************
 *
 * Purpose : To read message from user and return sad if message contains sad else happy
 *
 * @authtor Krunal Lad
 * @Since 30-06-2021
 *
 **********************************************************************************************/

package com.krunal.controller;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    /**
     * Purpose : To check message and return accordingly
     *           - Handles Exceptions using try catch block
     *
     * @return sad if message contains sad else false
     */
    public String analyseMood() {

        try {

            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";

        } catch (Exception e) {

            return "HAPPY";

        }

    }
}