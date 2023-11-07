package com.kth.mssage.login.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/oauth")
@RestController
public class OauthLoginController {

    @GetMapping("/login")
    public ResponseEntity<Void> moveOauthLoginPage() {
        return ResponseEntity.status(HttpStatus.MOVED_PERMANENTLY)
                .header(HttpHeaders.LOCATION, "형식에 맞는 url")
                .build();
    }

    @GetMapping("/callback")
    public ResponseEntity<String> oauthLogin(@RequestParam String code) {
        return ResponseEntity.ok("code로 받은 토큰");
    }

}
