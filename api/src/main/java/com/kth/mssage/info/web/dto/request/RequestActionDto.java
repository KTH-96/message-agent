package com.kth.mssage.info.web.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RequestActionDto<T extends ParamDto> {

    private final ActionDto<T> action;

    @JsonCreator
    public RequestActionDto(@JsonProperty("action") ActionDto<T> action) {
        this.action = action;
    }

}
