package com.kth.mssage.info.web.dto.response;

import com.kth.mssage.info.InfoConstant;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResponseResultDto {

    private final String version = InfoConstant.CHATBOT_ANSWER_VERSION;
    private final TemplateDto template;

    public static ResponseResultDto createResultMessage(TemplateDto templateDto) {
        return ResponseResultDto.builder()
                .template(templateDto)
                .build();
    }
}
