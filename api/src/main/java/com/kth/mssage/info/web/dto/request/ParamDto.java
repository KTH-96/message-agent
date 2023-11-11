package com.kth.mssage.info.web.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.kth.mssage.info.web.dto.request.skill.WeatherDto;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@JsonTypeInfo(
        use = Id.NAME,
        include = As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "날씨", value = WeatherDto.class)
})

@Getter
@SuperBuilder
public class ParamDto {

    private final String type;

    @JsonCreator
    public ParamDto(@JsonProperty("type") String type) {
        this.type = type;
    }
}
