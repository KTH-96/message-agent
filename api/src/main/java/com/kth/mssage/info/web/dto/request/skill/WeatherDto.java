package com.kth.mssage.info.web.dto.request.skill;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kth.mssage.info.web.dto.request.ParamDto;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class WeatherDto extends ParamDto {

    private final String location;

    @JsonCreator
    public WeatherDto(@JsonProperty("type") String type,
            @JsonProperty("location") String location) {
        super(type);
        this.location = location;
    }
}
