package com.kth.mssage.info.web.controller;


import com.kth.mssage.info.web.dto.request.ParamDto;
import com.kth.mssage.info.web.dto.request.RequestActionDto;
import com.kth.mssage.info.web.dto.request.skill.WeatherDto;
import com.kth.mssage.info.web.dto.response.ResponseResultDto;
import com.kth.mssage.info.web.dto.response.TemplateDto;
import com.kth.mssage.info.web.dto.response.skill.textcard.TextCardButtonDto;
import com.kth.mssage.info.web.dto.response.skill.textcard.TextCardContentDto;
import com.kth.mssage.info.web.dto.response.skill.textcard.TextCardDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/text-card")
@RestController
public class TextCardController {

    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping("/message")
    public ResponseResultDto<TextCardDto> requestMessageInfo(@RequestBody RequestActionDto<ParamDto> requestActionDto) {
        WeatherDto weatherDto = (WeatherDto) requestActionDto.getAction().getParamDto();

        TextCardButtonDto textCardButtonDto = TextCardButtonDto.builder()
                .action("webLink")
                .label(weatherDto.getLocation() + "보러가기")
                .webLinkUrl("https://i.kakao.com/docs/skill-response-format#basiccard")
                .build();

        TextCardContentDto textCardContentDto = TextCardContentDto.builder()
                .title("날씨를 보여주는 text card 입니다.")
                .description("링크를 누르시면 web으로 이동됩니다.")
                .build();

        textCardContentDto.addButton(textCardButtonDto);

        TextCardDto textCardDto = TextCardDto.builder()
                .textCard(textCardContentDto)
                .build();

        TemplateDto<TextCardDto> templateDto = TemplateDto.<TextCardDto>builder()
                .build();

        templateDto.addOutput(textCardDto);

        return ResponseResultDto.createResultMessage(templateDto);
    }
}
