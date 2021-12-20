package com.example.exam;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExamController {
    private final ExamService examService;

    @GetMapping("/")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("Hello from Bohdan Khomik");
    }

    @GetMapping("/{month}/{number}")
    public ResponseEntity<?> takeResult(@PathVariable String month, @PathVariable String number) {
        return ResponseEntity.ok(examService.myFucn(month, number));
    }
}
