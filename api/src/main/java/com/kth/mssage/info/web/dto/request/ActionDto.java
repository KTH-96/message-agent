package com.kth.mssage.info.web.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ActionDto {

    private final ParamDto paramDto;

    @JsonCreator
    public ActionDto(@JsonProperty("params") ParamDto paramDto) {
        this.paramDto = paramDto;
    }
}
