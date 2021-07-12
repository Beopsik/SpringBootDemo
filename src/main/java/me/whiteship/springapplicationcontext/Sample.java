package me.whiteship.springapplicationcontext;

import org.springframework.stereotype.Component;

@Component
public class Sample {
    private int date=200;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
