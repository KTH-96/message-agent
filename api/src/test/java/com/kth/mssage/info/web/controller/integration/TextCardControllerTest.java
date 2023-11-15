package com.kth.mssage.info.web.controller.integration;

import com.kth.mssage.info.web.controller.util.JsonReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class TextCardControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private String jsonRequest;
    private String jsonResponse;

    @BeforeEach
    public void setup() throws Exception {
        jsonRequest = JsonReader.readJsonFile("__files\\payload\\chatbot-message-request.json");
        jsonResponse = JsonReader.readJsonFile("__files\\payload\\text-card-message-response.json");
    }

    @Test
    public void testTextCardController() throws Exception {
        mockMvc.perform(post("/text-card/message")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonRequest))
                .andExpect(status().isOk())
                .andExpect(content().json(jsonResponse));
    }
}
