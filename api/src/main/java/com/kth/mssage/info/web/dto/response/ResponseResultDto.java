package com.kth.mssage.info.web.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResponseResultDto<T> {

    private final String version = "2.0";
    private final TemplateDto<T> template;

    public static <T> ResponseResultDto<T> createResultMessage(TemplateDto<T> templateDto) {
        return ResponseResultDto.<T>builder()
                .template(templateDto)
                .build();
    }
}
