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
     *           - Handling Exceptions by using Customized Exceptions
     *
     * @return sad if message contains sad else false
     */
    public String analyseMood() throws MoodAnalysisException {

        String messageForEmptyString = "Message is Empty,Please enter valid message";
        String messageForNullString = "Message is Null,Please enter valid message";

        try {

            if(message.length() == 0)
                throw new MoodAnalysisException(messageForEmptyString,MoodAnalysisException.TypeOfException.ENTERED_EMPTY);
            else if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";

        } catch (NullPointerException e) {

            throw new MoodAnalysisException(messageForNullString,MoodAnalysisException.TypeOfException.ENTERED_NULL);

        }

    }
}