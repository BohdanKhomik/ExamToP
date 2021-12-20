package com.example.exam;

import org.springframework.stereotype.Service;

@Service
public class ExamService {
    public String myFucn(String month, String number) {
        int a;
        int b;
        try {
            a = Integer.parseInt(month);
            b = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return e.getMessage();
        }

        return "Number of weeks : " + (a * 30 + b) / 7;
    }
}
