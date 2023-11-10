package com.kth.mssage.info.web.controller;

import com.kth.mssage.info.web.dto.request.RequestActionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/info")
@RestController
public class InfoController {

    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping("/message")
    public ResponseEntity<String> requestMessageInfo(@RequestBody RequestActionDto requestActionDto) {
        return ResponseEntity.ok("성공 or 실패 메세지");
    }
}
