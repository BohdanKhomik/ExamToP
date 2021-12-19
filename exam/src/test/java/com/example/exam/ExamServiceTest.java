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
    void whenThenSuccess() {
        String PARAM_1 = "12";
        String PARAM_2 = "VALUE";

        String actualResult = examService.doThat(PARAM_1, PARAM_2);
        System.out.println(actualResult);
        //String expectedResult = "";
        //assertEquals(actualResult, expectedResult);
    }

    @Test
    void whenThenFail() {
        String PARAM_1 = "Iata";
        String PARAM_2 = "VALUE";

        String actualResult = examService.doThat(PARAM_1, PARAM_2);
        //System.out.println(actualResult);
        String expectedResult = "For input string: \"Iata\"";
        assertEquals(actualResult, expectedResult);
        assertNotNull(actualResult);
        assertDoesNotThrow(() -> examService.doThat(PARAM_1, PARAM_2));


        //assertFalse(need to be fasle);
        //assertNull(need to be null);
        //assertThrows(NumberFormatException.class, () -> examService.doThat(PARAM_1, PARAM_2));
    }




}
