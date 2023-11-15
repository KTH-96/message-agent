package com.kth.mssage.info.web.controller;

import com.kth.mssage.info.web.dto.request.RequestActionDto;
import com.kth.mssage.info.web.dto.request.skill.WeatherDto;
import com.kth.mssage.info.web.dto.response.ResponseResultDto;
import com.kth.mssage.info.web.dto.response.TemplateDto;
import com.kth.mssage.info.web.dto.response.skill.SimpleTextDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/info")
@RestController
public class InfoController {

    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping("/message")
    public ResponseResultDto requestMessageInfo(@RequestBody RequestActionDto requestActionDto) {
        WeatherDto weatherDto = (WeatherDto) requestActionDto.getAction().getParamDto();

        SimpleTextDto message = SimpleTextDto.builder()
                .simpleText(weatherDto.getLocation() + " 날씨가 좋아요")
                .build();

        TemplateDto<SimpleTextDto> templateDto = TemplateDto.<SimpleTextDto>builder()
                .build();

        templateDto.addOutput(message);

        return ResponseResultDto.createResultMessage(templateDto);
    }
}
