package com.kth.mssage.info.web.controller.util;

import java.nio.file.Files;
import java.nio.file.Path;

public class JsonReader {

    public static String TEST_ROOT_PATH = "C:\\Users\\TaeHyun\\IdeaProjects\\message-agent\\api\\src\\test\\resources\\";
    public static String readJsonFile(String filePath) throws Exception {
        return new String(Files.readAllBytes(Path.of(TEST_ROOT_PATH + filePath)));
    }
}
