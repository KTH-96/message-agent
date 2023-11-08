package com.kth.mssage.info.web.dto.request;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import java.util.List;


@JsonTypeInfo(
        use = Id.NAME,
        include = As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "todo", value = RequestTodoDto.class),
        @JsonSubTypes.Type(name = "weather", value = RequestWeatherDto.class)
})
public class RequestInfoDto {

    private Long memberId;
    private List<String> days;
    private String hour;
    private String minute;
}
