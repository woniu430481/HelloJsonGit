package com.qf.entity;

public class Score {
    private double englishScore;
    private double mathScore;


    @Override
    public String toString() {
        return "Score{" +
                "englishScore=" + englishScore +
                ", mathScore=" + mathScore +
                '}';
    }

    public Score() {
    }

    public Score(double englishScore, double mathScore) {
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }
}
