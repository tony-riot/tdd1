package cnu.lecture.tdd2;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.StringTokenizer;

/**
 * Created by tchi on 2016. 4. 17..
 */
public class PhoneBillCalculator {
    private Grade grade;
    private int minutes;
    private int lines;

    public enum Grade {
        GOLD,
        SILVER;
    }

    public PhoneBillCalculator() {
        this.grade = Grade.GOLD;
        this.minutes = 0;
        this.lines = 1;
    }

    public void inputForCalc(Grade grade, int minutes, int lines) {
        this.grade = grade;
        this.minutes = minutes;
        this.lines = lines;
    }

    public void read() throws IOException {
        LineNumberReader reader = new LineNumberReader(new FileReader("input.txt"));
        String inputAsASingleLine = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(inputAsASingleLine);

        String grade = tokenizer.nextToken().toUpperCase();
        int minutes = Integer.parseInt(tokenizer.nextToken());
        int lines = Integer.parseInt(tokenizer.nextToken());

        inputForCalc(Grade.valueOf(grade), minutes, lines);
    }

    public float calculate() {
        throw new RuntimeException("Not implemented yet!!");
    }
}
