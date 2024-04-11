package com.spring.guesstheword.guesstheword.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameService
{
    private String randomlyChosenWord = null;
    private String[] randomWords = {"mango","boy","java","string","sample","laptop"};
    Random random = new Random();
    private char[] charOfRandomlyChosenWord;

    public GameService()
    {
        randomlyChosenWord = randomWords[random.nextInt(randomWords.length)];
        System.out.println(randomlyChosenWord);
        charOfRandomlyChosenWord = new char[randomlyChosenWord.length()];
    }


    @Override
    public String toString()
    {
        String ret = "";
        for(char c : charOfRandomlyChosenWord)
        {
            if(c == '\u0000')
            {
                ret+="- ";
            }
        }
        return ret;
    }
}
