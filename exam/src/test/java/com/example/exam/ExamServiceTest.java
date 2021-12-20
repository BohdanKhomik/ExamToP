package com.example.exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
class ExamServiceTest {

    ExamService examService = new ExamService();

    @Test
    void whenMyFucnThenSuccess() {
        String MONTH = "1";
        String NUMBER = "5";

        String actualResult = examService.myFucn(MONTH, NUMBER);
        String expectedResult = "Number of weeks : 5";
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void whenMyFucnThenFail() {
        String MONTH = "Month";
        String NUMBER = "Day";

        String actualResult = examService.myFucn(MONTH, NUMBER);
        System.out.println(actualResult);
        String expectedResult = "For input string: \"Month\"";
        assertEquals(actualResult, expectedResult);

    }




}
