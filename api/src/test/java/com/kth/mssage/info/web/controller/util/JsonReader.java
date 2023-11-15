package com.kth.mssage.info.web.controller.util;


import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class JsonReader {

    public static String readJsonFile(String fileName) throws IOException {
        ClassPathResource classPathResource = new ClassPathResource(fileName);
        byte[] bytes = FileCopyUtils.copyToByteArray(classPathResource.getInputStream());
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
