package com.example.exam;

import org.springframework.stereotype.Service;

@Service
public class ExamService {
    public String doThat(String param1, String param2) {
        int a;

        try {
            a = Integer.parseInt(param1);
        } catch (NumberFormatException e) {
            return e.getMessage();
        }

        return "Result: " + a + param2;
    }
}
