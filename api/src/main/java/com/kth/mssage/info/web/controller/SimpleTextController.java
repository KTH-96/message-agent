package com.kth.mssage.info.web.controller;

import com.kth.mssage.info.web.dto.request.RequestActionDto;
import com.kth.mssage.info.web.dto.request.skill.WeatherDto;
import com.kth.mssage.info.web.dto.response.ResponseResultDto;
import com.kth.mssage.info.web.dto.response.TemplateDto;
import com.kth.mssage.info.web.dto.response.skill.simpletext.SimpleTextDto;
import com.kth.mssage.info.web.dto.response.skill.simpletext.SimpleTextContentDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/simple-text")
@RestController
public class SimpleTextController {

    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping("/message")
    public ResponseResultDto requestMessageInfo(@RequestBody RequestActionDto requestActionDto) {
        WeatherDto weatherDto = (WeatherDto) requestActionDto.getAction().getParamDto();

        SimpleTextContentDto textDto = SimpleTextContentDto.builder()
                .text(weatherDto.getLocation() + " 날씨가 좋아요")
                .build();

        SimpleTextDto simpleTextDto = SimpleTextDto.builder()
                .simpleText(textDto)
                .build();

        TemplateDto<SimpleTextDto> templateDto = TemplateDto.<SimpleTextDto>builder()
                .build();

        templateDto.addOutput(simpleTextDto);

        return ResponseResultDto.createResultMessage(templateDto);
    }
}
