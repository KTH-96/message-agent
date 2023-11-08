package com.kth.mssage.info.web.controller;

import com.kth.mssage.info.web.dto.request.RequestInfoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/info")
@RestController
public class InfoController {

    @GetMapping("/message")
    public ResponseEntity<String> requestMessageInfo(@RequestBody RequestInfoDto requestInfoDto) {
        return ResponseEntity.ok("성공 or 실패 메세지");
    }
}
